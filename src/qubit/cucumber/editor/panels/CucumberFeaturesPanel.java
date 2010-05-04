/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qubit.cucumber.editor.panels;

import org.openide.util.NbPreferences;

public final class CucumberFeaturesPanel extends javax.swing.JPanel {

    private final CucumberFeaturesOptionsPanelController controller;

    CucumberFeaturesPanel(CucumberFeaturesOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        executionOptionsPanel = new javax.swing.JPanel();
        defaultRadioButton = new javax.swing.JRadioButton();
        customOptionsTextField = new javax.swing.JTextField();
        defaultOptionsTextField = new javax.swing.JTextField();
        customRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        executionOptionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.executionOptionsPanel.border.title"))); // NOI18N

        buttonGroup1.add(defaultRadioButton);
        defaultRadioButton.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(defaultRadioButton, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.defaultRadioButton.text")); // NOI18N

        customOptionsTextField.setText(org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.customOptionsTextField.text")); // NOI18N

        defaultOptionsTextField.setEditable(false);
        defaultOptionsTextField.setText(org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.defaultOptionsTextField.text")); // NOI18N

        buttonGroup1.add(customRadioButton);
        org.openide.awt.Mnemonics.setLocalizedText(customRadioButton, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.customRadioButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(CucumberFeaturesPanel.class, "CucumberFeaturesPanel.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout executionOptionsPanelLayout = new javax.swing.GroupLayout(executionOptionsPanel);
        executionOptionsPanel.setLayout(executionOptionsPanelLayout);
        executionOptionsPanelLayout.setHorizontalGroup(
            executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(executionOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(defaultRadioButton)
                    .addComponent(customRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(customOptionsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(defaultOptionsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addContainerGap())
        );
        executionOptionsPanelLayout.setVerticalGroup(
            executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(executionOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defaultRadioButton)
                    .addComponent(defaultOptionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(executionOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customOptionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(executionOptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(executionOptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void load() {
        // TODO read settings and initialize GUI
        // Example:        
        // someCheckBox.setSelected(Preferences.userNodeForPackage(CucumberFeaturesPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(CucumberFeaturesPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        defaultOptionsTextField.setText("-s");
        customOptionsTextField.setText(NbPreferences.forModule(CucumberFeaturesPanel.class).get("customOptionsTextField", ""));
        customRadioButton.setSelected(NbPreferences.forModule(CucumberFeaturesPanel.class).getBoolean("customRadioButton", false));
        //defaultOptionsTextField.setText(NbPreferences.forModule(CucumberFeaturesPanel.class).get("defaultOptions", ""));
    }

    void store() {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(CucumberFeaturesPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(CucumberFeaturesPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
        NbPreferences.forModule(CucumberFeaturesPanel.class).putBoolean("customRadioButton", customRadioButton.isSelected());
        NbPreferences.forModule(CucumberFeaturesPanel.class).put("customOptionsTextField", customOptionsTextField.getText());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField customOptionsTextField;
    private javax.swing.JRadioButton customRadioButton;
    private javax.swing.JTextField defaultOptionsTextField;
    private javax.swing.JRadioButton defaultRadioButton;
    private javax.swing.JPanel executionOptionsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
