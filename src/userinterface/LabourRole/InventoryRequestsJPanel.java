/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabourRole;

import business.enterprise.Enterprise;
import business.organization.InventoryOrganization;
import business.organization.LabourOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.InventoryWorkRequest;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Harsh
 */
public class InventoryRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryRequestsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private LabourOrganization organization;

    InventoryRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = (LabourOrganization) organization;

        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        itemCountJTextField = new javax.swing.JTextField();
        requestInventoryJButton = new javax.swing.JButton();
        itemNameJTextField1 = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setBackground(new java.awt.Color(204, 204, 255));
        backJButton.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 50));

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        jLabel1.setText("Quantity");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        jLabel2.setText("Material Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("REQUESTING INVENTORY");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        itemCountJTextField.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        itemCountJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        itemCountJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCountJTextFieldActionPerformed(evt);
            }
        });
        add(itemCountJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 115, -1));

        requestInventoryJButton.setBackground(new java.awt.Color(204, 204, 255));
        requestInventoryJButton.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        requestInventoryJButton.setText("Send Inventory Request");
        requestInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestInventoryJButtonActionPerformed(evt);
            }
        });
        add(requestInventoryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 250, 50));

        itemNameJTextField1.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        itemNameJTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(itemNameJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 115, -1));

        enterpriseLabel.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        enterpriseLabel1.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        enterpriseLabel1.setText("Organization:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 26));

        orgValueLabel.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 230, 26));

        valueLabel.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 210, 26));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabourWorkRequestsJPanel dwjp = (LabourWorkRequestsJPanel) component;
        dwjp.populateDesignerWorkRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestInventoryJButtonActionPerformed
         
        String itemCount = itemCountJTextField.getText();
        String itemName = itemNameJTextField1.getText();
        InventoryWorkRequest request = new InventoryWorkRequest();
         // validating the fields of the inventory
        if (itemCount.matches("[0-9]+")) {
            request.setItemCount(Integer.parseInt(itemCount));
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a number as quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (itemName.matches("[a-zA-Z\\s]+")) {
            request.setItemName(itemName);
        } else {
            JOptionPane.showMessageDialog(null, "Material name not in format", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        request.setLabourerSenderInv(userAccount);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof InventoryOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);

        }
        JOptionPane.showMessageDialog(null, "Inventory Request sent to Inventory Staff", "Info", JOptionPane.INFORMATION_MESSAGE);
        itemCountJTextField.setText("");
        itemNameJTextField1.setText("");
    }//GEN-LAST:event_requestInventoryJButtonActionPerformed

    private void itemCountJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCountJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCountJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JTextField itemCountJTextField;
    private javax.swing.JTextField itemNameJTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton requestInventoryJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
