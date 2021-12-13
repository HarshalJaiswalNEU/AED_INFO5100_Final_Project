/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hospital;

import Business.DB4OUtil.DB4OUtil;
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
    private DB4OUtil dB4OUtil;
    public SignUpHospitalAdmin(MainFrameForm mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
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
        lbl_registeryNum = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        txtNo = new javax.swing.JTextField();
        txt_City = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txt_state = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txt_Zip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_admintitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_admintitle.setText("Create Admin Profile");
        add(lbl_admintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 6, -1, -1));

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_name.setText("Name:");
        add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 53, -1, -1));

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
        add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 46, 210, -1));

        lbl_uname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_uname.setText("Username:");
        add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 97, -1, -1));

        txtUsrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsrNameActionPerformed(evt);
            }
        });
        add(txtUsrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 90, 210, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pswd.setText("Password:");
        add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 141, -1, -1));

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 134, 210, -1));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_address.setText("Address:");
        add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 234, -1, -1));

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
        add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 222, 210, -1));

        btn_signup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_signup.setText("Sign Up");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 413, 87, -1));

        lbl_registeryNum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_registeryNum.setText("Registered No.:");
        add(lbl_registeryNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 185, -1, -1));

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 413, 87, -1));

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
        add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 178, 210, -1));

        txt_City.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_City.setText("City:");
        add(txt_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 273, -1, -1));

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
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 266, 210, -1));

        txt_state.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_state.setText("State:");
        add(txt_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 317, -1, -1));

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
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 310, 210, -1));

        txt_Zip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_Zip.setText("Zip Code:");
        add(txt_Zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 362, -1, -1));

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
        add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 355, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hospital1.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1060, 860));
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

        ecoSystem.addHospital(hosp);
        for(Hospital h: ecoSystem.getHospitaldirectory().getHospitalList()){
            System.out.println("hosp: "+ h.getEnterpriseName());
        }
        dB4OUtil.storeSystem(ecoSystem);
        
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
    private javax.swing.JLabel jLabel1;
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
