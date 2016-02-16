/*
 * ProductManagerWorkAreaJPanel.java
 *
 */
package UserInterface.CustomerRole;

import Business.Business;
import Business.Customer;
import Business.MasterOrderCatalog;
import Business.SalesPerson;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

private JPanel userProcessContainer;
private Customer customer;
private Business business;



    /** Creates new form ProductManagerWorkAreaJPanel */
    public CustomerWorkAreaJPanel(JPanel userProcessContainer,Customer customer, Business business ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customer=customer;
        this.business = business;
        
                
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        browseJButton = new javax.swing.JButton();
        checkstatus = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("My Work Area (Customer Person Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        browseJButton.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        browseJButton.setText("Browse Product and Place Order>>");
        browseJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        browseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseJButtonActionPerformed(evt);
            }
        });
        add(browseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 310, -1));

        checkstatus.setFont(new java.awt.Font("Calibri", 3, 17)); // NOI18N
        checkstatus.setText("Check Status of Placed Order>>");
        checkstatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkstatusActionPerformed(evt);
            }
        });
        add(checkstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 310, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void browseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseJButtonActionPerformed
        // TODO add your handling code here:
        BrowseProducts panel = new BrowseProducts(userProcessContainer, customer, business); 
        userProcessContainer.add("BrowseProducts", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_browseJButtonActionPerformed

    private void checkstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkstatusActionPerformed
        // TODO add your handling code here:
        StatusOrder so  = new StatusOrder(userProcessContainer, customer, business); 
        userProcessContainer.add("BrowseProducts", so);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkstatusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseJButton;
    private javax.swing.JButton checkstatus;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
