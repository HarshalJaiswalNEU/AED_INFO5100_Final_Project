/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Firebase;

import Business.Enterprise.Hospital.Hospital;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;
import java.io.IOException;
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

        FirebaseApp.initializeApp(options);

        this.db = FirestoreClient.getFirestore();

    }

    public void addHospital(Hospital hospital) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection("hospital").document("alovelace");
        // Add document data  with  using a hashmap
        Map<String, Object> data = new HashMap<>();
        data.put("first", "Ada");
        data.put("last", "Lovelace");
        data.put("born", 1815);
        //asynchronously write data
        ApiFuture<WriteResult> result = docRef.set(data);

        // result.get() blocks on response
        System.out.println("Update time : " + result.get().getUpdateTime());
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

}
