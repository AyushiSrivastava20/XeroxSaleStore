package UserInterface;

import Business.Business;
import Business.Customer;
import Business.MasterOrderCatalog;
import Business.Product;
import Business.SalesPerson;
import Business.SalesPersonDirectory;
import Business.Supplier;

import UserInterface.AdminstrativeRole.AdminWorkAreaJPanel;
import UserInterface.CustomerRole.LoginCustomer;
import UserInterface.CustomerRole.CustomerWorkAreaJPanel;
import UserInterface.SalesRole.LoginSales;
import java.awt.CardLayout;

/**
 *
 * @author ayushi
 */
public class MainJFrame extends javax.swing.JFrame {
    
    /** Creates new form MainJFrame */
   
    private MasterOrderCatalog moc;
    private Business business;
    private Supplier supplier;
    private SalesPersonDirectory salesPersonDirectory;
    public MainJFrame() {
        initComponents();
        setSize(1000, 800);
        business = new Business();
        supplier = business.getSupplier();
        moc= business.getMasterOrderCatalog();
        salesPersonDirectory=business.getSalesPersonDirectory();
        setSize(1000, 800);
        initialization();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(150);

        btnAdmin.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnAdmin.setText("Administrator");
        btnAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnSales.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnSales.setText("SalesPerson Role");
        btnSales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });

        btnCustomer.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnCustomer.setText("Customer");
        btnCustomer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnAdmin)
                .addGap(53, 53, 53)
                .addComponent(btnSales)
                .addGap(65, 65, 65)
                .addComponent(btnCustomer)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("XeroX Sales Portal");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userProcessContainer.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed

        AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(userProcessContainer, business, supplier);
        userProcessContainer.add("AdminWorkAreaJPanel",awajp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        LoginSales ls = new LoginSales(userProcessContainer, business);
        userProcessContainer.add("LoginSales", ls);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_btnSalesActionPerformed

    
    
    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        LoginCustomer lss = new LoginCustomer(userProcessContainer, business);
        userProcessContainer.add("LoginCustomer", lss);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnCustomerActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    
     public void initialization(){
        
         Product p1 = supplier.getProductCatalog().addProduct();
         p1.setProdName("Xerox Machine");
         p1.setAvail(100);
         p1.setModelNumber(1);
         p1.setFloorPrice(1000);
         p1.setTargetPrice(1250);
         p1.setCeilingPrice(1500);
         
         Product p2 = supplier.getProductCatalog().addProduct();
         p2.setProdName("Printer");
         p2.setAvail(150);
         p2.setModelNumber(1);
         p2.setFloorPrice(500);
         p2.setTargetPrice(600);
         p2.setCeilingPrice(700);
         
         SalesPerson sp1 = salesPersonDirectory.addSalesPerson();
         sp1.setName("Ayushi");
         sp1.setSalesId(1);
         sp1.setDesignation("ASE");
         sp1.setContact("987654321");
         
          SalesPerson sp2 = salesPersonDirectory.addSalesPerson();
         sp2.setName("Mansi");
         sp2.setSalesId(1);
         sp2.setDesignation("ASE");
         sp2.setContact("987654321");
         
         Customer c1 = business.getCustomerDirectory().addCustomer();
         c1.setName("C1");
         c1.setName("Northeastern");
         c1.setOrganization("College");
         
         Customer c2 = business.getCustomerDirectory().addCustomer();
         c2.setName("C2");
         c2.setName("MIT");
         c2.setOrganization("College");
         
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnSales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

}
