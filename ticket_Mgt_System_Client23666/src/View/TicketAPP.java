
package View;



import Model.DepartureMODEL;
import Model.PassengersMODEL;
import Model.TicketMODEL;
import Service.TicketService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TicketAPP extends javax.swing.JFrame {
     // global variables
    private String db_url="jdbc:mysql://localhost:3306/ticket_management_system_db";
    private String db_username="root";
    private String db_passwd="";
    // constructor with no arg
DefaultTableModel tableModel = new DefaultTableModel();
    public TicketAPP() {
        initComponents();
        GetPassenger();
        GetDeparture();
        GetPassengerData();
        addColumnTable();
        DisplayTicket();
        clear();
        PNametxt2.setEditable(false);
        Gentxt.setEditable(false);
        PNATtxt.setEditable(false);
    }
private void addColumnTable(){
        tableModel.addColumn("TicketId");
        tableModel.addColumn("PassID");
        tableModel.addColumn("PName");
        tableModel.addColumn("Depcode");
        tableModel.addColumn("PGen");
        tableModel.addColumn("PNAT");
        tableModel.addColumn("Amount");
        TicketTBL.setModel(tableModel);
    }
private void DisplayTicket(){
   try{
       tableModel.setRowCount(0);
       Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
       TicketService service = (TicketService) registry.lookup("ticket");
       List<TicketMODEL> ticketList = service.retrieveAllTicket();
       for (TicketMODEL tick: ticketList){
           tableModel.addRow(new Object[]{
              tick.getTicketId(),
              tick.getPassid().getPDID(),
              tick.getPName(),
              tick.getDepcode().getDepcode(),
              tick.getPGen(),
              tick.getPNAT(),
              tick.getAmount()
           });
       }
   }catch(Exception ex){
            ex.printStackTrace();
            //return null;
        }
}
private void clear(){
        ticketIdTxt.setText("");
        PNametxt2.setText("");
        PNATtxt.setText("");
        amountTxt.setText("");
        searchbyIDTxt.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PNATtxt = new javax.swing.JTextField();
        amountTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TicketTBL = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        PNametxt2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PassIdCb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        depcodeCb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ticketIdTxt = new javax.swing.JTextField();
        Gentxt = new javax.swing.JTextField();
        searchbyIDTxt = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

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
        jLabel1.setText("TICKET MANAGEMENT");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("National ID");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Passenger Name");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Amount");

        PNATtxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        amountTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("TICKET LIST");

        saveBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 0, 153));
        saveBtn.setText("Save");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

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

        TicketTBL.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        TicketTBL.setModel(new javax.swing.table.DefaultTableModel(
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
        TicketTBL.setSelectionBackground(new java.awt.Color(255, 153, 0));
        TicketTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TicketTBL);

        PNametxt2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Passenger ID");

        PassIdCb.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        PassIdCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdCbMouseClicked(evt);
            }
        });
        PassIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassIdCbActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Departure Code");

        depcodeCb.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        depcodeCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depcodeCbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Ticket ID");

        ticketIdTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        Gentxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        searchbyIDTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        SearchBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(0, 0, 153));
        SearchBtn.setText("SEARCH");
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(0, 0, 153));
        refreshBtn.setText("Refresh");
        refreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshBtnMouseClicked(evt);
            }
        });
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ticketIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PassIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PNametxt2))
                                        .addGap(93, 93, 93)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(depcodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Gentxt)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PNATtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(searchbyIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(SearchBtn)
                        .addGap(52, 52, 52)
                        .addComponent(refreshBtn)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(ticketIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(PNametxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(depcodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Gentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(PNATtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(20, 20, 20)
                                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(PassIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetBtn)
                    .addComponent(saveBtn)
                    .addComponent(BackBtn))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchbyIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn)
                    .addComponent(refreshBtn))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
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

    private void PassIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassIdCbActionPerformed
        GetPassengerData();
    }//GEN-LAST:event_PassIdCbActionPerformed

    private void depcodeCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depcodeCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depcodeCbActionPerformed
    private void GetPassenger(){
         try{
             Connection con = DriverManager.getConnection(db_url,db_username,db_passwd);
             PreparedStatement pst = con.prepareStatement("SELECT * FROM passengersmodel");
             ResultSet result = pst.executeQuery();
             while(result.next()){
                 String PID = String.valueOf(result.getInt("pd_id"));
                 PassIdCb.addItem(PID);
             }
         }catch(Exception ex){
            ex.printStackTrace();
            //return null;
        }
    }
    private void GetDeparture(){
        try {
            Connection con = DriverManager.getConnection(db_url,db_username,db_passwd);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM departuremodel");
            ResultSet result = pst.executeQuery();
            while(result.next()){
                String Depcode = result.getString("dep_id");
                depcodeCb.addItem(Depcode);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void GetPassengerData(){
        try{
        Connection con = DriverManager.getConnection(db_url,db_username,db_passwd);
        String selectedItem = (String) PassIdCb.getSelectedItem();
        if (selectedItem != null) {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM passengersmodel WHERE pd_id =" + selectedItem);
            ResultSet result = pst.executeQuery();
            if(result.next()){
                PNametxt2.setText(result.getString("pass_name"));
                Gentxt.setText(result.getString("pass_gen"));
                PNATtxt.setText(result.getString("pass_nat"));
            }
        }
    } catch(Exception ex){
        ex.printStackTrace();
    }
    }
    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        try{
            if(ticketIdTxt.getText().isEmpty() || amountTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "THE FIELDS ARE EMPTY","",JOptionPane.WARNING_MESSAGE);
            }else{
                if(ticketIdTxt.getText().length() == 10){
                    // instiatate the MODEL object
                    //int TICKET = Integer.parseInt(ticketIdTxt.getText());
                    double AMOUNT = Double.parseDouble(amountTxt.getText());
                    if(AMOUNT>=10000 && AMOUNT<=20000){
                    TicketMODEL tick = new TicketMODEL();
                    int ticket = Integer.parseInt(ticketIdTxt.getText());
                    tick.setTicketId(ticket);
                    String passengerInfo = PassIdCb.getSelectedItem().toString();
                    int passid = Integer.parseInt(PassIdCb.getSelectedItem().toString());
                    PassengersMODEL thepass = new PassengersMODEL(passid);
                    tick.setPassid(thepass);
                    tick.setPName(PNametxt2.getText());
                    String departureInfo = depcodeCb.getSelectedItem().toString();
                    int depid = Integer.parseInt(depcodeCb.getSelectedItem().toString());
                    DepartureMODEL thedep = new DepartureMODEL(depid);
                    tick.setDepcode(thedep);
                    tick.setPGen(Gentxt.getText());
                    tick.setPNAT(PNATtxt.getText());
                    tick.setAmount(AMOUNT);
                    // instiatate the service object
                    Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                    TicketService service = (TicketService)registry.lookup("ticket");
                    String feedback = service.registerTicket(tick);
                    JOptionPane.showMessageDialog(this, feedback);
                    DisplayTicket();
                    clear();   
                    }else{
                        JOptionPane.showMessageDialog(this, "Price should be in range 10k to 20k"); 
                    }
                
                }else{
                    JOptionPane.showMessageDialog(this, "TICKET ID MUST BE TEN CHARACTER","WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_saveBtnMouseClicked

    private void PassIdCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdCbMouseClicked
        
    }//GEN-LAST:event_PassIdCbMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        MainForm mainF = new MainForm();
        mainF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        
        ticketIdTxt.setText("");
        PassIdCb.setSelectedIndex(-1);
        PNametxt2.setText("");
        depcodeCb.setSelectedIndex(-1);
        Gentxt.setText("");
        PNATtxt.setText("");
        amountTxt.setText("");
    }//GEN-LAST:event_ResetBtnMouseClicked

    int key =0;
    private void TicketTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketTBLMouseClicked
   
     DefaultTableModel model = (DefaultTableModel) TicketTBL.getModel();
    int myIndex = TicketTBL.getSelectedRow();
    //String keyString = model.getValueAt(myIndex, 0).toString();
    /*try {
        key = Integer.parseInt(keyString);
    } catch (NumberFormatException e) {
        System.err.println("Error: Invalid key value: " + keyString);
    }*/
    System.out.println("Number of columns: " + model.getColumnCount() + ", index to access: " + myIndex);
    ticketIdTxt.setText(String.valueOf(model.getValueAt(myIndex, 0)));
    PassIdCb.setSelectedItem(String.valueOf(model.getValueAt(myIndex, 1)));
    PNametxt2.setText(String.valueOf(model.getValueAt(myIndex, 2)));
    depcodeCb.setSelectedItem(String.valueOf(model.getValueAt(myIndex, 3)));
    Gentxt.setText(String.valueOf(model.getValueAt(myIndex, 4)));
    PNATtxt.setText(String.valueOf(model.getValueAt(myIndex, 5)));
    if (model.getColumnCount() > 6) {
        amountTxt.setText(String.valueOf(model.getValueAt(myIndex, 6)));
    }
    }//GEN-LAST:event_TicketTBLMouseClicked

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBtnMouseClicked

    private void refreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshBtnMouseClicked

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        try{
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
            TicketService service = (TicketService)registry.lookup("ticket");
            int search = Integer.parseInt(searchbyIDTxt.getText());
            TicketMODEL tick = new TicketMODEL(search);
            TicketMODEL thetick = service.searchById(tick);
            tableModel.setRowCount(0);
            tableModel.addRow(new Object[]{
                thetick.getTicketId(),
                thetick.getPassid().getPDID(),
                thetick.getPName(),
                thetick.getDepcode().getDepcode(),
                thetick.getPGen(),
                thetick.getPNAT(),
                thetick.getAmount()
            });
            clear();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        DisplayTicket();
    }//GEN-LAST:event_refreshBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(TicketAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketAPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField Gentxt;
    private javax.swing.JTextField PNATtxt;
    private javax.swing.JTextField PNametxt2;
    private javax.swing.JComboBox<String> PassIdCb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTable TicketTBL;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JComboBox<String> depcodeCb;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField searchbyIDTxt;
    private javax.swing.JTextField ticketIdTxt;
    // End of variables declaration//GEN-END:variables
}
