/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hospital.LoginPages.Admin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Hospital.Doctor;
import Business.Enterprise.Hospital.Hospital;
import UserInterface.MainFrameForm;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshaljaiswal
 */
public class AdminDoctor extends javax.swing.JPanel {

    /**
     * Creates new form AdminDoctor
     */
    MainFrameForm mainScreen;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    Hospital hospital;

    public AdminDoctor(MainFrameForm mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem, Hospital h) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
        this.hospital = h;
        populateDoctorTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Manage Doctor");

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "User Name", "Speacility", "Address"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(360, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        String doctorUName = model.getValueAt(selectedRow, 1).toString();
        System.out.println(" doctor uname: " + doctorUName);
        ecoSystem.deleteDoctor(doctorUName);
        dB4OUtil.storeSystem(ecoSystem);
        populateDoctorTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void populateDoctorTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);

        for (Doctor d : ecoSystem.getDoctordirectory()) {

            if (d.getHospname().equals(hospital.getEnterpriseName())) {
                Object[] row = new Object[5];
                row[0] = d.getName();
                row[1] = d.getUname();
                row[2] = d.getSpeciality();
                row[3] = d.getAdd();
                model.addRow(row);

            }

        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
