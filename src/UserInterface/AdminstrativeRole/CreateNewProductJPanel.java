package UserInterface.AdminstrativeRole;

import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author ayushi
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Supplier supplier;
    public CreateNewProductJPanel(JPanel upc, Supplier s){
        initComponents();
        userProcessContainer = upc;
        supplier = s;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        avail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTarget = new javax.swing.JTextField();
        txtFloor = new javax.swing.JTextField();
        txtCeiling = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        btnAdd.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnAdd.setText("Add Product");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        btnBack.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, 30));

        txtName.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 160, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel4.setText("Availability");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        avail.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        add(avail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel6.setText("Target Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel7.setText("Floor Price");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel8.setText("Ceiling Price");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        txtTarget.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        txtTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTargetActionPerformed(evt);
            }
        });
        add(txtTarget, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 160, 30));

        txtFloor.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        add(txtFloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 160, 30));
        add(txtCeiling, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 160, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try{
        Product p = supplier.getProductCatalog().addProduct();
        p.setProdName(txtName.getText());
        p.setAvail(Integer.parseInt(avail.getText()));
        p.setTargetPrice(Integer.parseInt(txtTarget.getText()));
        p.setFloorPrice(Integer.parseInt(txtFloor.getText()));
        p.setCeilingPrice(Integer.parseInt(txtCeiling.getText()));
        JOptionPane.showMessageDialog(null, "Product added!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Please enter proper details", "Warning", JOptionPane.WARNING_MESSAGE);  
        }
}//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTargetActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avail;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCeiling;
    private javax.swing.JTextField txtFloor;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTarget;
    // End of variables declaration//GEN-END:variables
}
