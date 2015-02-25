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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sayed Mahmud Raihan
 */
public class book_borrow extends javax.swing.JFrame {

    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public book_borrow() {
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        log_id = new javax.swing.JTextField();
        log_call_no = new javax.swing.JTextField();
        log_accession = new javax.swing.JTextField();
        log_submit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        log_dpt = new javax.swing.JComboBox();
        log_session = new javax.swing.JTextField();
        log_roll = new javax.swing.JTextField();
        log_search = new javax.swing.JButton();
        date_rt = new javax.swing.JLabel();
        out_level = new javax.swing.JLabel();
        out_level1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        reg = new javax.swing.JLabel();
        log_borrow = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(log_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, 40));
        getContentPane().add(log_call_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, 40));
        getContentPane().add(log_accession, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 170, 40));

        log_submit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        log_submit.setText("Submit");
        log_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_submitActionPerformed(evt);
            }
        });
        getContentPane().add(log_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 100, 40));

        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(log_dpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, 40));
        jPanel1.add(log_session, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 40));

        log_roll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                log_rollKeyReleased(evt);
            }
        });
        jPanel1.add(log_roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 1, 150, 40));

        log_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        log_search.setText("Search");
        log_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_searchActionPerformed(evt);
            }
        });
        jPanel1.add(log_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 191, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 310, 250));

        date_rt.setBackground(new java.awt.Color(204, 255, 204));
        date_rt.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        date_rt.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(date_rt, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 351, 300, 27));

        out_level.setBackground(new java.awt.Color(0, 204, 0));
        out_level.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        out_level.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(out_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 389, 290, 30));

        out_level1.setBackground(new java.awt.Color(0, 255, 0));
        out_level1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        out_level1.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(out_level1, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 425, 290, 24));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 100, 40));

        reg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reg.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 467, 260, 28));

        log_borrow.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(log_borrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 170, 40));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 170, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 100, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/borrow.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void fillcomboos(){
        try{
            String sql = "select * from department";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
               String name = rs.getString("short_name");
               log_dpt.addItem(name);
            }
            pst.executeQuery();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void log_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_submitActionPerformed
        
        String id = log_id.getText();
        String call = log_call_no.getText();
        String acc = log_accession.getText();
        Date dt = log_borrow.getDate();
        Date dt1 = jDateChooser1.getDate();
        if(id.length()==0 || call.length()==0 || acc.length()==0 || dt.after(dt1)){
            JOptionPane.showMessageDialog(null, "Enter all information correcctly...!!");
        
        }else{
            
            
            try {
            String cno = log_call_no.getText();
            String sql = "select book_title,no_of_book from book where call_no='"+cno+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
            String quantity = rs.getString("no_of_book");
            String bok = rs.getString("book_title");
            int quan = Integer.parseInt(quantity);
            if(quan>1){
                String sql2 = "Insert into log (member_id,call_no,accesion,borrow_date,book_exp_date) values (?,?,?,?,?)";
                pst = conn.prepareStatement(sql2);
                pst.setString(1, log_id.getText());
                pst.setString(2, log_call_no.getText());
                pst.setString(3, log_accession.getText());
                pst.setString(4, ((JTextField)log_borrow.getDateEditor().getUiComponent()).getText());
                pst.setString(5, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());

                pst.execute();

                JOptionPane.showMessageDialog(null, "Borrowed");
            
            String log_call = log_call_no.getText();
            String sql3 = "select no_of_book,return_date from book inner join log where book.call_no=log.call_no";
            
            pst = conn.prepareStatement(sql3);
            ResultSet rs2 = pst.executeQuery();
            while(rs2.next()){
                String rtn = null;
                
                String nobook = rs2.getString("no_of_book");
                String rtn_d = rs2.getString("return_date");
                
                int nob = Integer.parseInt(nobook);
                int no=0;
                if(rtn_d==rtn){
                    no = nob-1;
                    String sql4 = "update book set no_of_book='"+no+"' where call_no='"+log_call+"'";
                    pst = conn.prepareStatement(sql4);
                    pst.execute();
                }
            }
            }else{
                    JOptionPane.showMessageDialog(null, "Noting left of the book:" + bok);
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }

    }//GEN-LAST:event_log_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        log_id.setText("");
         log_call_no.setText("");
         log_accession.setText("");
         log_roll.setText("");
         log_session.setText("");
         date_rt.setText("");
         out_level.setText("");
         out_level1.setText("");
         reg.setText("");
         log_borrow.setDate(null);
         jDateChooser1.setDate(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        main_form mf = new main_form();
        mf.setVisible(true);
        close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void log_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_searchActionPerformed
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String rol = log_roll.getText();
            String dpt = (String) log_dpt.getSelectedItem();
            String sess = log_session.getText();
            String sql2 = "select exp_date from student where roll_no='"+rol+"'";
            pst = conn.prepareStatement(sql2);

            rs = pst.executeQuery();
            boolean isEnter = false;
            while(rs.next()){
                isEnter = true;
                Date exp = rs.getDate("exp_date");
                Date crnt = new Date();
                System.out.println("expiration date: "+sf.format(exp));
                System.out.println("Current date: "+sf.format(crnt));
                //            if(log_session.getText()==""){
                    //                JOptionPane.showMessageDialog(null, "Enter Session.");
                    //            }
                if(exp.after(crnt)){
                    String sql = "select name,return_date,exp_date,contact_no,roll_no,session,department from student inner join log where student.member_id=log.member_id and "
                    + "student.roll_no='"+log_roll.getText()+"' and student.department='"+log_dpt.getSelectedItem()+"' "
                    + "and student.session='"+log_session.getText()+"'";
                    pst = conn.prepareStatement(sql);

                    rs = pst.executeQuery();
                    boolean isCapable = true;
                    while(rs.next())
                    {
                        String rtn_date = null;

                        String value = rs.getString("return_date");

                        String value1 = rs.getString("name");
                        String value2 = rs.getString("contact_no");
                        String value35 = rs.getString("roll_no");
                        String value36 = rs.getString("session");
                        String value37 = rs.getString("department");
                        
                        //Date cr = sf.parse("Date");
                        String myroll = log_roll.getText();
                        String mysession = log_session.getText();
                        String mydpt = (String) log_dpt.getSelectedItem();

                        if(rtn_date!=value){
                            isCapable = false;
                            date_rt.setText("Name: "+value1);
                            out_level.setText("Status: book returned on: "+value);
                            date_rt.getColorModel();

                            //                    log_id.setText(value2);

                        }else if(rtn_date==value){
                            isCapable = false;
                            date_rt.setText("Name: "+value1);
                            out_level.setText("Status: not return");
                            out_level1.setText("Mobile Number: "+ value2);

                        }
//                        else if((value35!=myroll) && (value36!=mysession) && (value37!=mydpt)){
//                            JOptionPane.showMessageDialog(null, "not register !!");
//
//                        }
//                        else{
//                            reg.setText("Not registerd !! "+value35);
//                        }

                    }
                    if(isCapable){
                        reg.setText("status: Capable of taking book.");
                        
                    }
                    pst.execute();

                }else{
                    JOptionPane.showMessageDialog(null, "Card is expired ! Please renue the card.");
                }
            }
            if(isEnter==false){
                
                JOptionPane.showMessageDialog(null, "Not Registered!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_log_searchActionPerformed

    private void log_rollKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_log_rollKeyReleased
        try {
            String sql = "select * from student where roll_no=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, log_roll.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("member_id");
                log_id.setText(add1);

            }
            //            if(roll !=(log_roll.getText())){
                //                reg.setText("Not register !!!");
                //            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_log_rollKeyReleased

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
            java.util.logging.Logger.getLogger(book_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new book_borrow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_rt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField log_accession;
    private com.toedter.calendar.JDateChooser log_borrow;
    private javax.swing.JTextField log_call_no;
    private javax.swing.JComboBox log_dpt;
    private javax.swing.JTextField log_id;
    private javax.swing.JTextField log_roll;
    private javax.swing.JButton log_search;
    private javax.swing.JTextField log_session;
    private javax.swing.JButton log_submit;
    private javax.swing.JLabel out_level;
    private javax.swing.JLabel out_level1;
    private javax.swing.JLabel reg;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("borrowIcon.png")));
    }
}
