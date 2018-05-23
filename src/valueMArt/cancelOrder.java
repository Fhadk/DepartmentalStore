/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cancelOrder.java
 *
 * Created on Jan 5, 2012, 8:05:34 PM
 */

package valueMart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FhAD khAn
 */
public class cancelOrder extends javax.swing.JFrame {

    /** Creates new form cancelOrder */
    public cancelOrder() {
        String url = "jdbc:mysql://localhost:3306/valuemart";
        String user = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();


        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        model=new javax.swing.table.DefaultTableModel(
                    new Object[][]{},new String[]{
                "Order ID","Sup Name","Sup Id","Cat Id","Order Date","Product Name","Price","Sipping Date","PayAble","Quantity","Delivery Date",

            }){
                Class [] type=new Class[]{
                    java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class
                };
                boolean[] canEdit =new boolean []{
                    false,false,false,false,false,false,false,false,false,false,false
                };
                
                public Class getColmnClass(int columnIndex){
                    return type[columnIndex];

                }
            @Override
                public boolean isCellEditable(int rowindex,int columnIndex){
                    return canEdit[columnIndex];
                }
            };

        initComponents();
        tb_order=new JTable(model);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PlaceOrder = new javax.swing.JButton();
        ManageOrder1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_order = new javax.swing.JTable();
        PlaceOrder1 = new javax.swing.JButton();
        ManageOrder2 = new javax.swing.JLabel();
        OrderId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cancel Order");

        PlaceOrder.setFont(new java.awt.Font("Forte", 1, 12)); // NOI18N
        PlaceOrder.setText("Look Up");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });

        ManageOrder1.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        ManageOrder1.setText("Cancel Order");

        tb_order.setModel(model);
        jScrollPane1.setViewportView(tb_order);

        PlaceOrder1.setFont(new java.awt.Font("Forte", 1, 12)); // NOI18N
        PlaceOrder1.setText("Exit");
        PlaceOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrder1ActionPerformed(evt);
            }
        });

        ManageOrder2.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder2.setText("Order Id");

        OrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(ManageOrder2)
                .addGap(28, 28, 28)
                .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PlaceOrder)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(PlaceOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(ManageOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ManageOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlaceOrder)
                    .addComponent(ManageOrder2))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlaceOrder1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
          String Id= OrderId.getText();
          String qry=("Select * FROM PlaceOrder where OID ='"+ Id+"'   ");
            try {
                resultset = statement.executeQuery(qry);
                while(resultset.next()){
                    String orderId=resultset.getString(1);
                    String supName=resultset.getString(2);
                    String supId=resultset.getString(3);
                    String catId=resultset.getString(4);
                    String orderDate=resultset.getString(5);
                    String productName=resultset.getString(6);
                    String prize=resultset.getString(7);
                    String shippingDate=resultset.getString(8);
                    String payAble=resultset.getString(9);
                    String quan=resultset.getString(10);
                    String devDate=resultset.getString(11);
                    model.addRow(new Object[]{orderId,supName,supId,catId,orderDate,productName,prize,shippingDate,payAble,quan,devDate});
                    model.removeRow(0);
                    statement.executeUpdate("delete FROM PlaceOrder WHERE OID='"+ orderId+"'  ");
                    JOptionPane.showMessageDialog(this, "Record Deleted");
                }
                
            } catch (Exception ex) {
               ex.getMessage();

            }
        /*try {
            statement.executeUpdate("delete FROM order where ='"+Oid+"'");
        } catch (SQLException ex) {
            Logger.getLogger(cancelOrder.class.getName()).log(Level.SEVERE, null, ex);
        }*/

}//GEN-LAST:event_PlaceOrderActionPerformed

    private void PlaceOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrder1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_PlaceOrder1ActionPerformed

private void OrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIdActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_OrderIdActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cancelOrder().setVisible(true);
            }
        });
    }
    private DefaultTableModel model;
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManageOrder1;
    private javax.swing.JLabel ManageOrder2;
    private javax.swing.JTextField OrderId;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JButton PlaceOrder1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_order;
    // End of variables declaration//GEN-END:variables

}
