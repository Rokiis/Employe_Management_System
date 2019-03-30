package Main;
import static Main.AddEmployee.AddEmployeeWin;
import static Main.DeleteEmployee.DelEmp;
import static Main.EditEmployee.EditEmpWin;
import static Main.ShowEmployees.Showemp;
import java.awt.Color;

public class MenuWindow extends javax.swing.JFrame {


    public MenuWindow() {
        initComponents();
    }
    private void MenuClose(){
        this.setVisible(false);
        OverlayPanel.setBackground(new Color(0,0,0,200));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        closebtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AddEmp = new java.awt.Button();
        ShowEmp = new java.awt.Button();
        EditEmp = new java.awt.Button();
        DelEmp = new java.awt.Button();
        OverlayPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPORTS AND LEISURE VILLAGE - MENU");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("menu"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));
        jPanel2.setForeground(new java.awt.Color(32, 33, 35));

        closebtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        closebtn.setForeground(new java.awt.Color(0, 102, 153));
        closebtn.setText("X");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        jPanel2.add(closebtn);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 50, 600));

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setToolTipText("");
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 37));

        AddEmp.setActionCommand("addemp");
        AddEmp.setBackground(new java.awt.Color(51, 52, 54));
        AddEmp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddEmp.setForeground(new java.awt.Color(255, 255, 255));
        AddEmp.setLabel("ADD EMPLOYEE");
        AddEmp.setName(""); // NOI18N
        AddEmp.setPreferredSize(new java.awt.Dimension(550, 110));
        AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpActionPerformed(evt);
            }
        });
        jPanel1.add(AddEmp);
        AddEmp.getAccessibleContext().setAccessibleName("addemp");
        AddEmp.getAccessibleContext().setAccessibleDescription("");

        ShowEmp.setActionCommand("showemp");
        ShowEmp.setBackground(new java.awt.Color(51, 52, 54));
        ShowEmp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ShowEmp.setForeground(new java.awt.Color(255, 255, 255));
        ShowEmp.setLabel("SHOW EMPLOYEES");
        ShowEmp.setPreferredSize(new java.awt.Dimension(550, 110));
        ShowEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowEmpActionPerformed(evt);
            }
        });
        jPanel1.add(ShowEmp);
        ShowEmp.getAccessibleContext().setAccessibleName("showemp");

        EditEmp.setBackground(new java.awt.Color(51, 52, 54));
        EditEmp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EditEmp.setForeground(new java.awt.Color(255, 255, 255));
        EditEmp.setLabel("EDIT EMPLOYEES");
        EditEmp.setName(""); // NOI18N
        EditEmp.setPreferredSize(new java.awt.Dimension(550, 110));
        EditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmpActionPerformed(evt);
            }
        });
        jPanel1.add(EditEmp);

        DelEmp.setBackground(new java.awt.Color(51, 52, 54));
        DelEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DelEmp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DelEmp.setForeground(new java.awt.Color(255, 255, 255));
        DelEmp.setLabel("DELETE EMPLOYEES");
        DelEmp.setPreferredSize(new java.awt.Dimension(550, 110));
        DelEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelEmpActionPerformed(evt);
            }
        });
        jPanel1.add(DelEmp);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 570, 600));

        OverlayPanel.setBackground(new Color(0, 0, 0,200));
        OverlayPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 250));

        jPanel3.setBackground(new Color(0,0,0,0));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 200));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sports And Leisure");
        jPanel3.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Village");
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3);

        OverlayPanel.add(jPanel3);

        getContentPane().add(OverlayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 600));

        jLabel1.setBackground(new java.awt.Color(32, 33, 35));
        jLabel1.setForeground(new java.awt.Color(32, 33, 35));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/JavaLogo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpActionPerformed
        AddEmployeeWin();
        MenuClose();
    }//GEN-LAST:event_AddEmpActionPerformed

    private void ShowEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowEmpActionPerformed
        Showemp();
        MenuClose();
    }//GEN-LAST:event_ShowEmpActionPerformed

    private void EditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEmpActionPerformed
        EditEmpWin();
        MenuClose();
    }//GEN-LAST:event_EditEmpActionPerformed

    private void DelEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelEmpActionPerformed
        DelEmp();
        MenuClose();
    }//GEN-LAST:event_DelEmpActionPerformed

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
    System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_closebtnMouseClicked
    public static void MenuOpen(){
        new MenuWindow().setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new MenuWindow().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button AddEmp;
    private java.awt.Button DelEmp;
    private java.awt.Button EditEmp;
    private javax.swing.JPanel OverlayPanel;
    private java.awt.Button ShowEmp;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
