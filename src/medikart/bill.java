/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medikart;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author naman
 */
public class bill extends javax.swing.JFrame {

    /**
     * Creates new form bill
     */
    String st;
    int v;
    int m=1;
   int a,b,n,mid;
   String name;
    JFrame jf;
    public bill(int a,int b,int n,String name,int mid,JFrame jf) {
        initComponents();
        setSize(1366, 768);
        jPanel1.setBounds(0, 0, 1366, 768);
        jPanel2.setBounds(0, 0, 1366, 768);
        jPanel3.setVisible(false);
        jLabel3.setBounds(200, 0, 1000, 300);
        jLabel1.setBounds(100, 200, 200, 300);
        jLabel2.setBounds(100, 400, 200, 300);
        jButton1.setBounds(700, 300, 200, 100);
        jButton2.setBounds(700, 500, 200, 100);
        jTextField1.setBounds(400, 330, 280, 40);
         jPanel4.setVisible(false);
         jButton5.setBounds(20, 20, 100, 100);
         jPanel2.add(jButton5);
                 
        this.a=a;
        this.b=b;
        this.n=n;
        this.mid=mid;
        this.name=name;
        this.jf=jf;
        jTextField1.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent fe) {
               jTextField1.setText("");
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void focusLost(FocusEvent fe) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Existing User");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 40, 153, 29);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("New User");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 80, 108, 29);

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(120, 140, 59, 23);

        jButton2.setText("Enter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(100, 60, 59, 23);

        jTextField1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField1.setText("Enter Customer_id");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(30, 150, 220, 35);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medikart/icon1.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-3, 11, 900, 213);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 90, 230, 200);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Customer Name");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(25, 39, 182, 29);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Phone");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(35, 85, 74, 29);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Address");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(35, 135, 95, 29);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Email");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(35, 190, 64, 29);

        jTextField2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel3.add(jTextField2);
        jTextField2.setBounds(254, 36, 6, 35);

        jTextField3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel3.add(jTextField3);
        jTextField3.setBounds(254, 82, 6, 35);

        jTextField4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel3.add(jTextField4);
        jTextField4.setBounds(173, 129, 6, 35);

        jTextField5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel3.add(jTextField5);
        jTextField5.setBounds(150, 187, 6, 35);

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(150, 240, 65, 23);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(260, 100, 400, 320);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel9.setText("Customer Name");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 21, 165, 26);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(62, 21, 0, 0);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel11.setText("Customer ID");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 46, 127, 26);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jPanel4.add(jLabel12);
        jLabel12.setBounds(60, 46, 0, 0);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel13.setText("Medicine Name");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(10, 78, 154, 26);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(68, 78, 85, 26);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(114, 78, 85, 26);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel16.setText("Total");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(10, 100, 52, 26);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(70, 100, 85, 26);

        jButton4.setText("Buy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(80, 140, 51, 23);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medikart/icon1.jpg"))); // NOI18N
        jPanel4.add(jLabel18);
        jLabel18.setBounds(110, 40, 857, 213);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(660, 250, 190, 190);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medikart/images.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(30, 20, 90, 90);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medikart/icon1.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 20, 857, 213);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
st=jTextField1.getText();
        //System.out.println(st);
        v=Integer.parseInt(st);
        System.out.println(v);
        jPanel4.setVisible(true);
jPanel2.setVisible(false);
jPanel4.setBounds(0, 0, 1366, 768);

jLabel18.setBounds(50, 0, 1000, 300);

jLabel9.setBounds(100, 300, 400, 100);
jLabel10.setBounds(500, 330, 400, 40);

jLabel11.setBounds(100, 400, 400, 100);
jLabel12.setBounds(500, 430, 400, 40);

jLabel13.setBounds(100, 500, 400, 100);
jLabel14.setBounds(500, 530, 400, 40);

jLabel16.setBounds(100, 600, 400, 100);
jLabel17.setBounds(500, 630, 400, 40);
jLabel14.setText(name);
jLabel17.setText(b+"");
jLabel15.setText(n+"");
jLabel12.setText(v+"");
//jLabel10.setText("helooo");

jLabel15.setBounds(800, 530, 400, 40);
jButton4.setBounds(1000, 530, 150, 50);
access7 obj1 = new access7(v);
obj1.query();
        try {
            obj1.rs.next();
jLabel10.setText(obj1.rs.getString("customer_name"));
        } catch (Exception e) {
        }


       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jPanel3.setVisible(true); 
jPanel2.setVisible(false);
jPanel3.setBounds(0, 0, 1366, 768);
jLabel8.setBounds(100, 0, 1100, 300);

jLabel4.setBounds(100, 300, 400, 100);
jTextField2.setBounds(500, 330, 400, 40);

jLabel5.setBounds(100, 400, 400, 100);
jTextField3.setBounds(500, 430, 400, 40);

jLabel6.setBounds(100, 500, 400, 100);
jTextField4.setBounds(500, 530, 400, 40);

jLabel7.setBounds(100, 600, 400, 100);
jTextField5.setBounds(500, 630, 400, 40);
jButton3.setBounds(1000, 550, 150, 50);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
ArrayList<String> arst=new ArrayList<>();
arst.add(jTextField2.getText());// TODO add your handling code here:
arst.add(jTextField3.getText());// TODO add your handling code here:
arst.add(jTextField4.getText());// TODO add your handling code here:
arst.add(jTextField5.getText());
access5 obj=new access5(arst);
v=obj.query();
        System.out.println(v);
jPanel4.setVisible(true);
jPanel2.setVisible(false);
jPanel3.setVisible(false);
jPanel4.setBounds(0, 0, 1366, 768);

jLabel18.setBounds(50, 0, 1000, 300);

jLabel9.setBounds(100, 300, 400, 100);
jLabel10.setBounds(500, 330, 400, 40);

jLabel11.setBounds(100, 400, 400, 100);
jLabel12.setBounds(500, 430, 400, 40);

jLabel13.setBounds(100, 500, 400, 100);
jLabel14.setBounds(500, 530, 400, 40);

jLabel16.setBounds(100, 600, 400, 100);
jLabel17.setBounds(500, 630, 400, 40);
jLabel15.setBounds(800, 530, 400, 40);
jButton4.setBounds(1000, 530, 150, 50);
jLabel14.setText(name);
jLabel17.setText(b+"");
jLabel15.setText(n+"");
jLabel12.setText(v+"");
access7 obj1 = new access7(v);
obj1.query();
        try {
            obj1.rs.next();
jLabel10.setText(obj1.rs.getString("customer_name"));
        } catch (Exception e) {
        }


// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   access6 obj2 = new access6(v,mid,n,b) ;
   obj2.query();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        jf.setVisible(true);
         
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new bill(5,4).setVisible(true);
//            }
//      });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
