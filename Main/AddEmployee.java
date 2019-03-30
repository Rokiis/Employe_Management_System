package Main;
import static Main.Controller.AddEmployeeQr;
import static Main.MenuWindow.MenuOpen;
import static Main.PopUp.PopUpWin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author rnavicka
 */
public class AddEmployee extends javax.swing.JFrame {
    public AddEmployee() {
        initComponents();
        createView();
        
        
    }
        
        
    private void createView(){
        name.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                if (name.getText().length() >= 30)
                    e.consume();
            }
        });        
        surname.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                if (surname.getText().length() >= 50)
                    e.consume();
            }
        }); 
        address.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                if (address.getText().length() >= 45)
                    e.consume();
            }
        });        
        phoneNo.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                if (phoneNo.getText().length() >= 10)
                    e.consume();
            }
        });
        buttonSubmit.addActionListener((ActionEvent e) -> {
            String dbname = name.getText();
            String dbsurname = surname.getText();
            String dbdept = (String)department.getSelectedItem();
            String dbpos = (String)position.getSelectedItem();
            String dbhiretime = (String)date.getText();
            String dbaddress = (String)address.getText();
            String dbphone = (String)phoneNo.getText();
            String dbstring = "INSERT INTO employeelist(name, surname, department, position, hiretime, address, phoneNo) VALUES('"+dbname+"','"+dbsurname+"'"+ ",'"+dbdept+"','"+dbpos+"','"+dbhiretime+"','"+dbaddress+"','"+dbphone+"')";
            try {
                AddEmployeeQr(dbstring);
            } catch (Exception x1) {
                String e1 = x1.toString();
                PopUpWin(e1);
            }
            name.setText(null);
            surname.setText(null);
            date.setText(null);
            address.setText(null);
            phoneNo.setText(null);
        });
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        picPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        BackBtn = new javax.swing.JLabel();
        OverlayPanel = new javax.swing.JPanel();
        FormPanel = new javax.swing.JPanel();
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
        date = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        position = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        namelb = new javax.swing.JLabel();
        buttonSubmit = new javax.swing.JButton();
        closePanel = new javax.swing.JPanel();
        closebtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPORTS AND LEISURE VILLAGE - ADD EMPLOYEE");
        setBackground(new java.awt.Color(32, 33, 35));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        picPanel.setBackground(new java.awt.Color(32, 33, 35));

        jLabel2.setBackground(new java.awt.Color(32, 33, 35,200));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/addpic.jpg"))); // NOI18N

        BackBtn.setBackground(new java.awt.Color(32, 33, 35));
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
            .addGap(0, 36, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BackBtn)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(BackBtn)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        OverlayPanel.setBackground(new Color(32, 33, 35,255));
        OverlayPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 250));

        javax.swing.GroupLayout picPanelLayout = new javax.swing.GroupLayout(picPanel);
        picPanel.setLayout(picPanelLayout);
        picPanelLayout.setHorizontalGroup(
            picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(picPanelLayout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(picPanelLayout.createSequentialGroup()
                    .addComponent(OverlayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 467, Short.MAX_VALUE)))
        );
        picPanelLayout.setVerticalGroup(
            picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(picPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OverlayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        FormPanel.setBackground(new java.awt.Color(32, 33, 35));

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
        IDno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        date.setBackground(new java.awt.Color(32, 33, 35));
        date.setForeground(new java.awt.Color(57, 113, 177));

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

        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TextFieldsLayout = new javax.swing.GroupLayout(TextFields);
        TextFields.setLayout(TextFieldsLayout);
        TextFieldsLayout.setHorizontalGroup(
            TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextFieldsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addComponent(poslb)
                        .addGap(18, 18, 18)
                        .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addComponent(deptlb)
                        .addGap(18, 18, 18)
                        .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namelb)
                            .addComponent(srnmlb))
                        .addGap(18, 18, 18)
                        .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addComponent(adrlb)
                        .addGap(18, 18, 18)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addComponent(hrtmlb)
                        .addGap(18, 18, 18)
                        .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TextFieldsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TextFieldsLayout.createSequentialGroup()
                        .addComponent(phonelb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TextFieldsLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(IDno)
                    .addContainerGap(293, Short.MAX_VALUE)))
        );
        TextFieldsLayout.setVerticalGroup(
            TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextFieldsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelb)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrtmlb))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonelb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TextFieldsLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(IDno)
                    .addContainerGap(291, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(TextFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        closePanel.setBackground(new java.awt.Color(32, 33, 35));

        closebtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        closebtn.setForeground(new java.awt.Color(0, 102, 153));
        closebtn.setText("X");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout closePanelLayout = new javax.swing.GroupLayout(closePanel);
        closePanel.setLayout(closePanelLayout);
        closePanelLayout.setHorizontalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, closePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closebtn)
                .addContainerGap())
        );
        closePanelLayout.setVerticalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closebtn)
                .addContainerGap(576, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(closePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        this.setVisible(false);
        MenuOpen();        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_closebtnMouseClicked

    public static void AddEmployeeWin() {
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
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackBtn;
    private javax.swing.JPanel FormPanel;
    private javax.swing.JLabel IDno;
    private javax.swing.JPanel OverlayPanel;
    private javax.swing.JPanel TextFields;
    private javax.swing.JTextField address;
    private javax.swing.JLabel adrlb;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JPanel closePanel;
    private javax.swing.JLabel closebtn;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JLabel deptlb;
    private javax.swing.JLabel hrtmlb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel namelb;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JLabel phonelb;
    private javax.swing.JPanel picPanel;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JLabel poslb;
    private javax.swing.JLabel srnmlb;
    private javax.swing.JTextField surname;
    // End of variables declaration//GEN-END:variables

}
