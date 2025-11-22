
package com.mycompany.quiz4;

import java.util.List;


public class RideManagerUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RideManagerUI.class.getName());

    
    public RideManagerUI() {
        initComponents();
         rCar.setSelected(true);
    }
    
    private RideManager manager = new RideManager();
   
    private void clearFields() {
    jLicensePlate.setText("");
    jDriverName.setText("");
    jBaseFare.setText("");
    jDistance.setText("");
    rCar.setSelected(true);
    rMotorcycle.setSelected(false);
    rVan.setSelected(false);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        transpotationGroup = new javax.swing.ButtonGroup();
        txtLicensePlate = new javax.swing.JLabel();
        jLicensePlate = new javax.swing.JTextField();
        txtDriverName = new javax.swing.JLabel();
        jDriverName = new javax.swing.JTextField();
        jBaseFare = new javax.swing.JTextField();
        txtBaseFare = new javax.swing.JLabel();
        txtDistance = new javax.swing.JLabel();
        jDistance = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rCar = new javax.swing.JRadioButton();
        rMotorcycle = new javax.swing.JRadioButton();
        rVan = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnView = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtLicensePlate.setText("License Plate:");

        jLicensePlate.setToolTipText("");
        jLicensePlate.addActionListener(this::jLicensePlateActionPerformed);

        txtDriverName.setText("Driver Name:");

        jDriverName.addActionListener(this::jDriverNameActionPerformed);

        jBaseFare.addActionListener(this::jBaseFareActionPerformed);

        txtBaseFare.setText("Minimum Fare:");

        txtDistance.setText("Distance in Kilometer:");

        jDistance.addActionListener(this::jDistanceActionPerformed);

        jLabel2.setText("Select Vehicle");

        transpotationGroup.add(rCar);
        rCar.setText("Car");
        rCar.addActionListener(this::rCarActionPerformed);

        transpotationGroup.add(rMotorcycle);
        rMotorcycle.setText("Motorcycle");
        rMotorcycle.addActionListener(this::rMotorcycleActionPerformed);

        transpotationGroup.add(rVan);
        rVan.setText("Van");
        rVan.addActionListener(this::rVanActionPerformed);

        btnAdd.setText("Add Ride");
        btnAdd.addActionListener(this::btnAddActionPerformed);

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);
        txtOutput.getAccessibleContext().setAccessibleName("jjj");

        btnView.setText("View Rides");
        btnView.addActionListener(this::btnViewActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBaseFare)
                            .addComponent(jBaseFare, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDistance)
                            .addComponent(jDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rMotorcycle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rVan))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLicensePlate)
                                .addComponent(jLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDriverName)
                                .addComponent(jDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDriverName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLicensePlate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBaseFare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBaseFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDistance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rCar)
                    .addComponent(rMotorcycle)
                    .addComponent(rVan))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnView))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLicensePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLicensePlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLicensePlateActionPerformed

    private void jDriverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDriverNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDriverNameActionPerformed

    private void jBaseFareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaseFareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBaseFareActionPerformed

    private void jDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDistanceActionPerformed

    private void rCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rCarActionPerformed

    private void rMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMotorcycleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMotorcycleActionPerformed

    private void rVanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rVanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rVanActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    String license = jLicensePlate.getText().trim().toUpperCase();
    String driver = jDriverName.getText().trim();
    String baseFareStr = jBaseFare.getText().trim();
    String distanceStr = jDistance.getText().trim();

    if (!license.matches("[A-Z]{3}[0-9]{4}")) {
        txtOutput.setText("License Plate must be 3 letters followed by 4 numbers");
        return;
    }

    if (!driver.matches("[A-Za-z ]+")) {
        txtOutput.setText("Driver Name must contain only letters");
        return;
    }

    float baseFare;
    try {
        baseFare = Float.parseFloat(baseFareStr);
        if (baseFare <= 0) throw new NumberFormatException();
    } catch (NumberFormatException e) {
        txtOutput.setText("Minimum Fare must be a positive number");
        return;
    }

    double distance;
    try {
        distance = Double.parseDouble(distanceStr);
        if (distance <= 0) throw new NumberFormatException();
    } catch (NumberFormatException e) {
        txtOutput.setText("Distance must be a positive number");
        return;
    }

    Vehicle vehicle;
    if (rCar.isSelected()) vehicle = new Car(license, driver, baseFare);
    else if (rMotorcycle.isSelected()) vehicle = new Motorcycle(license, driver, baseFare);
    else if (rVan.isSelected()) vehicle = new Van(license, driver, baseFare);
    else {
        txtOutput.setText("Select a vehicle type");
        return;
    }

    vehicle.calculateFare(distance);
    manager.addRide((Rideable) vehicle);
    String details = "Summary\n\n" + ((Rideable) vehicle).getFareBreakdown();
    txtOutput.setText(details);
    clearFields();
    }//GEN-LAST:event_btnAddActionPerformed


    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
       
    List<String> summaries = manager.getFareSummaries();

    if (summaries.isEmpty()) {
        txtOutput.setText("No rides recorded yet.");
        return;
    }

    StringBuilder sb = new StringBuilder();
    sb.append("Summary\n\n");
    for (String s : summaries) {
        sb.append(s).append("\n\n");
    }

    txtOutput.setText(sb.toString());
    clearFields();
    }//GEN-LAST:event_btnViewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RideManagerUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField jBaseFare;
    private javax.swing.JTextField jDistance;
    private javax.swing.JTextField jDriverName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jLicensePlate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rCar;
    private javax.swing.JRadioButton rMotorcycle;
    private javax.swing.JRadioButton rVan;
    private javax.swing.ButtonGroup transpotationGroup;
    private javax.swing.JLabel txtBaseFare;
    private javax.swing.JLabel txtDistance;
    private javax.swing.JLabel txtDriverName;
    private javax.swing.JLabel txtLicensePlate;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
