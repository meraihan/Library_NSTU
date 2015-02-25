
package lib;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sayed Mahmud Raihan
 */
public class Entry extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public Entry() {
        super("Entry");
        setLayout(new FlowLayout());
        initComponents();
        setLocationRelativeTo(null);
//        getContentPane().setBackground(SystemColor.activeCaption);
        conn = DatabaseConnect.rw();
        Update_table();
        Update_tables();
        fillcomboo();
//        publis();
        fillcombboo();
        fillcombooo();
    }
    public void close(){
         WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     }
    private void Update_table(){
    
        try{
        String sql = "select * from publisher";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        pub_table.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
            rs.close();
            pst.close();
                
            }catch(Exception e){
            
            }
        }
    
    }
    private void Update_tables(){
    
        try{
        String sql = "select * from department";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        dept_table.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
            rs.close();
            pst.close();
                
            }catch(Exception e){
            
            }
        }
    
    }
    private void fillcomboo(){
        try{
            String sql = "select * from publisher";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
               String name = rs.getString("pub_name");
               pub_combo.addItem(name);
            }
            pst.executeQuery();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
//        finally{
//            try{
//            rs.close();
//            pst.close();
//                
//            }catch(SQLException e){
//            
//            }
//        }
    
    }
    
    private void fillcombboo(){
        try{
            String sql = "select * from department";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                String namee = rs.getString("short_name");
                dept_combo.addItem(namee);
            }
            
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
            rs.close();
            pst.close();
                
            }catch(SQLException e){
            
            }
        }
    
    }
    private void fillcombooo(){
        try{
            String sql = "select * from department";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                String name = rs.getString("short_name");
                tea_dept_comboo.addItem(name);
            }
            
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
            rs.close();
            pst.close();
                
            }catch(SQLException e){
            
            }
        }
    
    }
