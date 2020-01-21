
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class searchstudent extends javax.swing.JFrame {

    public String usn;
    public searchstudent() {
        initComponents();
    }
    
    public searchstudent(String usn) {
        initComponents();
        this.usn=usn;
        fillTable();
        this.fillData();
    }
    
    public void fillData(){
        
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        
        try{
            
            ps=con.prepareStatement("SELECT sname ,usn ,department , student_email , project , sports , social_service FROM student where usn= ?");
            ps.setString(1,this.usn );
            
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                jTextField_name.setText(rs.getString("sname"));
                jTextField_usn.setText(rs.getString("usn"));
                jTextField_branch.setText(rs.getString("department"));
                jTextField_mobNo.setText(rs.getString("student_email"));
                jTextArea_projects.setText(rs.getString("project"));
                jTextArea_sports.setText(rs.getString("sports"));
                jTextArea_services.setText(rs.getString("social_service"));
            }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    public void fillTable(){
        
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        
        try{
            
            ps=con.prepareStatement("SELECT course_code , course_name , teacher_id , marks , attendence FROM student natural join teaches where usn= ?");
            ps.setString(1,this.usn );
            
            ResultSet rs= ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)jTable_studentTable.getModel();
            //model2.setRowCount(0);
            Object[] row ;
            while(rs.next()){
                row = new Object[5];
                row[0]=rs.getString("course_code");
                row[1]= rs.getString("course_name");
                row[2]=rs.getString("teacher_id");
                row[3]=rs.getString("marks");
                row[4]=rs.getString("attendence");
                
                model.addRow(row);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_studentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_usn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_branch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_projects = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_sports = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_services = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_mobNo = new javax.swing.JTextField();
        jButton_cancel = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jScrollPane1.setBorder(null);

        jTable_studentTable.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTable_studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "course code", "course name", "teacher_id", "Marks", "Attendence"
            }
        ));
        jScrollPane1.setViewportView(jTable_studentTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("NAME :");

        jTextField_name.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("USN :");

        jTextField_usn.setFont(jTextField_usn.getFont().deriveFont((jTextField_usn.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, 14));

        jLabel3.setFont(jLabel3.getFont().deriveFont((jLabel3.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, 14));
        jLabel3.setText("BRANCH:");

        jTextArea_projects.setColumns(20);
        jTextArea_projects.setRows(5);
        jScrollPane2.setViewportView(jTextArea_projects);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("PROJECTS :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("SPORTS :");

        jTextArea_sports.setColumns(20);
        jTextArea_sports.setRows(5);
        jScrollPane3.setViewportView(jTextArea_sports);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("SOCIAL SERVICES :");

        jTextArea_services.setColumns(20);
        jTextArea_services.setRows(5);
        jScrollPane4.setViewportView(jTextArea_services);

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\email.jpg")); // NOI18N

        jButton_cancel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton_cancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\cancel.jpg")); // NOI18N
        jButton_cancel.setText("CANCEL");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jButton_update.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton_update.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\update.jpg")); // NOI18N
        jButton_update.setText("UPDATE");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_update))
                    .addComponent(jTextField_usn)
                    .addComponent(jTextField_name)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_branch, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(107, 107, 107))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_mobNo))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180)))
                .addGap(105, 105, 105)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_usn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_branch))
                    .addComponent(jTextField_mobNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel)
                    .addComponent(jButton_update))
                .addContainerGap())
            .addComponent(jScrollPane1)
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

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try{
            String mail = jTextField_mobNo.getText();
            String proj = jTextArea_projects.getText();
            String sports = jTextArea_sports.getText();
            String service = jTextArea_services.getText();
            ps=con.prepareStatement("UPDATE student SET student_email=? , project=? , sports=? , social_service=? where usn= ?");
            ps.setString(1, mail);
            ps.setString(2, proj);
            ps.setString(3, sports);
            ps.setString(4, service);
            ps.setString(5,this.usn );
            
            int rs= ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "DETAILS UPDATED SUCCESSFULLY !");
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        new loginMenuPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_cancelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_studentTable;
    private javax.swing.JTextArea jTextArea_projects;
    private javax.swing.JTextArea jTextArea_services;
    private javax.swing.JTextArea jTextArea_sports;
    private javax.swing.JTextField jTextField_branch;
    private javax.swing.JTextField jTextField_mobNo;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_usn;
    // End of variables declaration//GEN-END:variables
}
