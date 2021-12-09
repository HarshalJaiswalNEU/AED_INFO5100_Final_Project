/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Firebase;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Hospital.Doctor;
import Business.Enterprise.Hospital.Hospital;
import Business.Enterprise.Hospital.Patient;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.Date;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @author harshaljaiswal
 */
public class FirebaseHelper {

    Firestore db;

    public FirebaseHelper() throws IOException {
        firebaseInit();
    }

    public void firebaseInit() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("./serviceAccount.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://aedproject-5100-default-rtdb.firebaseio.com")
                .build();

        try {

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            System.out.println("initilize err: " + e.toString());
        }

        this.db = FirestoreClient.getFirestore();

    }

    public void addHospitalToFirebase(Hospital hospital) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection("hospital").document(hospital.getEnterpriseName());
        // Add document data  with  using a hashmap
        //enterpriseName, registeryNumber, address, username, password
        Map<String, Object> data = new HashMap<>();
        data.put("enterpriseName", hospital.getEnterpriseName());
        data.put("registeryNumber", hospital.getRegisteryNumber());
        data.put("address", hospital.getAddress());
        data.put("username", hospital.getUsername());
        data.put("password", hospital.getPassword());
        //asynchronously write data
        ApiFuture<WriteResult> result = docRef.set(data);

        // result.get() blocks on response
        System.out.println("Update time(hospital) : " + result.get().getUpdateTime());
    }

    public void addDoctorToFirebase(Doctor doctor, String hosp) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection("doctors").document(doctor.getUname());
        // Add document data  with  using a hashmap
        Map<String, Object> data = new HashMap<>();
        //uname, pswd, id, name, add, gender, telenum, dob
        data.put("uname", doctor.getUname());
        data.put("pswd", doctor.getPswd());
        data.put("id", doctor.getId());
        data.put("name", doctor.getName());
        data.put("add", doctor.getAdd());
        data.put("gender", doctor.getGender());
        data.put("telenum", doctor.getTelenum());
        data.put("dob", doctor.getDob());
        data.put("speciality", doctor.getSpeciality());
        //asynchronously write data
        ApiFuture<WriteResult> result = docRef.set(data);

        System.out.println("Update time(doctor) : " + result.get().getUpdateTime());

        DocumentReference docRefHosp = db.collection("hospital").document(hosp);

        Map<String, Object> dataHosp = new HashMap<>();
        dataHosp.put("doctorsDirectory", FieldValue.arrayUnion(doctor));

        db.collection("hospital").document(hosp).update( dataHosp);


    }


    public String getFirebaseData() throws ExecutionException, InterruptedException {
        String res = "";
        ApiFuture<QuerySnapshot> query = db.collection("users").get();

        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            System.out.println("User: " + document.getId());
            System.out.println("First: " + document.getString("first"));
            if (document.contains("middle")) {
                System.out.println("Middle: " + document.getString("middle"));
            }
            System.out.println("Last: " + document.getString("last"));
            System.out.println("Born: " + document.getLong("born"));

            res += (document.getId() + "  " + document.getString("first") + "  " + document.getString("middle") + " | ");

        }

        return res;
    }

    public ArrayList<Hospital> getHospitalList() throws ExecutionException, InterruptedException {
        ArrayList<Hospital> hospitalArrayList = new ArrayList();
        ApiFuture<QuerySnapshot> query = db.collection("hospital").get();

        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            System.out.println("getHospitalList(): " + document.getData().toString());
            //enterpriseName, registeryNumber, address, username, password
            Map<String, Object> hospitalDocument = document.getData();
            Hospital hosp = new Hospital(hospitalDocument.get("enterpriseName").toString(),
                    hospitalDocument.get("registeryNumber").toString(), hospitalDocument.get("address").toString(),
                    hospitalDocument.get("username").toString(), hospitalDocument.get("password").toString());

            //for adding doctors list from firebase to ecosystem
            for(Object d: (List<Object>) document.get("doctorsDirectory")){
                Map<String , Object> mp= (Map<String, Object>) d;
//                uname, pswd, id, name, add, gender, telenum, dob
                Doctor doc = new Doctor(

                        mp.get("uname").toString() ,
                        mp.get("pswd").toString() ,
                        mp.get("id").toString() ,
                        mp.get("name").toString() ,
                        mp.get("add").toString() ,
                        mp.get("gender").toString() ,
                        mp.get("telenum").toString(),
                        new Date(),
                        mp.get("speciality").toString()
                );
                hosp.addDoctor(doc);
//                System.out.println( "ids "+ ((Map<?, ?>) d).get("id") );
            }

            //for adding patients list from firebase to ecosystem
            for(Object d: (List<Object>) document.get("patientDirectory")){
                Map<String , Object> mp= (Map<String, Object>) d;

//                uname, pswd, id, name, add, gender, telenum, dob
                Patient pat = new Patient(

                        mp.get("uname").toString() ,
                        mp.get("pswd").toString() ,
                        mp.get("id").toString() ,
                        mp.get("name").toString() ,
                        mp.get("add").toString() ,
                        mp.get("gender").toString() ,
                        mp.get("telenum").toString(),
                        new Date(),
                        mp.get("diagnosis").toString()
                );
                hosp.addPatient(pat);
//                System.out.println( "ids "+ ((Map<?, ?>) d).get("id") );
            }
            hospitalArrayList.add(hosp);

        }
        return hospitalArrayList;
    }

    public EcoSystem retriveSystem() {
        EcoSystem ecoSystem = new EcoSystem();

        //Get Hospitals
        ArrayList<Hospital> hospitalArrayList = null;
        try {
            hospitalArrayList = getHospitalList();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        for (Hospital h : hospitalArrayList) {
            ecoSystem.addHospital(h);
        }


        return ecoSystem;
    }

    public void addPatientToFirebase(Patient patient, String hosp) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection("patients").document(patient.getUname());
        // Add document data  with  using a hashmap
        Map<String, Object> data = new HashMap<>();
        //uname, pswd, id, name, add, gender, telenum, dob
        data.put("uname", patient.getUname());
        data.put("pswd", patient.getPswd());
        data.put("id", patient.getId());
        data.put("name", patient.getName());
        data.put("add", patient.getAdd());
        data.put("gender", patient.getGender());
        data.put("telenum", patient.getTelenum());
        data.put("dob", patient.getDob());
        data.put("diagnosis", patient.getDiagnosis());
        //asynchronously write data
        ApiFuture<WriteResult> result = docRef.set(data);

        System.out.println("Update time(patient) : " + result.get().getUpdateTime());

        DocumentReference docRefHosp = db.collection("hospital").document(hosp);

        Map<String, Object> dataHosp = new HashMap<>();
        dataHosp.put("patientDirectory", FieldValue.arrayUnion(patient));

        db.collection("hospital").document(hosp).update( dataHosp);

    }
}
