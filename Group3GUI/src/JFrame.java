import DB.DB;

public class JFrame extends javax.swing.JFrame {

    DB myObject = new DB();
    
    public JFrame() {
        super("Virus Database");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        TFDate = new javax.swing.JTextField();
        TFCountry = new javax.swing.JTextField();
        LBDate = new javax.swing.JLabel();
        LBCountry = new javax.swing.JLabel();
        CB = new javax.swing.JComboBox<>();
        LBDisplay = new javax.swing.JLabel();
        LBOutput = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TFDate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        TFCountry.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        TFCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCountryActionPerformed(evt);
            }
        });

        LBDate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LBDate.setText("Date");

        LBCountry.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LBCountry.setText("Country");

        CB.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "global total death by date", "global current total confirmed cases per day", "global growth rate per day", "conrfirmed cases in each country on 1/22/2020", "recovered cases in each country ON 1/22/2020", "death cases in each country ON 1/22/2020" }));

        LBDisplay.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LBDisplay.setText("Result:");

        LBOutput.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LBOutput.setText(" ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Format: d/m/y Eg: 1/22/2020");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(LBDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(LBOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LBDate)
                                    .addGap(18, 18, 18)
                                    .addComponent(TFDate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(LBCountry)
                            .addGap(18, 18, 18)
                            .addComponent(TFCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBDate)
                    .addComponent(TFCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBCountry)
                    .addComponent(TFDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCountryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String date;
        String country;
        date = TFDate.getText();
        country = TFCountry.getText();
        
        myObject.setDate(date);
        myObject.setCountry(country); 
        
        if(String.valueOf(CB.getSelectedItem()) == "global total death by date"){
            LBOutput.setText(myObject.extractData(1, myObject.getDate(), myObject.getCountry()));
        }
        if(String.valueOf(CB.getSelectedItem()) == "global current total confirmed cases per day"){
            LBOutput.setText(myObject.extractData(2, myObject.getDate(), myObject.getCountry()));
        }        
        if(String.valueOf(CB.getSelectedItem()) == "global growth rate per day"){
            LBOutput.setText(myObject.extractData(3, myObject.getDate(), myObject.getCountry()));
        }  
        if(String.valueOf(CB.getSelectedItem()) == "conrfirmed cases in each country on 1/22/2020"){
            LBOutput.setText(myObject.extractData(4, myObject.getDate(), myObject.getCountry()));
        }  
        if(String.valueOf(CB.getSelectedItem()) == "recovered cases in each country ON 1/22/2020"){
            LBOutput.setText(myObject.extractData(5, myObject.getDate(), myObject.getCountry()));
        }  
        if(String.valueOf(CB.getSelectedItem()) == "death cases in each country ON 1/22/2020"){
            LBOutput.setText(myObject.extractData(6, myObject.getDate(), myObject.getCountry()));
        }          
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB;
    private javax.swing.JLabel LBCountry;
    private javax.swing.JLabel LBDate;
    private javax.swing.JLabel LBDisplay;
    private javax.swing.JLabel LBOutput;
    private javax.swing.JTextField TFCountry;
    private javax.swing.JTextField TFDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