//    private void publis(){
//        try {
//            String sql = "select pub_id from publisher where pub_name = '"+pub_combo.getSelectedItem()+"'";
////            System.out.println(sql);
//            pst = conn.prepareStatement(sql);
//            
//            rs = pst.executeQuery();
//            String value = "";  
//            while(rs.next())
//            {
//                value = rs.getString("pub_id");
//                label_output.setText(value);
//                pst.execute();
//            }
//            
//            
//            
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        contact_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        save_btn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        degree_combo = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        dept_combo = new javax.swing.JComboBox();
        attach_btn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        gender_comboo = new javax.swing.JComboBox();
        attach_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        member_txt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        session_txt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        roll_txt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        std_issue_date = new com.toedter.calendar.JDateChooser();
        std_exp_date = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        tea_id = new javax.swing.JTextField();
        tea_name = new javax.swing.JTextField();
        tea_code = new javax.swing.JTextField();
        tea_des_combo = new javax.swing.JComboBox();
        tea_dept_comboo = new javax.swing.JComboBox();
        tea_gen_comboo = new javax.swing.JComboBox();
        tea_email = new javax.swing.JTextField();
        tea_contact = new javax.swing.JTextField();
        tea_submit_btn = new javax.swing.JButton();
        attachment = new javax.swing.JButton();
        teacher_path = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tea_exp = new com.toedter.calendar.JDateChooser();
        tea_sss = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        book_save = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        accession_txt = new javax.swing.JTextField();
        no_of_book_txt = new javax.swing.JTextField();
        call_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        book_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        athor_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        isbn_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pub_combo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        edition = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        page_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        price_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        label_output = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        publisher_name = new javax.swing.JTextField();
        pub_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        publisher_id_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pub_table = new javax.swing.JTable();
        pub_search = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        dept_txt = new javax.swing.JTextField();
        slug_txt = new javax.swing.JTextField();
        dept_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dept_table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        dept_search = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        author_id_txt = new javax.swing.JTextField();
        first = new javax.swing.JTextField();
        last = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Gender");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 360, 96, -1));
        jPanel2.add(contact_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 70, 87, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("E-Mail");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 410, 96, -1));

        save_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save_btn.setText("save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });
        jPanel2.add(save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 213, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Contact No");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 75, -1, -1));

        degree_combo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        degree_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Under Graduate", "Post Graduate" }));
        jPanel2.add(degree_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 159, -1, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Student Information");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 15, 199, 34));

        jPanel2.add(dept_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 306, 122, 28));

        attach_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attach_btn.setText("Attach Photo");
        attach_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attach_btnActionPerformed(evt);
            }
        });
        jPanel2.add(attach_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 261, 213, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Member ID");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 75, -1, -1));

        gender_comboo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gender_comboo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel2.add(gender_comboo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 355, 122, 28));
        jPanel2.add(attach_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 331, 213, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Name");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 118, 83, -1));
        jPanel2.add(member_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 122, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Degree");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 165, -1, -1));
        jPanel2.add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 118, 122, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Session");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 212, -1, -1));
        jPanel2.add(session_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 207, 122, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Roll No");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 260, -1, -1));
        jPanel2.add(roll_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 255, 122, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Department");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 306, 96, -1));
        jPanel2.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 122, 28));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Issue Date");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 120, 93, 22));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Expiration Date");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 185, -1, 23));

        std_issue_date.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(std_issue_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 120, -1, 28));

        std_exp_date.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(std_exp_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 185, -1, 28));

        jTabbedPane1.addTab("Student Entry", jPanel2);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Insert New Teacher Information");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Member ID");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Name");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Code");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Designation");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Department");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Gender");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("E-Mail");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Contact No");

        tea_des_combo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tea_des_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lecturer", "Assistant Professor", "Associate Professor", "Professor" }));

        tea_gen_comboo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tea_gen_comboo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        tea_submit_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tea_submit_btn.setText("Submit");
        tea_submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tea_submit_btnActionPerformed(evt);
            }
        });

        attachment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attachment.setText("Attach");
        attachment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachmentActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Issue Date ");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Expiration Date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tea_email)
                            .addComponent(tea_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tea_code)
                            .addComponent(tea_id, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tea_des_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tea_dept_comboo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tea_gen_comboo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(teacher_path)
                                .addComponent(attachment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel37)
                                                .addComponent(jLabel42))
                                            .addGap(42, 42, 42))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tea_exp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                        .addComponent(tea_contact, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tea_sss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(tea_submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel29))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(tea_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tea_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(tea_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(tea_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tea_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(tea_des_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tea_dept_comboo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tea_sss, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attachment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(tea_gen_comboo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(teacher_path, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tea_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(tea_submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Teacher Entry", jPanel3);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("pages");

        book_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        book_save.setText("Save");
        book_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_saveActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Price");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("No of Books");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Accession");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Call No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Book Title");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Author Name");

        pub_combo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                pub_comboComponentAdded(evt);
            }
        });
        pub_combo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                pub_comboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        pub_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pub_comboActionPerformed(evt);
            }
        });
        pub_combo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pub_comboKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pub_comboKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ISBN No");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("publisher");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Edition");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Book Entry");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(book_save, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no_of_book_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edition, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isbn_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(athor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accession_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(book_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pub_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_output, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(page_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(call_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(call_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accession_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(athor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(isbn_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pub_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_output, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(page_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_of_book_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(book_save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book Entry", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("Enter New Publisher Name");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 11, 206, 49));

        jLabel25.setText("Publisher Name");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 153, 84, -1));
        jPanel4.add(publisher_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 150, 156, -1));

        pub_btn.setText("submit");
        pub_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pub_btnActionPerformed(evt);
            }
        });
        jPanel4.add(pub_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 194, 156, -1));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 242, 156, -1));

        jLabel41.setText("publisher ID");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 115, 84, -1));
        jPanel4.add(publisher_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 112, 156, -1));

        pub_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        pub_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pub_tableMouseClicked(evt);
            }
        });
        pub_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pub_tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(pub_table);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 71, 248, 194));

        pub_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pub_searchKeyReleased(evt);
            }
        });
        jPanel4.add(pub_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 71, 156, -1));

        jLabel44.setText("Search");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 71, 84, 20));

        jTabbedPane1.addTab("Publisher Entry", jPanel4);

        jLabel24.setText("Enter New Department");

        jLabel26.setText("Department ID");

        jLabel27.setText("Department Name");

        jLabel28.setText("Short Name");

        slug_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slug_txtActionPerformed(evt);
            }
        });

        dept_btn.setText("Submit");
        dept_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_btnActionPerformed(evt);
            }
        });

        dept_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dept_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dept_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dept_table);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dept_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dept_searchKeyReleased(evt);
            }
        });

        jLabel45.setText("Search");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(dept_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slug_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(dept_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(dept_search))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dept_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dept_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(slug_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(dept_btn)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(21, 21, 21))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Department Entry", jPanel5);

        jLabel46.setText("Author ID");

        jLabel47.setText("First Name");

        jLabel48.setText("Last Name");

        jLabel49.setText("E-Mail");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Refresh");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(last, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(first, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(author_id_txt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(66, 66, 66)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(author_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel49)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(357, 357, 357)
                .addComponent(jButton3)
                .addGap(30, 30, 30)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Author Entry", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 650, 520));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 51, 153));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 63, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 51, 102));
        jButton8.setText("Borrow");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 16, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 102));
        jButton9.setText("Return");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 16, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("All Entry's Here");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 11, 268, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void book_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_saveActionPerformed
        try {
            
            String sql = "Insert into book (call_no,accesion,book_title,author_name,isbn_no,pub_id,edition,pages,price,no_of_book) values (?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, call_txt.getText());
            pst.setString(2, accession_txt.getText());
            pst.setString(3, book_txt.getText());
            pst.setString(4, athor_txt.getText());
            pst.setString(5, isbn_txt.getText());
            pst.setString(6, label_output.getText());
//            String value = pub_combo.getSelectedItem().toString();
//            pst.setString(6, value);
            pst.setString(7, edition.getText());
            pst.setString(8, page_txt.getText());
            pst.setString(9, price_txt.getText());
            pst.setString(10,no_of_book_txt.getText());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_book_saveActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        Validation em = new Validation();
        String names = name_txt.getText();
        String roll = roll_txt.getText();
        String email = email_txt.getText();
        String mobile  = contact_txt.getText();
        
            
               
                if((!em.validateEmail(email))){
                    JOptionPane.showMessageDialog(null, "Enter email address correctly.");
                }
                else if((!em.validatemobile(mobile))){
                    JOptionPane.showMessageDialog(null, "Entermobile number correctly.");
                }else if((!em.validateName(names))){
                    JOptionPane.showMessageDialog(null, "Enter Name correctly.");
                }
//                else if(!em.validateroll(roll)){
//                    JOptionPane.showMessageDialog(null, "Enter Roll correctly.");
//                }
                else{
                    try {
                    String sql = "Insert into student (member_id,name,degree,session,roll_no,department,gender,e_mail,contact_no,mem_issue,exp_date,image) values (?,?,?,?,?,?,?,?,?,?,?,?)";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, member_txt.getText());
                    pst.setString(2, name_txt.getText());
                    String value = degree_combo.getSelectedItem().toString();
                    pst.setString(3, value);
                    pst.setString(4, session_txt.getText());
                    pst.setString(5, roll_txt.getText());

                    String value1 = dept_combo.getSelectedItem().toString();
                    pst.setString(6, value1);
                    String value2 = gender_comboo.getSelectedItem().toString();
                    pst.setString(7, value2);

                    pst.setString(8, email_txt.getText());
                    pst.setString(9, contact_txt.getText());
                    pst.setString(10, ((JTextField)std_issue_date.getDateEditor().getUiComponent()).getText());
                    pst.setString(11, ((JTextField)std_exp_date.getDateEditor().getUiComponent()).getText());
                    pst.setBytes(12,person_image);
                    pst.execute();



                    JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {
            }
        }
            }
        
    
    }//GEN-LAST:event_save_btnActionPerformed

    private void attach_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attach_btnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        //String filename = f.get();
        attach_txt.setText(filename);

        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){

                bos.write(buf,0,readNum);

            }
            person_image = bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_attach_btnActionPerformed

    private void pub_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pub_btnActionPerformed
        try {
            String sql = "Insert into publisher (pub_id,pub_name) values (?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, publisher_id_txt.getText());
            pst.setString(2, publisher_name.getText());
            
            

            pst.execute();

            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_pub_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Update_table();
        publisher_id_txt.setText("");
        publisher_name.setText("");
        pub_search.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void slug_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slug_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slug_txtActionPerformed

    private void dept_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_btnActionPerformed
        try {
            String sql = "Insert into department (dept_id,dept_name,short_name) values (?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_txt.getText());
            pst.setString(2, dept_txt.getText());
            pst.setString(3, slug_txt.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_dept_btnActionPerformed

    private void attachmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachmentActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        //String filename = f.get();
        teacher_path.setText(filename);

        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){

                bos.write(buf,0,readNum);

            }
            person_image = bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_attachmentActionPerformed

    private void tea_submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tea_submit_btnActionPerformed
        try {
            String sql = "Insert into teacher (member_id,name,code,designation,department,gender,e_mail,contact_no,t_issue_date,t_exp_date,image) values (?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, tea_id.getText());
            pst.setString(2, tea_name.getText());
            pst.setString(3, tea_code.getText());
            String value = tea_des_combo.getSelectedItem().toString();
            pst.setString(4, value);
            String value6 = tea_dept_comboo.getSelectedItem().toString();
            pst.setString(5, value6);
            String value7 = tea_gen_comboo.getSelectedItem().toString();
            pst.setString(6, value7);
            pst.setString(7, tea_email.getText());
            pst.setString(8, tea_contact.getText());
            pst.setString(9, ((JTextField)tea_exp.getDateEditor().getUiComponent()).getText());
            pst.setString(10, ((JTextField)tea_sss.getDateEditor().getUiComponent()).getText());
            pst.setBytes(11,person_image);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_tea_submit_btnActionPerformed

    private void pub_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pub_comboActionPerformed
        
        
    }//GEN-LAST:event_pub_comboActionPerformed

    private void pub_comboComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pub_comboComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pub_comboComponentAdded

    private void pub_comboKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pub_comboKeyReleased
        
    }//GEN-LAST:event_pub_comboKeyReleased

    private void pub_comboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pub_comboKeyPressed
        
    }//GEN-LAST:event_pub_comboKeyPressed

    private void pub_comboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_pub_comboPopupMenuWillBecomeInvisible
        String tmp = (String)pub_combo.getSelectedItem();
        String sql = "select * from publisher where pub_name=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();
            String value = "";
            if(rs.next()){
            
                value = rs.getString("pub_id");
                label_output.setText(value);
                pst.execute();
            }
        }catch(Exception e){
        
        
        }
    }//GEN-LAST:event_pub_comboPopupMenuWillBecomeInvisible

    private void pub_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pub_tableKeyReleased

    }//GEN-LAST:event_pub_tableKeyReleased

    private void pub_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pub_tableMouseClicked
        try {
                int row = pub_table.getSelectedRow();
                String Table = (pub_table.getModel().getValueAt(row, 0).toString());
                String sql = "select * from publisher where pub_id='" + Table + "' ";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    String add1 = rs.getString("pub_id");
                    publisher_id_txt.setText(add1);
                    String add2 = rs.getString("pub_name");
                    publisher_name.setText(add2);
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);

            }
    }//GEN-LAST:event_pub_tableMouseClicked

    private void dept_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dept_tableMouseClicked
        try {
                int row = dept_table.getSelectedRow();
                String Table = (dept_table.getModel().getValueAt(row, 0).toString());
                String sql = "select * from department where dept_id='" + Table + "' ";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    String add1 = rs.getString("dept_id");
                    id_txt.setText(add1);
                    String add2 = rs.getString("dept_name");
                    dept_txt.setText(add2);
                    String add3 = rs.getString("short_name");
                    slug_txt.setText(add3);
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);

            }
    }//GEN-LAST:event_dept_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Update_tables();
        id_txt.setText("");
        dept_txt.setText("");
        slug_txt.setText("");
        dept_search.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pub_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pub_searchKeyReleased
        try {

            String sql = "select * from publisher where pub_id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, pub_search.getText());

            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("pub_id");
                publisher_id_txt.setText(add1);
                String add2 = rs.getString("pub_name");
                publisher_name.setText(add2);
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_pub_searchKeyReleased

    private void dept_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dept_searchKeyReleased
         try {

            String sql = "select * from department where dept_id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, dept_search.getText());

            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("dept_id");
                id_txt.setText(add1);
                String add2 = rs.getString("dept_name");
                dept_txt.setText(add2);
                String add3 = rs.getString("short_name");
                slug_txt.setText(add3);
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_dept_searchKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String sql = "Insert into author (author_id,first_name,last_name,e_mail) values (?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, author_id_txt.getText());
            pst.setString(2, first.getText());
            pst.setString(3, last.getText());
            pst.setString(4, jTextField4.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();

            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        main_form mf = new main_form();
        mf.setVisible(true);
        close();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        close();
        book_borrow bk = new book_borrow();
        bk.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        close();
        book_return bkrtn = new book_return();
        bkrtn.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accession_txt;
    private javax.swing.JTextField athor_txt;
    private javax.swing.JButton attach_btn;
    private javax.swing.JTextField attach_txt;
    private javax.swing.JButton attachment;
    private javax.swing.JTextField author_id_txt;
    private javax.swing.JButton book_save;
    private javax.swing.JTextField book_txt;
    private javax.swing.JTextField call_txt;
    private javax.swing.JTextField contact_txt;
    private javax.swing.JComboBox degree_combo;
    private javax.swing.JButton dept_btn;
    private javax.swing.JComboBox dept_combo;
    private javax.swing.JTextField dept_search;
    private javax.swing.JTable dept_table;
    private javax.swing.JTextField dept_txt;
    private javax.swing.JTextField edition;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField first;
    private javax.swing.JComboBox gender_comboo;
    private javax.swing.JTextField id_txt;
    private javax.swing.JTextField isbn_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel label_output;
    private javax.swing.JTextField last;
    private javax.swing.JTextField member_txt;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField no_of_book_txt;
    private javax.swing.JTextField page_txt;
    private javax.swing.JTextField price_txt;
    private javax.swing.JButton pub_btn;
    private javax.swing.JComboBox pub_combo;
    private javax.swing.JTextField pub_search;
    private javax.swing.JTable pub_table;
    private javax.swing.JTextField publisher_id_txt;
    private javax.swing.JTextField publisher_name;
    private javax.swing.JTextField roll_txt;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField session_txt;
    private javax.swing.JTextField slug_txt;
    private com.toedter.calendar.JDateChooser std_exp_date;
    private com.toedter.calendar.JDateChooser std_issue_date;
    private javax.swing.JTextField tea_code;
    private javax.swing.JTextField tea_contact;
    private javax.swing.JComboBox tea_dept_comboo;
    private javax.swing.JComboBox tea_des_combo;
    private javax.swing.JTextField tea_email;
    private com.toedter.calendar.JDateChooser tea_exp;
    private javax.swing.JComboBox tea_gen_comboo;
    private javax.swing.JTextField tea_id;
    private javax.swing.JTextField tea_name;
    private com.toedter.calendar.JDateChooser tea_sss;
    private javax.swing.JButton tea_submit_btn;
    private javax.swing.JTextField teacher_path;
    // End of variables declaration//GEN-END:variables
    Timer timer;
    private ImageIcon format = null;
    String filename = null;
    int s=0;
    byte[] person_image = null;

}
