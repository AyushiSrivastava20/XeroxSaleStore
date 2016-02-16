/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminstrativeRole;

import Business.Business;
import Business.Customer;
import Business.Order;
import Business.OrderItem;
import Business.Product;
import Business.SalesPerson;
import java.awt.CardLayout;
import java.util.Collections;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushi
 */
public class Report extends javax.swing.JPanel {

    /**
     * Creates new form Report
     */
    private JPanel userProcessContainer;
    private Business business;
    
    public Report(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateSalesPerson();
        populateProduct();
        populateCustomer();
        populateSal();
    }
    
    public void populateSalesPerson() {
        for (SalesPerson sp : business.getSalesPersonDirectory().getSalesPersonList()) {
            for (Order order : business.getMasterOrderCatalog().getOrderCatalog()) {
                if (order.getSalesPerson()==sp) {
                    int sum = 0;
                    sum = sum + order.getOrderTotal();
                    sp.setTotalRevenue(sum);
                }
            }
        }
        
        Collections.sort(business.getSalesPersonDirectory().getSalesPersonList());
        
        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();
        model.setRowCount(0);
        
        for (int j = 0; j < 3; j++) {
            SalesPerson sp = business.getSalesPersonDirectory().getSalesPersonList().get(j);
            Object row[] = new Object[2];
            row[0] = sp;
            row[1] = sp.getTotalRevenue();
            model.addRow(row);
            
        }
        
    }
    
    public void populateProduct() {
        for (Product p : business.getSupplier().getProductCatalog().getProductcatalog()) {
            int sum = 0;
            
            for (Order order : business.getMasterOrderCatalog().getOrderCatalog()) {
                for (OrderItem oi : order.getOrderItemList()) {
                    if (oi.getProduct().equals(p)) {
                        
                        sum = sum + oi.getQuantity();
                        p.setTemp(sum);
                    }
                }
            }
            
        }
        Collections.sort(business.getSupplier().getProductCatalog().getProductcatalog());
        
        Product p = business.getSupplier().getProductCatalog().getProductcatalog().get(0);
        topProduct.setText(p.getProdName());
        
    }
    
    public void populateCustomer() {
        for (Customer c : business.getCustomerDirectory().getCustomerList()) {
            for (Order order : business.getMasterOrderCatalog().getOrderCatalog()) {
                if (order.getCustomer().equals(c)) {
                    int sum = 0;
                    sum = sum + order.getOrderTotal();
                    c.setTemp1(sum);
                }
            }
        }        
        Collections.sort(business.getCustomerDirectory().getCustomerList());
        Customer c = business.getCustomerDirectory().getCustomerList().get(0);
        topCustomer.setText(c.getName());
        
    }

    public void populateSal() {
        
        
        
        for (SalesPerson sp : business.getSalesPersonDirectory().getSalesPersonList()) {
            int atp = 0;
        int btp = 0;
        float commission = 0;
            for (Order order : business.getMasterOrderCatalog().getOrderCatalog()) {
                if (order.getSalesPerson().equals(sp)) {
                    for (OrderItem oi : order.getOrderItemList()) {
                        if (oi.getCustomerPrice() >= oi.getProduct().getTargetPrice()) {
                            atp = atp + oi.getQuantity();
                            commission+=0.15*oi.getCustomerPrice()*oi.getQuantity();
                            sp.setTargetSold(atp);
                            sp.setCommission(commission);
                        } else {
                            btp = btp + oi.getQuantity();
                            sp.setBelowTarget(btp);
                            commission+=0.1*oi.getCustomerPrice()*oi.getQuantity();
                            sp.setCommission(commission);
                        }
                        
                    }
                }
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) perTable.getModel();
        model.setRowCount(0);
        
        for(SalesPerson sp : business.getSalesPersonDirectory().getSalesPersonList()){
            Object row[] = new Object[4];
            row[0] = sp;
            row[1] = sp.getTargetSold(); 
            row[2] = sp.getBelowTarget();
            row[3] = sp.getCommission();
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        topCustomer = new javax.swing.JTextField();
        topProduct = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        perTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Reports");

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel2.setText("Top 3 Sales Person");

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel3.setText("Top Customers");

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel4.setText("Top Products");

        salesTable.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sales Person", "Total Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salesTable);

        backJButton.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        topCustomer.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        topCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topCustomerActionPerformed(evt);
            }
        });

        topProduct.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N

        perTable.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        perTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person", "Products Sold Above Target", "Product Sold below Target Price", "Total Commission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(perTable);

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel5.setText("Sales Person Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(topCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(topProduct)))
                            .addComponent(backJButton)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(topCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(topProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(backJButton)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void topCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable perTable;
    private javax.swing.JTable salesTable;
    private javax.swing.JTextField topCustomer;
    private javax.swing.JTextField topProduct;
    // End of variables declaration//GEN-END:variables

}
