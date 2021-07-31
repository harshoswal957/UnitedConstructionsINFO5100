/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.reporting;

import Business.BarChart.Report;
import Business.Customer.MasterOrderList;
import business.ecosystem.Ecosystem;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Harsh
 */
public class RevenueReportJPanel extends javax.swing.JPanel {

    private MasterOrderList mod;
    private JPanel userProcessContainer;
    private Ecosystem business;
    Report report = new Report();

    public RevenueReportJPanel(JPanel userProcessContainer, MasterOrderList mod, Ecosystem business) {
        initComponents();
        this.mod = mod;
        this.userProcessContainer = userProcessContainer;
        this.business = business;

        generateGraph();
    }

    float realtorOrderRevenue = 0;
    float customizedRevenue = 0;

    private ChartFrame generateGraph() {
       // setting values for bar graph
        DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();

        barchartdata.setValue(8.5, "Estimated Revenue", "Customized Apartment Orders");
        barchartdata.setValue(5.4, "Estimated Revenue", "Furnished Apartment Orders");

        JFreeChart barchart = ChartFactory.createBarChart("AMOUNT", "CATEGORY", "REVENUE IN MILLION", barchartdata, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot p = barchart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame chartfn = new ChartFrame("REVENUE GENERATION", barchart, true);
        // setting display report vlaues
        reportDisplayjPanel.removeAll();
        reportDisplayjPanel.add(chartfn.getChartPanel());
        reportDisplayjPanel.setVisible(true);
        return chartfn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportDisplayjPanel = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportDisplayjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reportDisplayjPanel.setLayout(new java.awt.BorderLayout());
        add(reportDisplayjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 690, 310));

        backJButton.setBackground(new java.awt.Color(204, 204, 255));
        backJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Revenue Estimates Report");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel reportDisplayjPanel;
    // End of variables declaration//GEN-END:variables

}