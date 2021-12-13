/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hospital.LoginPages.Admin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Hospital.Doctor;
import Business.Enterprise.Hospital.Hospital;
import Business.Enterprise.Hospital.Patient;
import Business.Organization.DonateEntity;
import UserInterface.MainFrameForm;
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author harshaljaiswal
 */
public class AdminDonateOrgan extends javax.swing.JPanel {

    /**
     * Creates new form AdminDonateOrgan
     */
    MainFrameForm mainScreen;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    Hospital hospital;

    public AdminDonateOrgan(MainFrameForm mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem, Hospital h) {
        initComponents();
        System.out.println("AdminDonateOrg() init");
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
        this.hospital = h;
        
        for (Doctor d : ecoSystem.getDoctordirectory()) {

            if (d.getHospname().equals(hospital.getEnterpriseName())) {
                doctorList.addItem(d.getUname());
            }

        }
        
        for(Patient pa : ecoSystem.getPatientdirectory() ){
            if( pa.getHospname().equals(hospital.getEnterpriseName())){
                patList.addItem(pa.getUname());
            }
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        doctorList = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        patList = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bg = new javax.swing.JTextField();
        entity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Doctor:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 87, -1, -1));

        doctorList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jPanel1.add(doctorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 83, 131, -1));

        jLabel3.setText("Patient:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 126, -1, -1));

        patList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jPanel1.add(patList, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 122, 131, -1));

        jLabel4.setText("Type:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 172, -1, -1));

        jLabel5.setText("Blood Group:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 210, -1, -1));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 167, 131, -1));

        jLabel6.setText("Entity Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 259, -1, -1));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 205, 131, -1));
        jPanel1.add(entity, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 254, 131, -1));

        jButton1.setText("Add Donation Entity");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 310, 188, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Add to Organ Donation");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 33, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hospital1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DonateEntity de = new DonateEntity();
        de.setEntityName(entity.getText().toString());
        Random rand = new Random();
        de.setId( String.format("%04d", rand.nextInt(10000)));
        de.setDonorEnterprise(hospital);
        de.setBloodGroup(bg.getText().toString());
        de.setType(type.getText().toString());
        de.setDonorDoctor(ecoSystem.findDoctorByUserName(doctorList.getSelectedItem().toString()));
        de.setDonorPatient(ecoSystem.findPatientByUserName(patList.getSelectedItem().toString()));
        de.setStatus("avaliable");
//        System.out.println("dede: "+de.getDonorDoctor().getName());
        ecoSystem.addDonateEntity(de);
        
        dB4OUtil.storeSystem(ecoSystem);
        JOptionPane.showMessageDialog(this, "Entity added!");
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bg;
    private javax.swing.JComboBox<String> doctorList;
    private javax.swing.JTextField entity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> patList;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
