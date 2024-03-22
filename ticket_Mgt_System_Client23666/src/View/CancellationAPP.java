
package View;



import Model.CancellationMODEL;
import Service.CancellationService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CancellationAPP extends javax.swing.JFrame {

     // global variables
    private String db_url="jdbc:mysql://localhost:3306/ticket_management_system_db";
    private String db_username="root";
    private String db_passwd="1234";
    
  
    
    DefaultTableModel tableModel = new DefaultTableModel();
    public CancellationAPP() {
        initComponents();
        addColumnTable();
        DisplayCancellation();
        clear();
        GetTicket();
        GetTicketData();
        depcodetxt3.setEditable(false);
    }
    
    private void addColumnTable(){
        tableModel.addColumn("CanceId");
        tableModel.addColumn("TicketId");
        tableModel.addColumn("Depcode");
        tableModel.addColumn("CancDate");
        CancellationTBL.setModel(tableModel);
    }
    
    private void DisplayCancellation(){
        try{
            tableModel.setRowCount(0);
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
            CancellationService service = (CancellationService)registry.lookup("cancellation");
            List <CancellationMODEL> cancelList = service.retrieveAllCancellation();
            for(CancellationMODEL can: cancelList){
                 tableModel.addRow(new Object[]{
                     can.getCancId(),
                     can.getTicketId(),
                     can.getDepcode(),
                     can.getCancDate()
                 });
            }
        }catch(Exception ex){
            ex.printStackTrace();
            //return null;
        }
    }
    private void clear(){
        CanceIdtxt.setText("");
        TicketCb.setSelectedIndex(-1);
        depcodetxt3.setText("");
        CDate3.setDate(null);
    }
    private void GetTicket(){
         try{
             Connection con = DriverManager.getConnection(db_url,db_username,db_passwd);
             PreparedStatement pst = con.prepareStatement("SELECT * FROM ticketmodel");
             ResultSet result = pst.executeQuery();
             while(result.next()){
                 String T = String.valueOf(result.getString("ticket_id"));
                 TicketCb.addItem(T);
             }
         }catch(Exception ex){
            ex.printStackTrace();
            //return null;
        }
    }
    private void GetTicketData(){
       try {
        Connection con = DriverManager.getConnection(db_url, db_username, db_passwd);
        String selectedItem = (String) TicketCb.getSelectedItem();
        if (selectedItem != null){
            PreparedStatement pst = con.prepareStatement("SELECT * FROM ticketmodel WHERE ticket_id = ?");
            pst.setString(1, selectedItem);
            ResultSet result = pst.executeQuery();
            if (result.next()) {
                depcodetxt3.setText(result.getString("dep_id"));
            } 
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        depcodetxt3 = new javax.swing.JTextField();
        TicketCb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CancellationTBL = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        CanceIdtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("CANCELLATION MANAGEMENT");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Ticket Id");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Cancellation ID");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Takeoff Date");

        depcodetxt3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        TicketCb.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        TicketCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketCbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("CANCELLATION LIST");

        BackBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(0, 0, 153));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(0, 0, 153));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(0, 0, 153));
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });

        CancellationTBL.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        CancellationTBL.setModel(new javax.swing.table.DefaultTableModel(
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
        CancellationTBL.setSelectionBackground(new java.awt.Color(255, 153, 0));
        CancellationTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancellationTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CancellationTBL);

        CanceIdtxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Departure Code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(667, 667, 667)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(316, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(596, 596, 596)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TicketCb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(depcodetxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(188, 188, 188)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 254, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CanceIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(402, 402, 402))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(131, 131, 131)))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel7)))
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CanceIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TicketCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depcodetxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(ResetBtn)
                    .addComponent(BackBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TicketCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketCbActionPerformed
        GetTicketData();
    }//GEN-LAST:event_TicketCbActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        MainForm mainF = new MainForm();
        mainF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void Delete()
    {
        try{
            // create connection
          Connection con = DriverManager.getConnection(db_url,db_username,db_passwd);
          // create statement
          PreparedStatement pst = con.prepareStatement("DELETE FROM ticketmodel where ticket_id='"+TicketCb.getSelectedItem()+"'");
          pst.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        try{
            if(CanceIdtxt.getText().isEmpty() || depcodetxt3.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "THE FIELDS ARE EMPTY","",JOptionPane.WARNING_MESSAGE);
            }else{
                if(CanceIdtxt.getText().length() == 4){
                    // instiatate the MODEL object
                    CancellationMODEL cance = new CancellationMODEL();
                    cance.setCancId(CanceIdtxt.getText());
                    int ticket = Integer.parseInt(TicketCb.getSelectedItem().toString());
                    cance.setTicketId(ticket);
                    int dep = Integer.parseInt(depcodetxt3.getText());
                    cance.setDepcode(dep);
                    cance.setCancDate(CDate3.getDate().toString());
                    // instiatate the dao object
                    Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                    CancellationService service = (CancellationService)registry.lookup("cancellation");
                    String feedback = service.registerCancellation(cance);
                    JOptionPane.showMessageDialog(this, feedback);
                    Delete();
                    DisplayCancellation();
                    clear();
                }else{
                    JOptionPane.showMessageDialog(this, "Cancellation MUST BE FOUR CHARACTER","WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        CanceIdtxt.setText("");
        TicketCb.setSelectedIndex(-1);
        depcodetxt3.setText("");
        CDate3.setDate(null);
        
    }//GEN-LAST:event_ResetBtnMouseClicked

    //int key =0;
    private void CancellationTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancellationTBLMouseClicked
        /*DefaultTableModel model = (DefaultTableModel) CancellationTBL.getModel();
        int myIndex = CancellationTBL.getSelectedRow();
        String dateString = String.valueOf(model.getValueAt(myIndex, 3));
        DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        Date date = null;
        try{
            System.out.println("Number of columns: " + model.getColumnCount() + ", index to access: " + myIndex);
            CanceIdtxt.setText(String.valueOf(model.getValueAt(myIndex, 0)));
            TicketCb.setSelectedItem(String.valueOf(model.getValueAt(myIndex, 1)));
            depcodetxt3.setText(String.valueOf(model.getValueAt(myIndex, 2)));
            if (model.getColumnCount() > 3) {
            CDate3.setDate(new java.sql.Date(date.getTime()));
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_CancellationTBLMouseClicked

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
            java.util.logging.Logger.getLogger(CancellationAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancellationAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancellationAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancellationAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancellationAPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField CanceIdtxt;
    private javax.swing.JTable CancellationTBL;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> TicketCb;
    private javax.swing.JTextField depcodetxt3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
