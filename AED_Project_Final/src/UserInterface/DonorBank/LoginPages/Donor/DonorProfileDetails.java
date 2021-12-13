/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DonorBank.LoginPages.Donor;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.DonorBank.Donor;
import UserInterface.MainFrameForm;

/**
 *
 * @author Mayur
 */
public class DonorProfileDetails extends javax.swing.JPanel {

    /**
     * Creates new form DonorProfileDetails
     */
    MainFrameForm mainScreen;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    Donor don;
    
    public DonorProfileDetails(MainFrameForm mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem, Donor don) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
        this.don = don;
        
        txt_name.setText(don.getName());
        txt_uname.setText(don.getUname());
        txt_asshosp.setText(don.getAdd());
        txt_telenum.setText(don.getTelenum());
        txt_dob.setText(don.getDob().toString());
        txtDonor.setText(don.getDbname());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        lbl_uname = new javax.swing.JLabel();
        txt_uname = new javax.swing.JTextField();
        lbl_asshosp = new javax.swing.JLabel();
        txt_asshosp = new javax.swing.JTextField();
        lbl_telenum = new javax.swing.JLabel();
        txt_telenum = new javax.swing.JTextField();
        lbl_dob = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        lbl_donorbnkname = new javax.swing.JLabel();
        txtDonor = new javax.swing.JTextField();

        setBackground(new java.awt.Color(54, 33, 89));

        lbltitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltitle.setText("Donor Profile Details");

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_name.setText("Name:");

        txt_name.setEditable(false);

        lbl_uname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_uname.setText("Username:");

        txt_uname.setEditable(false);

        lbl_asshosp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_asshosp.setText("Address");

        txt_asshosp.setEditable(false);

        lbl_telenum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_telenum.setText("Phone no.:");

        txt_telenum.setEditable(false);
        txt_telenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telenumActionPerformed(evt);
            }
        });
        txt_telenum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_telenumKeyReleased(evt);
            }
        });

        lbl_dob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dob.setText("Date of Birth:");

        txt_dob.setEditable(false);
        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });
        txt_dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dobKeyReleased(evt);
            }
        });

        lbl_donorbnkname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_donorbnkname.setText("Donor Bank:");

        txtDonor.setEditable(false);
        txtDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonorActionPerformed(evt);
            }
        });
        txtDonor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDonorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_donorbnkname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_dob)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_telenum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_telenum, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lbl_asshosp)
                                .addGap(18, 18, 18)
                                .addComponent(txt_asshosp, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_name)
                                    .addComponent(lbl_uname))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(357, 357, 357))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbltitle)
                        .addGap(387, 387, 387))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbltitle)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_uname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_asshosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_asshosp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telenum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_dob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_donorbnkname)
                    .addComponent(txtDonor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_telenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telenumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telenumActionPerformed

    private void txt_telenumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telenumKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telenumKeyReleased

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

    private void txt_dobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dobKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobKeyReleased

    private void txtDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonorActionPerformed

    private void txtDonorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDonorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonorKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_asshosp;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_donorbnkname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_telenum;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtDonor;
    private javax.swing.JTextField txt_asshosp;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_telenum;
    private javax.swing.JTextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
