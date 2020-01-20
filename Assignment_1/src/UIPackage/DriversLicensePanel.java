/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import Business.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mahit
 */
public class DriversLicensePanel extends javax.swing.JPanel {

    private DriversLicenseInformation driversLicenseInformation;
    private String path;
    private Person person;
    /**
     * Creates new form DriversLicensePanel
     */
    public DriversLicensePanel(DriversLicenseInformation driversLicenseInformation,Person person) {
        initComponents();
        this.driversLicenseInformation=driversLicenseInformation;
        this.person=person;
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
        jLabel2 = new javax.swing.JLabel();
        LicenseNumberTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IssuedDateTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ExpirationDateTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BloodTypeTextField = new javax.swing.JTextField();
        UploadPictureLabel = new javax.swing.JButton();
        ImagePathTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Driver's License Information");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("License Number : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Issued Date (MM/DD/YYYY) : ");

        IssuedDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssuedDateTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Expiration Date (MM/DD/YYYY) : ");

        ExpirationDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpirationDateTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Blood type :");

        BloodTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodTypeTextFieldActionPerformed(evt);
            }
        });

        UploadPictureLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UploadPictureLabel.setText("Upload License");
        UploadPictureLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadPictureLabelActionPerformed(evt);
            }
        });

        ImagePathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagePathTextFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Save");
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
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IssuedDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExpirationDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LicenseNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UploadPictureLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImagePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LicenseNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IssuedDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ExpirationDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UploadPictureLabel)
                    .addComponent(ImagePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExpirationDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpirationDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpirationDateTextFieldActionPerformed

    private void UploadPictureLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadPictureLabelActionPerformed
        // TODO add your handling code here:
        
         JFileChooser jfl=new JFileChooser();
        jfl.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter;
        filter = new FileNameExtensionFilter("*.Images","jpg","png","gif");
        jfl.addChoosableFileFilter(filter);
        int result=jfl.showSaveDialog(null);

        if(result==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile=jfl.getSelectedFile();
             path=selectedFile.getAbsolutePath();
            ImagePathTextField.setText(path);

        }
        else if(result==JFileChooser.CANCEL_OPTION)
        { 
            ImagePathTextField.setText("No file selected");
        
        }
    }//GEN-LAST:event_UploadPictureLabelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        driversLicenseInformation.setPicture(path);
            driversLicenseInformation.setExpirationDate(ExpirationDateTextField.getText()); 
        driversLicenseInformation.setDateIssued(IssuedDateTextField.getText()); 
 driversLicenseInformation.setBloodType(BloodTypeTextField.getText());
 driversLicenseInformation.setLicenseNumber(LicenseNumberTextField.getText()); 
 person.setDriversLicenseInformation(driversLicenseInformation);
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            
JOptionPane.showMessageDialog(null,"Saved successfully");  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IssuedDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssuedDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IssuedDateTextFieldActionPerformed

    private void BloodTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodTypeTextFieldActionPerformed

    private void ImagePathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagePathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImagePathTextFieldActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BloodTypeTextField;
    private javax.swing.JTextField ExpirationDateTextField;
    private javax.swing.JTextField ImagePathTextField;
    private javax.swing.JTextField IssuedDateTextField;
    private javax.swing.JTextField LicenseNumberTextField;
    private javax.swing.JButton UploadPictureLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
