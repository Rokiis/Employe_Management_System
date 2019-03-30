/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import static Main.Controller.getConnection;
import static Main.MenuWindow.MenuOpen;
import static Main.PopUp.PopUpWin;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author rnavicka
 */
public class EditEmployee extends javax.swing.JFrame {


    public EditEmployee() throws Exception {
        initComponents();
        ShowEmployeeTable();
        
    }
    public static void updateTable(String dbs) throws Exception{
        try{
            Connection con = getConnection();
            PreparedStatement push = con.prepareStatement(dbs);
            push.executeUpdate();
        }catch(Exception e){
            String e1 = e.toString();
            PopUpWin(e1);
        }
    }
    
    public void ShowEmployeeTable() throws Exception{
        try{
            Connection con = getConnection();
            String sql = "SELECT empID,name,surname,position,department FROM employeelist";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            resultTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            String e1 = e.toString();
            PopUpWin(e1);}
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Window = new javax.swing.JPanel();
        TableField = new javax.swing.JPanel();
        TextFields = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        poslb = new javax.swing.JLabel();
        IDno = new javax.swing.JLabel();
        hrtmlb = new javax.swing.JLabel();
        phonelb = new javax.swing.JLabel();
        phoneNo = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        deptlb = new javax.swing.JLabel();
        adrlb = new javax.swing.JLabel();
        srnmlb = new javax.swing.JLabel();
        hiretime = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        position = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        namelb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        closebtn = new javax.swing.JLabel();
        Submitbtn = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        BackBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Window.setBackground(new java.awt.Color(32, 33, 35));
        Window.setForeground(new java.awt.Color(32, 33, 35));

        TableField.setBackground(new java.awt.Color(32, 33, 35));
        TableField.setForeground(new java.awt.Color(32, 33, 35));

        TextFields.setBackground(new java.awt.Color(32, 33, 35));
        TextFields.setForeground(new java.awt.Color(32, 33, 35));

        jLabel1.setBackground(new java.awt.Color(32, 33, 35));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 56, 112));
        jLabel1.setText("yyyy-mm-dd");

        surname.setBackground(new java.awt.Color(32, 33, 35));
        surname.setForeground(new java.awt.Color(57, 113, 177));

        poslb.setBackground(new java.awt.Color(32, 33, 35));
        poslb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        poslb.setForeground(new java.awt.Color(0, 102, 204));
        poslb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poslb.setText("Position:");
        poslb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        IDno.setBackground(new java.awt.Color(32, 33, 35));
        IDno.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        IDno.setForeground(new java.awt.Color(0, 102, 204));
        IDno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        hrtmlb.setBackground(new java.awt.Color(32, 33, 35));
        hrtmlb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hrtmlb.setForeground(new java.awt.Color(0, 102, 204));
        hrtmlb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hrtmlb.setText("Hire Time:");

        phonelb.setBackground(new java.awt.Color(32, 33, 35));
        phonelb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        phonelb.setForeground(new java.awt.Color(0, 102, 204));
        phonelb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phonelb.setText("Phone Number: +44");

        phoneNo.setBackground(new java.awt.Color(32, 33, 35));
        phoneNo.setForeground(new java.awt.Color(57, 113, 177));

        name.setBackground(new java.awt.Color(32, 33, 35));
        name.setForeground(new java.awt.Color(57, 113, 177));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        deptlb.setBackground(new java.awt.Color(32, 33, 35));
        deptlb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deptlb.setForeground(new java.awt.Color(0, 102, 204));
        deptlb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        deptlb.setText("Department:");

        adrlb.setBackground(new java.awt.Color(32, 33, 35));
        adrlb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adrlb.setForeground(new java.awt.Color(0, 102, 204));
        adrlb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adrlb.setText("Address:");

        srnmlb.setBackground(new java.awt.Color(32, 33, 35));
        srnmlb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        srnmlb.setForeground(new java.awt.Color(0, 102, 204));
        srnmlb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        srnmlb.setText("Surname:");

        hiretime.setBackground(new java.awt.Color(32, 33, 35));
        hiretime.setForeground(new java.awt.Color(57, 113, 177));

        address.setBackground(new java.awt.Color(32, 33, 35));
        address.setForeground(new java.awt.Color(57, 113, 177));

        position.setBackground(new java.awt.Color(32, 33, 35));
        position.setForeground(new java.awt.Color(57, 113, 177));
        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"Full-Time\"", "\"Part-Time\"", "\"Third Party\"" }));

        department.setBackground(new java.awt.Color(32, 33, 35));
        department.setForeground(new java.awt.Color(57, 113, 177));
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"Swimming\"", "\"Tennis\"", "\"Yoga\"", "\"Fitness\"", "\"Squash\"", "\"Manager\"", "\"Security\"", "\"IT\"", "\"Piss-Taking\"", "\"Owner\"", "\"Assistant\"", "\"Senior Manager\"", "\"General Branch Manager\"" }));

        namelb.setBackground(new java.awt.Color(32, 33, 35));
        namelb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        namelb.setForeground(new java.awt.Color(0, 102, 204));
        namelb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namelb.setText("Name:");
        namelb.setOpaque(true);

        javax.swing.GroupLayout TextFieldsLayout = new javax.swing.GroupLayout(TextFields);
        TextFields.setLayout(TextFieldsLayout);
        TextFieldsLayout.setHorizontalGroup(
            TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextFieldsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addComponent(IDno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextFieldsLayout.createSequentialGroup()
                                .addComponent(namelb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextFieldsLayout.createSequentialGroup()
                                .addComponent(srnmlb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextFieldsLayout.createSequentialGroup()
                                    .addComponent(poslb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextFieldsLayout.createSequentialGroup()
                                    .addComponent(adrlb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextFieldsLayout.createSequentialGroup()
                                    .addComponent(hrtmlb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(hiretime, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextFieldsLayout.createSequentialGroup()
                                    .addComponent(phonelb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(TextFieldsLayout.createSequentialGroup()
                                .addComponent(deptlb)
                                .addGap(10, 10, 10)
                                .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        TextFieldsLayout.setVerticalGroup(
            TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextFieldsLayout.createSequentialGroup()
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namelb)))
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addComponent(IDno, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srnmlb))
                .addGap(18, 18, 18)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptlb))
                .addGap(18, 18, 18)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poslb))
                .addGap(18, 18, 18)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adrlb))
                .addGap(18, 18, 18)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hiretime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrtmlb))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonelb))
                .addGap(31, 31, 31))
        );

        jScrollPane1.setBackground(new java.awt.Color(32, 33, 35));
        jScrollPane1.setForeground(new java.awt.Color(32, 33, 35));

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
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
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resultTable);

        javax.swing.GroupLayout TableFieldLayout = new javax.swing.GroupLayout(TableField);
        TableField.setLayout(TableFieldLayout);
        TableFieldLayout.setHorizontalGroup(
            TableFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableFieldLayout.createSequentialGroup()
                .addGroup(TableFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TableFieldLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        TableFieldLayout.setVerticalGroup(
            TableFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableFieldLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFields, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        closebtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        closebtn.setForeground(new java.awt.Color(0, 102, 153));
        closebtn.setText("X");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });

        Submitbtn.setBackground(new java.awt.Color(24, 33, 81));
        Submitbtn.setForeground(new java.awt.Color(57, 113, 177));
        Submitbtn.setText("Change!");
        Submitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout WindowLayout = new javax.swing.GroupLayout(Window);
        Window.setLayout(WindowLayout);
        WindowLayout.setHorizontalGroup(
            WindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindowLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(TableField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closebtn)
                .addContainerGap())
            .addGroup(WindowLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(Submitbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WindowLayout.setVerticalGroup(
            WindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindowLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(WindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closebtn)
                    .addComponent(TableField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submitbtn)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(Window, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/editempl.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1200, 800));

        BackBtn.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(0, 102, 153));
        BackBtn.setText("<");
        BackBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(BackBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(BackBtn)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(BackBtn)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 505, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new Color(0, 0, 0,200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void resultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMouseClicked
        try {
            int column = 0;
            int row = resultTable.getSelectedRow();
            String value = resultTable.getModel().getValueAt(row, column).toString();
            Connection con = getConnection();
            String sqls = "SELECT * FROM employeelist WHERE empID = ('"+value+"')";
            PreparedStatement ps = con.prepareStatement(sqls);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString("empID");
                IDno.setText(id);
                String namedb = rs.getString("name");
                name.setText(namedb);
                String surnamedb = rs.getString("surname");
                surname.setText(surnamedb);
                String deptdb = rs.getString("department");
                department.setSelectedItem(deptdb);
                String posdb = rs.getString("position");
                position.setSelectedItem(posdb);
                String hiredb = rs.getString("hiretime");
                hiretime.setText(hiredb);
                String addressdb = rs.getString("address");
                address.setText(addressdb);
                String phonedb = rs.getString("phoneNo");
                phoneNo.setText(phonedb);
            }
            
            
        } catch (Exception ex) {
            String e1 = ex.toString();
            PopUpWin(e1);
        }

        
        
    }//GEN-LAST:event_resultTableMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_closebtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        MenuOpen();
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnMouseClicked

    private void SubmitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitbtnMouseClicked
        System.out.println(name.getText());
        String empid = IDno.getText();
        System.out.println(empid);
        String dbname = name.getText();
        String dbsurname = surname.getText();
        String dbdept = (String)department.getSelectedItem();
        String dbpos = (String)position.getSelectedItem();
        String dbhiretime = (String)hiretime.getText();
        String dbaddress = (String)address.getText();
        String dbphone = (String)phoneNo.getText();
        String dbs = "UPDATE employeelist SET name = ('"+dbname+"'), surname = ('"+dbsurname+"') , department = ('"+dbdept+"'), position = ('"+dbpos+"'), hiretime = ('"+dbhiretime+"'), address = ('"+dbaddress+"'), phoneNo=('"+dbphone+"') WHERE empID = ('"+empid+"')";
        try {
            updateTable(dbs);
            ShowEmployeeTable();
        } catch (Exception x1) {
            String e1 = x1.toString();
            PopUpWin(e1);
        }
    }//GEN-LAST:event_SubmitbtnMouseClicked


    public static void EditEmpWin() {
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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditEmployee().setVisible(true);
                } catch (Exception ex) {
                    String e1 = ex.toString();
                    PopUpWin(e1);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackBtn;
    private javax.swing.JLabel IDno;
    private javax.swing.JLabel Submitbtn;
    private javax.swing.JPanel TableField;
    private javax.swing.JPanel TextFields;
    private javax.swing.JPanel Window;
    private javax.swing.JTextField address;
    private javax.swing.JLabel adrlb;
    private javax.swing.JLabel closebtn;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JLabel deptlb;
    private javax.swing.JTextField hiretime;
    private javax.swing.JLabel hrtmlb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel namelb;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JLabel phonelb;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JLabel poslb;
    private javax.swing.JTable resultTable;
    private javax.swing.JLabel srnmlb;
    private javax.swing.JTextField surname;
    // End of variables declaration//GEN-END:variables
}
