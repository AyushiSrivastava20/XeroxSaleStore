package UserInterface.AdminstrativeRole;

import Business.Business;
import Business.CustomerDirectory;
import Business.SalesPersonDirectory;
import Business.Supplier;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  ayushi
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private Supplier supplier;
    private Business business;
    private SalesPersonDirectory salesPersonDirectory;
    private CustomerDirectory customerDirectory;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,Business business, Supplier supplier) {
        
        initComponents();
        this.business = business;
        
        this.userProcessContainer=userProcessContainer;
        this.supplier =supplier;
        this.customerDirectory=business.getCustomerDirectory();
        this.salesPersonDirectory = business.getSalesPersonDirectory();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageCustomers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageSales1 = new javax.swing.JButton();
        managePButton = new javax.swing.JButton();
        AddSupplier = new javax.swing.JButton();
        check = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageCustomers.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnManageCustomers.setText("Manage Customers >>");
        btnManageCustomers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });
        add(btnManageCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 260, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("My Work Area -Aminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        btnManageSales1.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnManageSales1.setText("Manage SalesPerson >>");
        btnManageSales1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageSales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSales1ActionPerformed(evt);
            }
        });
        add(btnManageSales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 260, -1));

        managePButton.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        managePButton.setText("Manage Product Catalog >>");
        managePButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });
        add(managePButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 260, -1));

        AddSupplier.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        AddSupplier.setText("Add Suplier >>");
        AddSupplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSupplierActionPerformed(evt);
            }
        });
        add(AddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 260, -1));

        check.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        check.setText("Check Report>>");
        check.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
    ManageCustomer mc = new ManageCustomer(userProcessContainer, customerDirectory);
    userProcessContainer.add("ManageCustome", mc);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageSales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSales1ActionPerformed
        // TODO add your handling code here:
    ManagesalesPerson msp = new ManagesalesPerson(userProcessContainer, salesPersonDirectory);    
    userProcessContainer.add("ManageSalesPerson", msp);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSales1ActionPerformed

    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed

        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, supplier);
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePButtonActionPerformed

    private void AddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSupplierActionPerformed
        // TODO add your handling code here:
        AddSupplier as = new AddSupplier(userProcessContainer,supplier);
        userProcessContainer.add("AddSupplier", as);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_AddSupplierActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
        Report r = new Report(userProcessContainer,business);
        userProcessContainer.add("Report", r);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSupplier;
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageSales1;
    private javax.swing.JButton check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePButton;
    // End of variables declaration//GEN-END:variables
    
}
