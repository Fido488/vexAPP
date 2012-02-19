package guiFrames;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathanleitschuh
 */
public class editTeamsFrame extends javax.swing.JFrame {

    /**
     * Creates new form editTeamsFrame
     */
    public editTeamsFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        backButton = new javax.swing.JButton();
        editTeamPreferences = new javax.swing.JPanel();
        teamNameLabel = new javax.swing.JLabel();
        teamName = new javax.swing.JTextField();
        teamNumberLabel = new javax.swing.JLabel();
        teamNumber = new javax.swing.JTextField();
        teamLetter = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        locationLabel = new javax.swing.JLabel();
        robotNameLabel = new javax.swing.JLabel();
        robotName = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        javax.swing.JButton saveCloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VEX Alliance Selection App");
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        backButton.setText("<< Back");
        backButton.setToolTipText("Return to main screen.");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        getContentPane().add(backButton, gridBagConstraints);

        editTeamPreferences.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Team Preferences"));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel2Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        editTeamPreferences.setLayout(jPanel2Layout);

        teamNameLabel.setText("Team Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        editTeamPreferences.add(teamNameLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 100;
        editTeamPreferences.add(teamName, gridBagConstraints);

        teamNumberLabel.setText("Team Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        editTeamPreferences.add(teamNumberLabel, gridBagConstraints);

        teamNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 70;
        editTeamPreferences.add(teamNumber, gridBagConstraints);

        teamLetter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 2;
        editTeamPreferences.add(teamLetter, gridBagConstraints);

        saveButton.setText("Save");
        saveButton.setToolTipText("Save without closing the window");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        editTeamPreferences.add(saveButton, gridBagConstraints);

        locationLabel.setText("Location:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        editTeamPreferences.add(locationLabel, gridBagConstraints);

        robotNameLabel.setText("Robot Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        editTeamPreferences.add(robotNameLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 150;
        editTeamPreferences.add(robotName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        editTeamPreferences.add(location, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        getContentPane().add(editTeamPreferences, gridBagConstraints);

        saveCloseButton.setText("Save and Close");
        saveCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCloseButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(saveCloseButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teamNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamNumberActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        teamsListFrame teams = new teamsListFrame();
        teams.setSize(this.getWidth(), getHeight());
        teams.setLocation(this.getX(), this.getY());
        teams.setVisible(true);
        //this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCloseButtonActionPerformed
        // TODO add your handling code here:
        
        //TODO add a new team when this is pressed!
        teamsListFrame teams = new teamsListFrame();
        teams.setSize(this.getWidth(), getHeight());
        teams.setLocation(this.getX(), this.getY());
        teams.setVisible(true);
        //this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_saveCloseButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editTeamsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editTeamsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editTeamsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editTeamsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel editTeamPreferences;
    private javax.swing.JTextField location;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField robotName;
    private javax.swing.JLabel robotNameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox teamLetter;
    private javax.swing.JTextField teamName;
    private javax.swing.JLabel teamNameLabel;
    private javax.swing.JTextField teamNumber;
    private javax.swing.JLabel teamNumberLabel;
    // End of variables declaration//GEN-END:variables
}