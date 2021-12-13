/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DonorBank.LoginPages.DonorAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.DonorBank.Donor;
import Business.Enterprise.DonorBank.DonorBank;
import Business.Organization.DonateEntity;
import UserInterface.MainFrameForm;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Mayur
 */
public class DonorAdminDonateOrgan extends javax.swing.JPanel {

    /**
     * Creates new form DonorAdminDonateOrgan
     */
    MainFrameForm mainScreen;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    DonorBank donbank;
    
    public DonorAdminDonateOrgan(MainFrameForm mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem, DonorBank donbank) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
        this.donbank = donbank;
        
        for(Donor pa : ecoSystem.getDonordirectory() ){
            System.out.println("DonorAdminDonateOrgan"+pa.getDbname());
            if( pa.getDbname().equals(donbank.getEnterpriseName())){
                donlist.addItem(pa.getUname());
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

        lbl_title = new javax.swing.JLabel();
        lbl_donorname = new javax.swing.JLabel();
        lbl_enttype = new javax.swing.JLabel();
        txt_entname = new javax.swing.JTextField();
        cmb_enttype = new javax.swing.JComboBox<>();
        lbl_entname = new javax.swing.JLabel();
        lbl_bldgrp = new javax.swing.JLabel();
        txt_bldgrp = new javax.swing.JTextField();
        lbl_status = new javax.swing.JLabel();
        cmb_status = new javax.swing.JComboBox<>();
        btn_save = new javax.swing.JButton();
        donlist = new javax.swing.JComboBox<>();

        lbl_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_title.setText("Add Entity Details");

        lbl_donorname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_donorname.setText("Donor Name:");

        lbl_enttype.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_enttype.setText("Entity Type:");

        cmb_enttype.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_enttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood", "Organ" }));

        lbl_entname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_entname.setText("Entity Name:");

        lbl_bldgrp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_bldgrp.setText("Blood Group:");

        lbl_status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_status.setText("Status:");

        cmb_status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        donlist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(lbl_title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_donorname)
                                        .addComponent(lbl_enttype)
                                        .addComponent(lbl_entname))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_entname, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                        .addComponent(donlist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmb_enttype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(lbl_bldgrp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_bldgrp, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_status)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_save)
                                    .addComponent(cmb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(374, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {donlist, txt_entname});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_title)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_donorname)
                    .addComponent(donlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_enttype)
                    .addComponent(cmb_enttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_entname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_entname))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bldgrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_bldgrp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_status)
                    .addComponent(cmb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btn_save)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {donlist, txt_entname});

    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        
        DonateEntity de = new DonateEntity();
        de.setEntityName(txt_entname.getText().toString());
        de.setDonorEnterprise(donbank);
        Random rand = new Random();
        de.setId( String.format("%04d", rand.nextInt(10000)));
        de.setBloodGroup(txt_bldgrp.getText().toString());
        de.setType(cmb_enttype.getSelectedItem().toString());
        //de.setDonorDoctor(ecoSystem.findDoctorByUserName(doctorList.getSelectedItem().toString()));
        de.setDonorPatient(ecoSystem.findPatientByUserName(donlist.getSelectedItem().toString()));
        de.setStatus(cmb_status.getSelectedItem().toString());
//        System.out.println("dede: "+de.getDonorDoctor().getName());
        ecoSystem.addDonateEntity(de);
        
        dB4OUtil.storeSystem(ecoSystem);
        
        JOptionPane.showMessageDialog(this, "Entity details added.");
    }//GEN-LAST:event_btn_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cmb_enttype;
    private javax.swing.JComboBox<String> cmb_status;
    private javax.swing.JComboBox<String> donlist;
    private javax.swing.JLabel lbl_bldgrp;
    private javax.swing.JLabel lbl_donorname;
    private javax.swing.JLabel lbl_entname;
    private javax.swing.JLabel lbl_enttype;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txt_bldgrp;
    private javax.swing.JTextField txt_entname;
    // End of variables declaration//GEN-END:variables
}
