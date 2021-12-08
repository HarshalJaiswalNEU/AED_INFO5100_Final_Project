/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hospital;

import UserInterface.MainFrameForm;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author harshaljaiswal
 */
public class MainHospitalPage extends javax.swing.JPanel {

    /**
     * Creates new form MainHospitalPage
     */
  
MainFrameForm mainScreen;
    public MainHospitalPage(MainFrameForm mainScreen) {
         initComponents();  
this.mainScreen = mainScreen;
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Hosptitle = new javax.swing.JLabel();
        cmb_Role = new javax.swing.JComboBox<>();
        lbl_username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbl_pswd = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btnSignin = new javax.swing.JButton();
        lbl_role = new javax.swing.JLabel();

        lbl_Hosptitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Hosptitle.setText("Hospital");

        cmb_Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Nurse", "Doctor","Hospital Admin"}));
        cmb_Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_RoleActionPerformed(evt);
            }
        });

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_username.setText("Username:");

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pswd.setText("Password:");

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btnSignin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSignin.setText("Sign Up");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });

        lbl_role.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_role.setText("Role:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(lbl_Hosptitle, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(353, 353, 353)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmb_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_role)
                        .addComponent(lbl_username)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_pswd)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSignin))
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(354, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbl_Hosptitle)
                .addContainerGap(550, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(lbl_role)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cmb_Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbl_username)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbl_pswd)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_login)
                        .addComponent(btnSignin))
                    .addContainerGap(193, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_RoleActionPerformed
        // TODO add your handling code here:
        System.out.println(cmb_Role.getSelectedItem().toString());
        if (cmb_Role.getSelectedItem().toString() == "Admin") {
            btnSignin.setEnabled(false);
        } else {
            btnSignin.setEnabled(true);
        }
    }//GEN-LAST:event_cmb_RoleActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:

//        if (cmb_Role.getSelectedItem().toString() == "Doctor") {
//            Customer c = system.loginCustomer(txtUsername.getText(), txtPassword.getText());
//            if (c == null) {
//                JOptionPane.showMessageDialog(this, "Incorrect credential");
//            } else {
//                CustomerMainPage custmp = new CustomerMainPage(system, dB4OUtil, c);
//                this.setContentPane(custmp);
//                this.invalidate();
//                this.validate();
//                return;
//            }
//
//        }
//        if (cmb_Role.getSelectedItem().toString() == "Nurse") {
//            Restaurant r = system.loginResaturant(txtUsername.getText(), txtPassword.getText());
//
//            if (r == null) {
//                JOptionPane.showMessageDialog(this, "Incorrect credential");
//            } else {
//                RestaurantMainPage restmp = new RestaurantMainPage(system, dB4OUtil, r);
//                this.setContentPane(restmp);
//                this.invalidate();
//                this.validate();
//                return;
//            }
//
//        }
//
//        if (cmb_Role.getSelectedItem().toString() == "Patient") {
//            DeliveryMan r = system.loginDeliveryMan(txtUsername.getText(), txtPassword.getText());
//
//            if (r == null) {
//                JOptionPane.showMessageDialog(this, "Incorrect credential");
//            } else {
//                DeliverManMainPage delimp = new DeliverManMainPage(system, dB4OUtil, r);
//                this.setContentPane(delimp);
//                this.invalidate();
//                this.validate();
//                return;
//            }
//
//        }
//
//        if (cmb_Role.getSelectedItem().toString() == "Hospital Admin") {
//            if (txtUsername.getText().matches("a") && txtPassword.getText().matches("a")) {
//                AdminPage adminpg = new AdminPage(system, dB4OUtil);
//                this.setContentPane(adminpg);
//                this.invalidate();
//                this.validate();
//                return;
//            } else {
//                JOptionPane.showMessageDialog(this, "Incorrect credential");
//            }
//        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        // TODO add your handling code here:

        if (cmb_Role.getSelectedItem().toString() == "Doctor") {
            
//            this.setContentPane(docsign);
//            this.invalidate();
//            this.validate();
            return;

        }
        if (cmb_Role.getSelectedItem().toString() == "Nurse") {
            
//            this.setContentPane(nursesign);
//            this.invalidate();
//            this.validate();
            return;

        }

        if (cmb_Role.getSelectedItem().toString() == "Patient") {
            
//            this.setContentPane(patsign);
//            this.invalidate();
//            this.validate();
            return;

        }

        if (cmb_Role.getSelectedItem().toString() == "Hospital Admin") {
            //System.out.println("Hospital");
            SignUpHospitalAdmin s = new SignUpHospitalAdmin(mainScreen);


//suc.setVisible(true);
mainScreen.setContentPane(s);
//             this.add(s);

            mainScreen.invalidate();
            mainScreen.validate();



        }

    }//GEN-LAST:event_btnSigninActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox<String> cmb_Role;
    private javax.swing.JLabel lbl_Hosptitle;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
