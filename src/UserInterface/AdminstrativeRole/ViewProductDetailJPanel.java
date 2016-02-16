package UserInterface.AdminstrativeRole;

import UserInterface.AdminstrativeRole.ManageProductCatalogJPanel;
import Business.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Product product;
    public ViewProductDetailJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        txtName.setText(p.getProdName());
        txtId.setText(String.valueOf(p.getModelNumber()));
        txtAvail.setText(String.valueOf(p.getAvail()));
        txtTargetPrice.setText(String.valueOf(p.getTargetPrice()));
        txtFloorPrice.setText(String.valueOf(p.getFloorPrice()));
        txtCeiling.setText(String.valueOf(p.getCeilingPrice()));
        btnSave.setEnabled(false);
    }

   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTargetPrice = new javax.swing.JTextField();
        txtFloorPrice = new javax.swing.JTextField();
        txtCeiling = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 30));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 159, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel3.setText("Product Ceiling Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, 30));

        txtAvail.setEditable(false);
        txtAvail.setBackground(new java.awt.Color(255, 255, 255));
        txtAvail.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 159, -1));

        btnUpdate.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 160, -1));

        btnBack.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        txtId.setEnabled(false);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 159, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 30));

        btnSave.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 70, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel4.setText("Product Availability:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel6.setText("Product Target Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        jLabel7.setText("Product floor Price:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 30));

        txtTargetPrice.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        txtTargetPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTargetPriceActionPerformed(evt);
            }
        });
        add(txtTargetPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 160, 30));

        txtFloorPrice.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        txtFloorPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFloorPriceActionPerformed(evt);
            }
        });
        add(txtFloorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 272, 160, 30));

        txtCeiling.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        add(txtCeiling, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 322, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //txtId.setEditable(true);
        txtName.setEnabled(true);
        txtAvail.setEnabled(true);
        txtTargetPrice.setEnabled(true);
        txtFloorPrice.setEnabled(true);
        txtCeiling.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        product.setProdName(txtName.getText());
        product.setAvail(Integer.parseInt(txtAvail.getText()));
        product.setTargetPrice(Integer.parseInt(txtTargetPrice.getText()));
        product.setFloorPrice(Integer.parseInt(txtFloorPrice.getText()));
        product.setCeilingPrice(Integer.parseInt(txtCeiling.getText()));
        JOptionPane.showMessageDialog(null, "Store details updated Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        txtName.setEnabled(false);
        txtAvail.setEnabled(false);
        txtTargetPrice.setEnabled(false);
        txtFloorPrice.setEnabled(false);
        txtCeiling.setEnabled(false);
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtTargetPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTargetPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTargetPriceActionPerformed

    private void txtFloorPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFloorPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFloorPriceActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtCeiling;
    private javax.swing.JTextField txtFloorPrice;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTargetPrice;
    // End of variables declaration//GEN-END:variables
}
