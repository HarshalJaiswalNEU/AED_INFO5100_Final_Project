/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab.LoginPages;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Lab.Technician;
import Business.Organization.DonateEntity;
import UserInterface.MainFrameForm;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayur
 */
public class TechLogin extends javax.swing.JPanel {

    /**
     * Creates new form TechLogin
     */
    MainFrameForm mainScreen;
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    Technician t;
    
    public TechLogin(MainFrameForm mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem, Technician t) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
        this.t = t;
        populateTable(t.getUname());
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
        lbl_title = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        blood = new javax.swing.JTextField();
        txt_report = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_report = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btn_comm = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();

        lbl_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_title.setText("Lab Technician Login");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodActionPerformed(evt);
            }
        });

        txt_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_reportActionPerformed(evt);
            }
        });

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Blood group", "Entity name", "Status", "Donor Enterprise", "Receiver Enterprise", "Patient Name", "Donor name", "Report", "ID"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jLabel1.setText("Report:");

        jLabel2.setText("Name:");

        jLabel3.setText("Blood:");

        btn_report.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_report.setText("Add Report");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        jButton9.setText("Logout");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btn_comm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_comm.setText("Search by Entity Name");
        btn_comm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commActionPerformed(evt);
            }
        });

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_search.setText("Search by Blood Group");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(lbl_title)
                            .addGap(128, 128, 128))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGap(62, 62, 62)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(btn_search))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_report, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(btn_report))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(btn_comm))))))
                .addContainerGap(491, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(209, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_comm, btn_report, btn_search, jButton9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {blood, name, txt_report});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addGap(242, 242, 242)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_report))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_comm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(227, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {blood, btn_comm, btn_report, btn_search, name, txt_report});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_reportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_reportActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void bloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        MainFrameForm suc = new MainFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btn_commActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commActionPerformed
        // TODO add your handling code here:
        populateTableName(name.getText().toLowerCase().toString());
    }//GEN-LAST:event_btn_commActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to add comment");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        String id = model.getValueAt(selectedRow, 9).toString();
//System.out.println("column count " + selectedRow);

        for (DonateEntity c : ecoSystem.getDonateEntityList()) {
            try {
                if (c.getId().equals(id)) {
                    c.setReport(txt_report.getText().toString());
                }
            } catch (Exception e) {

            }
        }

        dB4OUtil.storeSystem(ecoSystem);
        populateTable(t.getUname());
    }//GEN-LAST:event_btn_reportActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        populateTableBlood(blood.getText().toLowerCase().toString());
    }//GEN-LAST:event_btn_searchActionPerformed


      private void populateTable(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonateEntity d : ecoSystem.getDonateEntityList()) {
            
            try{
            if (d.getTechnician().getUname().matches(name)) {
                Object[] row = new Object[10];
                row[0] = d.getType();
                row[1] = d.getBloodGroup();
                row[2] = d.getEntityName();
                row[3] = d.getStatus();
                try {
                    row[4] = d.getDonorEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getReceiverEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getReceiverPatient().getName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonorPatient().getName();
                } catch (Exception e) {

                }
                row[8] = d.getReport();
                row[9] = d.getId();

                model.addRow(row);
            }
            }catch(Exception e){
                
            }

        }

    }
      
    private void populateTableBlood(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonateEntity d : ecoSystem.getDonateEntityList()) {

            if (d.getBloodGroup().toLowerCase().contains(name)) {
                Object[] row = new Object[10];
                row[0] = d.getType();
                row[1] = d.getBloodGroup();
                row[2] = d.getEntityName();
                row[3] = d.getStatus();
                try {
                    row[4] = d.getDonorEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getReceiverEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getReceiverPatient().getName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonorPatient().getName();
                } catch (Exception e) {

                }
                row[8] = d.getReport();
                row[9] = d.getId();
                model.addRow(row);
            }

        }

    }

    private void populateTableName(String name) {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (DonateEntity d : ecoSystem.getDonateEntityList()) {

            if (d.getEntityName().toLowerCase().contains(name)) {
                Object[] row = new Object[10];
                row[0] = d.getType();
                row[1] = d.getBloodGroup();
                row[2] = d.getEntityName();
                row[3] = d.getStatus();
                try {
                    row[4] = d.getDonorEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getReceiverEnterprise().getEnterpriseName();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getReceiverPatient().getName();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonorPatient().getName();
                } catch (Exception e) {

                }

                row[8] = d.getReport();
                row[9] = d.getId();
                model.addRow(row);
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blood;
    private javax.swing.JButton btn_comm;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField name;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txt_report;
    // End of variables declaration//GEN-END:variables
}
