/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RealtorWorkArea;

import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.CustomerOrganization;
import business.organization.Organization;
import business.organization.RealtorOrganization;
import business.useraccount.UserAccount;
import business.workqueue.SelfDesignedWorkRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;

/**
 *
 * @author Harsh
 */
public class LabourWorkRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabourWorkRequestsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private RealtorOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


    public LabourWorkRequestsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization = (RealtorOrganization) organization;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.business = business;
        
        populateLabourerWorkRequestTable();
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
    }
    
     public void populateLabourerWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) labourerWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof SelfDesignedWorkRequest) {
                Object[] row = new Object[5];
                SelfDesignedWorkRequest sdwr = (SelfDesignedWorkRequest) wr;
                row[0] = sdwr;
                row[1] = sdwr.getLabourerSender()== null ? null : sdwr.getLabourerSender().getEmployee().getName();
                row[2] = sdwr.getRealtorReceiver() == null ? null : sdwr.getRealtorReceiver().getEmployee().getName();
                row[3] = sdwr.getRequestDate();
                row[4] = sdwr.getStatus();
                model.addRow(row);
            }
        }
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
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        labourerWorkRequestJTable = new javax.swing.JTable();
        assignJButton1 = new javax.swing.JButton();
        sendToCustomerJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setBackground(new java.awt.Color(204, 204, 255));
        backJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 40));

        enterpriseLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, -1));

        enterpriseLabel2.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel2.setText("Organization:");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        valueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 106, 30));

        orgValueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 106, 30));

        jLabel2.setFont(new java.awt.Font("Palatino", 1, 24)); // NOI18N
        jLabel2.setText("Labourer's Requests");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 400, 30));

        labourerWorkRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        labourerWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Sender", "Receiver", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(labourerWorkRequestJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 900, 140));

        assignJButton1.setBackground(new java.awt.Color(204, 204, 255));
        assignJButton1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        assignJButton1.setText("Accept Request");
        assignJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton1ActionPerformed(evt);
            }
        });
        add(assignJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 260, 43));

        sendToCustomerJButton.setBackground(new java.awt.Color(204, 204, 255));
        sendToCustomerJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        sendToCustomerJButton.setText("Mark ready for Customer");
        sendToCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToCustomerJButtonActionPerformed(evt);
            }
        });
        add(sendToCustomerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 260, 43));

        refreshJButton.setBackground(new java.awt.Color(204, 204, 255));
        refreshJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, 120, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Realtor Staff Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton1ActionPerformed
        int selectedRow = labourerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        SelfDesignedWorkRequest request = (SelfDesignedWorkRequest) labourerWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setRealtorReceiver(userAccount);
        request.setStatus("Order Completed");
        populateLabourerWorkRequestTable();
    }//GEN-LAST:event_assignJButton1ActionPerformed

    private void sendToCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToCustomerJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = labourerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }
        //adding values to the customer customized work request
        SelfDesignedWorkRequest request = (SelfDesignedWorkRequest) labourerWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Apartment Ready");
        request.setRealtorSender(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof CustomerOrganization) {
                organization.getWorkQueue().getWorkRequestList().add(request);
            }
        }
        populateLabourerWorkRequestTable();
        JOptionPane.showMessageDialog(null, "Apartment ready and order sent to Customer", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        logr.info("Ready for customer Button clicked");
    }//GEN-LAST:event_sendToCustomerJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        
        populateLabourerWorkRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable labourerWorkRequestJTable;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton sendToCustomerJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}