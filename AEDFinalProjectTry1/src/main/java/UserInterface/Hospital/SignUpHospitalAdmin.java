/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hospital;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Hospital.Hospital;
import Business.Firebase.FirebaseHelper;
import UserInterface.MainFrameForm;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Mayur
 */
public class SignUpHospitalAdmin extends javax.swing.JPanel {

    /**
     * Creates new form SignUpHospitalAdmin
     */
    MainFrameForm mainScreen;
    FirebaseHelper firebaseHelper;
    private EcoSystem ecoSystem;
    public SignUpHospitalAdmin(MainFrameForm mainScreen, FirebaseHelper firebaseHelper, EcoSystem ecoSystem) {
        initComponents();
        this.mainScreen = mainScreen;
        this.firebaseHelper = firebaseHelper;
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_admintitle = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lbl_uname = new javax.swing.JLabel();
        txtUsrName = new javax.swing.JTextField();
        lbl_pswd = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lbl_address = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        btn_signup = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        lbl_registeryNum = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txt_City = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txt_state = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txt_Zip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();

        lbl_admintitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_admintitle.setText("Create Admin Profile");

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_name.setText("Name:");

        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullNameKeyReleased(evt);
            }
        });

        lbl_uname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_uname.setText("Username:");

        txtUsrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsrNameActionPerformed(evt);
            }
        });

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pswd.setText("Password:");

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_address.setText("Address:");

        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });
        txtAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddKeyReleased(evt);
            }
        });

        btn_signup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_signup.setText("Sign Up");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        lbl_registeryNum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_registeryNum.setText("Registered No.:");

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        txtNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNoKeyReleased(evt);
            }
        });

        txt_City.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_City.setText("City:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        txt_state.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_state.setText("State:");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });
        txtState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStateKeyReleased(evt);
            }
        });

        txt_Zip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_Zip.setText("Zip Code:");

        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });
        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_pswd)
                                .addComponent(lbl_uname)
                                .addComponent(lbl_name)
                                .addComponent(lbl_registeryNum)
                                .addComponent(lbl_address)
                                .addComponent(txt_City)
                                .addComponent(txt_state)
                                .addComponent(txt_Zip))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(txtUsrName)
                                .addComponent(txtAdd)
                                .addComponent(txtPass)
                                .addComponent(txtNo)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_signup))
                                .addComponent(txtCity)
                                .addComponent(txtState)
                                .addComponent(txtZip)))
                        .addComponent(lbl_admintitle, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap(199, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_back, btn_signup});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl_admintitle)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_name))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUsrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_uname))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_pswd))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_registeryNum))
                            .addGap(18, 18, 18)
                            .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbl_address))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_City)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_state)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Zip))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_signup))
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_back, btn_signup});

    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void txtFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyReleased
        // TODO add your handling code here:
//        String nameconv = "^[a-zA-Z ]{1,17}$";
//        Pattern pat = Pattern.compile(nameconv);
//        Matcher mat = pat.matcher(txtFullName.getText());
//
//        if (!mat.matches()) {
//            name_chk.setText("Name is incorrect");
//        } else {
//            name_chk.setText("");
//        }
    }//GEN-LAST:event_txtFullNameKeyReleased

    private void txtUsrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsrNameActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed

    private void txtAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddKeyReleased
        // TODO add your handling code here:

//        String addrconv = "^[a-zA-Z0-9 ]{0,30}$";
//        Pattern pat = Pattern.compile(addrconv);
//        Matcher mat = pat.matcher(txtAdd.getText());
//
//        if (!mat.matches()) {
//            add_chk.setText("Address is incorrect");
//        } else {
//            add_chk.setText("");
//        }
    }//GEN-LAST:event_txtAddKeyReleased

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        String address = txtAdd.getText() + txtCity.getText() + txtState.getText() + txtZip.getText();
        Hospital hosp = new Hospital(txtFullName.getText(), txtNo.getText(), address, txtUsrName.getText(), txtPass.getText());
        System.out.println("Hospital"+hosp.getUsername());

        try {
            firebaseHelper.addHospitalToFirebase(hosp);
        } catch (Exception e) {
            System.out.println("Cant upload hospital in firebase");
        }

        ecoSystem.addHospital(hosp);

        MainFrameForm suc = new MainFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
