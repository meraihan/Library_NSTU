/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lib;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sayed Mahmud Raihan
 */
public class book_return extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public book_return() {
        initComponents();
        setIcon();
        conn = DatabaseConnect.rw();
        setLocationRelativeTo(null);
        fillcomboos();
    }
    public void close(){
         WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     }
    private void fillcomboos(){
        try{
            String sql = "select * from department";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
               String name = rs.getString("short_name");
               retn_comboo.addItem(name);
            }
            pst.executeQuery();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtn_roll = new javax.swing.JTextField();
        retn_comboo = new javax.swing.JComboBox();
        rtn_session = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        rtn_output = new javax.swing.JLabel();
        date_rtn = new javax.swing.JLabel();
        std_rtn = new javax.swing.JTextField();
        call_rtn = new javax.swing.JTextField();
        acc_rtn = new javax.swing.JTextField();
        fine_comboo = new javax.swing.JComboBox();
        fine_output = new javax.swing.JLabel();
        submit_return = new javax.swing.JButton();
        exp = new javax.swing.JLabel();
        rtrn_dates = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rtn_roll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rtn_rollKeyReleased(evt);
            }
        });
        getContentPane().add(rtn_roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 188, 40));

        getContentPane().add(retn_comboo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 188, 40));
        getContentPane().add(rtn_session, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 188, 40));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 150, 40));

        rtn_output.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rtn_output.setForeground(new java.awt.Color(204, 204, 255));
        getContentPane().add(rtn_output, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 400, 240, 28));

        date_rtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date_rtn.setForeground(new java.awt.Color(204, 204, 255));
        getContentPane().add(date_rtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 460, 240, 23));

        std_rtn.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        std_rtn.setDragEnabled(true);
        getContentPane().add(std_rtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, 40));
        getContentPane().add(call_rtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 180, 40));
        getContentPane().add(acc_rtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 180, 40));

        fine_comboo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        fine_comboo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                fine_combooPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(fine_comboo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 180, 40));

        fine_output.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fine_output, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 112, 29));

        submit_return.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        submit_return.setText("Submit");
        submit_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_returnActionPerformed(evt);
            }
        });
        getContentPane().add(submit_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 457, 90, 30));

        exp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exp.setForeground(new java.awt.Color(204, 204, 255));
        getContentPane().add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 350, 240, 26));

        rtrn_dates.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(rtrn_dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 310, 180, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 455, 90, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 455, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/ret.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String sql = "select book_title,book_exp_date from book, log, student where student.member_id=log.member_id and book.call_no=log.call_no and "
                    + "student.roll_no='"+rtn_roll.getText()+"' and student.department='"+retn_comboo.getSelectedItem()+"' "
                    + "and student.session='"+rtn_session.getText()+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                String value = rs.getString("book_title");
                rtn_output.setText("Book Ttile: "+ value);
                String value1 = rs.getString("book_exp_date");
                exp.setText("Book expiration date: "+ value1);
                
            }
            pst.execute(); 
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rtn_rollKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rtn_rollKeyReleased
        try {
            String sql = "select * from student,log where student.member_id=log.member_id and roll_no=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, rtn_roll.getText());
             rs = pst.executeQuery();
                while (rs.next()) {
                    String  ad = rs.getString("return_date");
                     String nl = null;
                    if(nl==ad){
                            String add1 = rs.getString("member_id");
                            std_rtn.setText(add1);
                            String add2 = rs.getString("call_no");
                            call_rtn.setText(add2);
                            String add3 = rs.getString("accesion");
                            acc_rtn.setText(add3);
                }
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_rtn_rollKeyReleased

    private void submit_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_returnActionPerformed
        String id = std_rtn.getText();
        String call = call_rtn.getText();
        String acc = acc_rtn.getText();
        Date dt = rtrn_dates.getDate();
        if(id.length()==0 || call.length()==0 || acc.length()==0){
            JOptionPane.showMessageDialog(null, "Enter all information correcctly...!!");
        
        }else{
        
            try {
            
            String value =  ((JTextField)rtrn_dates.getDateEditor().getUiComponent()).getText();
            String value1 = fine_comboo.getSelectedItem().toString();
            String sql = "update log set return_date='"+ value +"'  ,fined='"+value1+"' where member_id='"+std_rtn.getText()+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
            
             ResultSet  rs2 = null;
            String sql1 = "select book_exp_date,return_date from log where member_id='"+std_rtn.getText()+"'";
            pst = conn.prepareStatement(sql1);
            
            rs = pst.executeQuery();
            
           while(rs.next()){
                    if(fine_comboo.getSelectedItem()=="YES"){
                            String sql2 = "select ((return_date-book_exp_date)*2) as finee from log where member_id='"+std_rtn.getText()+"'";
                             pst = conn.prepareStatement(sql2);
                            rs2 = pst.executeQuery();
                            rs2.next();
                            fine_output.setText("Fine is: "+rs2.getString("finee"));  
                     }
           }
            pst.execute();

                        
            String sql3 = "select return_date,no_of_book from book inner join log where book.call_no='"+call_rtn.getText()+"'";
            pst = conn.prepareStatement(sql3);
            ResultSet rs3 = pst.executeQuery();
            while(rs3.next()){
            String rt = null;
            String quantity = rs3.getString("no_of_book");
            String retrn = rs3.getString("return_date");
            int quan = Integer.parseInt(quantity);
            int q = 0;
            if(retrn!=rt){
                q = quan+1;
                String sql4 = "update book set no_of_book='"+q+"' where call_no='"+call_rtn.getText()+"'";
                pst = conn.prepareStatement(sql4);
                pst.execute();
            }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        }
        
    }//GEN-LAST:event_submit_returnActionPerformed

    private void fine_combooPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_fine_combooPopupMenuWillBecomeInvisible
        
        
    }//GEN-LAST:event_fine_combooPopupMenuWillBecomeInvisible

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        main_form mf = new main_form();
        mf.setVisible(true);
        close();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        rtn_output.setText("");
        exp.setText("");
        rtn_roll.setText("");
        rtn_session.setText("");
        jLabel5.setText("");
        call_rtn.setText("");
        acc_rtn.setText("");
        rtrn_dates.setDate(null);
        fine_output.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(book_return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book_return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book_return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book_return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new book_return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc_rtn;
    private javax.swing.JTextField call_rtn;
    private javax.swing.JLabel date_rtn;
    private javax.swing.JLabel exp;
    private javax.swing.JComboBox fine_comboo;
    private javax.swing.JLabel fine_output;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox retn_comboo;
    private javax.swing.JLabel rtn_output;
    private javax.swing.JTextField rtn_roll;
    private javax.swing.JTextField rtn_session;
    private com.toedter.calendar.JDateChooser rtrn_dates;
    private javax.swing.JTextField std_rtn;
    private javax.swing.JButton submit_return;
    // End of variables declaration//GEN-END:variables

    private String setString(int i, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("returnIcon.png")));
    }
}
