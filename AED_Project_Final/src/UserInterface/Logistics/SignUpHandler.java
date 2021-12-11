/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Logistics;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Logistics.Handler;
import UserInterface.MainFrameForm;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mayur
 */
public class SignUpHandler extends javax.swing.JPanel {

    /**
     * Creates new form SignUpHandler
     */
    
    MainFrameForm mainScreen;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    
    public SignUpHandler(MainFrameForm mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
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
        txt_City = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txt_state = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txt_Zip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        btn_signup = new javax.swing.JButton();
        lbl_gender = new javax.swing.JLabel();
        cmb_gender = new javax.swing.JComboBox<>();
        lbl_telenum = new javax.swing.JLabel();
        txt_telenum = new javax.swing.JTextField();
        lbl_dob = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        lbl_vehname = new javax.swing.JLabel();
        txt_vehname = new javax.swing.JTextField();
        lbl_vehnum = new javax.swing.JLabel();
        txt_vehnum = new javax.swing.JTextField();

        lbl_admintitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_admintitle.setText("Create Handler Profile");

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

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_signup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_signup.setText("Sign Up");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        lbl_gender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_gender.setText("Gender:");

        cmb_gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        lbl_telenum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_telenum.setText("Phone no.:");

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

        lbl_vehname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_vehname.setText("Vehicle Name:");

        txt_vehname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vehnameActionPerformed(evt);
            }
        });
        txt_vehname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_vehnameKeyReleased(evt);
            }
        });

        lbl_vehnum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_vehnum.setText("Vehicle Number:");

        txt_vehnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vehnumActionPerformed(evt);
            }
        });
        txt_vehnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_vehnumKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl_telenum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_telenum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_admintitle)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(btn_signup))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_address)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_pswd)
                                            .addComponent(lbl_uname)
                                            .addComponent(lbl_name))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUsrName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_City, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_state))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtState)
                                            .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_Zip)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtZip)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_gender)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_vehname)
                            .addComponent(lbl_dob)
                            .addComponent(lbl_vehnum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vehname, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vehnum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(405, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAdd, txtCity});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_back, btn_signup});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_admintitle)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_uname)
                    .addComponent(txtUsrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pswd)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_address)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_City)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_state))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Zip))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_gender))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telenum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_dob))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_vehname)
                    .addComponent(txt_vehname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_vehnum)
                    .addComponent(txt_vehnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_signup))
                .addGap(294, 294, 294))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAdd, txtCity});

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

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        MainFrameForm suc = new MainFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        String address = txtAdd.getText() + txtCity.getText() + txtState.getText() + txtZip.getText();
        //uname, pswd, id, name, add, gender, telenum, dob
        //(txtFullName.getText(), txtNo.getText(), address, txtUsrName.getText(), txtPass.getText());

        Handler handler = new Handler(txtUsrName.getText(), txtPass.getText(), "idid", txtFullName.getText(), address,cmb_gender.getSelectedItem().toString(), txt_telenum.getText(), new Date(), txt_vehname.getText(),txt_vehnum.getText());

        ecoSystem.addHandler(handler);
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

    private void txt_vehnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vehnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vehnameActionPerformed

    private void txt_vehnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_vehnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vehnameKeyReleased

    private void txt_vehnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vehnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vehnumActionPerformed

    private void txt_vehnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_vehnumKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vehnumKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_signup;
    private javax.swing.JComboBox<String> cmb_gender;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_admintitle;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_telenum;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JLabel lbl_vehname;
    private javax.swing.JLabel lbl_vehnum;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUsrName;
    private javax.swing.JTextField txtZip;
    private javax.swing.JLabel txt_City;
    private javax.swing.JLabel txt_Zip;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JLabel txt_state;
    private javax.swing.JTextField txt_telenum;
    private javax.swing.JTextField txt_vehname;
    private javax.swing.JTextField txt_vehnum;
    // End of variables declaration//GEN-END:variables
}