//        if (txtFullName.getText().equals("") || txtUsrName.getText().equals("") || txtPass.getText().equals("") || txtNo.getText().equals("")
//            || txtAdd.getText().equals("") || txtCity.getText().equals("") || txtState.getText().equals("") || txtZip.getText().equals("")) {
//
//            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
//        } else if (!name_chk.getText().equals("") || !telenum_chk.getText().equals("") || !add_chk.getText().equals("") || !city_chk.getText().equals("")
//            || !state_chk.getText().equals("") || !zip_chk.getText().equals("")) {
//
//            JOptionPane.showMessageDialog(this, "Invalid value(s) entered.");
//        }
//        else{
//            Address add = new Address(txtAdd.getText(), txtCity.getText(), txtState.getText(), Integer.parseInt(txtZip.getText()));
//
//            Customer cus =new Customer(txtUsrName.getText(), txtPass.getText(), new CustomerRole(),txtNo.getText(), txtFullName.getText(), add);
//            system.addCustomer(cus);
//
//            dB4OUtil.storeSystem(system);
//            JOptionPane.showMessageDialog(this, "Customer information saved.");
//            MainJFrame cust = new MainJFrame();
//            ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
//            cust.setVisible(true);
//        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:

        //this.setVisible(false);
//        MainHospitalPage f = new MainHospitalPage(mainScreen);
//        mainScreen.add(f);
        MainFrameForm suc = new MainFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
//        MainJFrame cust = new MainJFrame();
//        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        //cust.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoKeyReleased
        // TODO add your handling code here:
//        String teleconv = "^(\\d{3}[- .]?){2}\\d{4}$";
//        Pattern pat = Pattern.compile(teleconv);
//        Matcher mat = pat.matcher(txtNo.getText());
//
//        if (!mat.matches()) {
//            telenum_chk.setText("No. is incorrect");
//        } else {
//            telenum_chk.setText("");
//        }
    }//GEN-LAST:event_txtNoKeyReleased

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
//        String cityconv = "^[a-zA-Z ]{0,30}$";
//        Pattern pat = Pattern.compile(cityconv);
//        Matcher mat = pat.matcher(txtCity.getText());
//
//        if (!mat.matches()) {
//            city_chk.setText("City is incorrect");
//        } else {
//            city_chk.setText("");
//        }
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtStateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyReleased
        // TODO add your handling code here:

//        String stateconv = "^[a-zA-Z ]{0,30}$";
//        Pattern pat = Pattern.compile(stateconv);
//        Matcher mat = pat.matcher(txtState.getText());
//
//        if (!mat.matches()) {
//            state_chk.setText("State is incorrect");
//        } else {
//            state_chk.setText("");
//        }
    }//GEN-LAST:event_txtStateKeyReleased

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtZipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyReleased
        // TODO add your handling code here:
//        String zipconv = "^[0-9]{5}$";
//        Pattern pat = Pattern.compile(zipconv);
//        Matcher mat = pat.matcher(txtZip.getText());
//
//        if (!mat.matches()) {
//            zip_chk.setText("Zipcode is incorrect");
//        } else {
//            zip_chk.setText("");
//        }
    }//GEN-LAST:event_txtZipKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_admintitle;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_registeryNum;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUsrName;
    private javax.swing.JTextField txtZip;
    private javax.swing.JLabel txt_City;
    private javax.swing.JLabel txt_Zip;
    private javax.swing.JLabel txt_state;
    // End of variables declaration//GEN-END:variables
}
