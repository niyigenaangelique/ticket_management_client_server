/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Model.PassengersMODEL;
import Service.PassengerService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class PassengersAPP extends javax.swing.JFrame {
    DefaultTableModel tableModel = new DefaultTableModel();
    public PassengersAPP() {
        initComponents();
        addColumnTable();
        DisplayPassengers();
        clear();
    }
 private void addColumnTable(){
         
        tableModel.addColumn("PID");
        tableModel.addColumn("PName");
        tableModel.addColumn("PNAT");
        tableModel.addColumn("PGen");
        tableModel.addColumn("PAdd");
        tableModel.addColumn("Pphone");
        passengerTbl.setModel(tableModel);
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
        PGencb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Pphonetxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengerTbl = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        PNametxt = new javax.swing.JTextField();
        PAddcb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        PIDtxt = new javax.swing.JTextField();
        searchIdTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
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
        jLabel1.setText("PASSENGERS MANAGEMENT");

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
        jLabel7.setText("Address");

        PNATtxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        PGencb.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        PGencb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        PGencb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGencbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Phone");

        Pphonetxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Pphonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PphonetxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("PASSENGERS LIST");

        saveBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 0, 204));
        saveBtn.setText("Save");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 204));
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(0, 0, 204));
        updateBtn.setText("Update");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 0, 204));
        deleteBtn.setText("Delete");
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        passengerTbl.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        passengerTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        passengerTbl.setSelectionBackground(new java.awt.Color(255, 153, 0));
        passengerTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passengerTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(passengerTbl);

        PNametxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        PAddcb.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        PAddcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasabo", "Kicukiro", "Nyarugenge", "Burera", "Gakenke", "Gicumbi", "Musanze", "Rulindo", "Gisagara", "Huye", "Kamonyi", "Muhanga", "Nyamagabe", "Nyanza", "Nyaruguru", "Ruhango", "Bugesera", "Gatsibo", "Kayonza", "Kirehe", "Ngoma", "Nyagatare", "Rwamagana", "Karongi", "Ngororero", "Nyabihu", "Nyamasheke", "Rubavu", "Rusizi", "Rutsiro" }));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Passenger ID");

        PIDtxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        searchIdTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        searchBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 0, 204));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(0, 0, 204));
        refreshBtn.setText("Refresh");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1584, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(searchBtn)
                                        .addGap(70, 70, 70)
                                        .addComponent(refreshBtn)
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(PIDtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(PNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(80, 80, 80)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(PNATtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(71, 71, 71)))
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(PGencb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Pphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(43, 43, 43)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1061, 1061, 1061)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(PAddcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(168, 168, 168))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PNATtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PGencb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(Pphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backBtn)
                            .addComponent(updateBtn)
                            .addComponent(saveBtn)
                            .addComponent(deleteBtn))
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(PAddcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PGencbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGencbActionPerformed

    }//GEN-LAST:event_PGencbActionPerformed
   
    private void DisplayPassengers(){
        try{
            tableModel.setRowCount(0);
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
            PassengerService service = (PassengerService) registry.lookup("passenger");
            List<PassengersMODEL> passengerList = service.retrieveAllPassengers();
            for(PassengersMODEL pass: passengerList){
                tableModel.addRow(new Object[]{
                    pass.getPDID(),
                    pass.getPName(),
                    pass.getPNAT(),
                    pass.getPGen(),
                    pass.getPAdd(),
                    pass.getPphone()
                });
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void clear()
    {
        PIDtxt.setText("");
        PNametxt.setText("");
        PNATtxt.setText("");
        Pphonetxt.setText("");
    }
    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        try{
            if(PIDtxt.getText().isEmpty() || PNametxt.getText().isEmpty() || Pphonetxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "THE FIELDS ARE EMPTY","",JOptionPane.WARNING_MESSAGE);
            }else{
                if(PIDtxt.getText().length() == 5){
                    int PID = Integer.parseInt(PIDtxt.getText());
                    // instiatate the MODEL object
                    PassengersMODEL pas = new PassengersMODEL();
                    pas.setPDID(PID);
                    pas.setPName(PNametxt.getText());
                    pas.setPNAT(PNATtxt.getText());
                    pas.setPGen(PGencb.getSelectedItem().toString());
                    pas.setPAdd(PAddcb.getSelectedItem().toString());
                    pas.setPphone(Pphonetxt.getText());
                    // instiatate the service object
                    Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                    PassengerService service = (PassengerService)registry.lookup("passenger");
                    String feedback = service.registerPassenger(pas);
                    JOptionPane.showMessageDialog(this, feedback);
                    DisplayPassengers();
                    clear();
                }else{
                    JOptionPane.showMessageDialog(this, "ID MUST BE FIVE CHARACTER","WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }   
    }//GEN-LAST:event_saveBtnMouseClicked

    private void PphonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PphonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PphonetxtActionPerformed

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        try{
            if(PIDtxt.getText().isEmpty() || PNametxt.getText().isEmpty() || Pphonetxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Select a Passenger","",JOptionPane.WARNING_MESSAGE);
            }else{
                if(PIDtxt.getText().length() == 5){
                    int PID = Integer.parseInt(PIDtxt.getText());
                    // instiatate the MODEL object
                    PassengersMODEL deleteP = new PassengersMODEL();
                    deleteP.setPDID(PID);
                    deleteP.setPName(PNametxt.getText());
                    deleteP.setPNAT(PNATtxt.getText());
                    deleteP.setPGen(PGencb.getSelectedItem().toString());
                    deleteP.setPAdd(PAddcb.getSelectedItem().toString());
                    deleteP.setPphone(Pphonetxt.getText());
                    // instiatate the service object
                    Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                    PassengerService service = (PassengerService)registry.lookup("passenger");
                    String feedback = service.deletePassenger(deleteP);
                    JOptionPane.showMessageDialog(this, feedback);
                    DisplayPassengers();
                    clear();
                }else{
                    JOptionPane.showMessageDialog(this, "ID MUST BE FIVE CHARACTER","WARNING",JOptionPane.WARNING_MESSAGE); 
                }
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteBtnMouseClicked
    int Key =0;
    private void passengerTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengerTblMouseClicked
     DefaultTableModel model = (DefaultTableModel)passengerTbl.getModel();
    int myIndex = passengerTbl.getSelectedRow();
    Key = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
    System.out.println("Number of columns: " + model.getColumnCount() + ", index to access: " + myIndex);
    PIDtxt.setText(String.valueOf(model.getValueAt(myIndex, 0)));
    PNametxt.setText(String.valueOf(model.getValueAt(myIndex, 1)));
    PNATtxt.setText(String.valueOf(model.getValueAt(myIndex, 2)));
    PGencb.setSelectedItem(String.valueOf(model.getValueAt(myIndex, 3)));
    PAddcb.setSelectedItem(String.valueOf(model.getValueAt(myIndex, 4)));
    if (model.getColumnCount() > 5) {
        Pphonetxt.setText(String.valueOf(model.getValueAt(myIndex, 5)));
    }
    }//GEN-LAST:event_passengerTblMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        MainForm mainF = new MainForm();
        mainF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        try{
            if(PIDtxt.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Passenger ID is required");
            }else if(PNametxt.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Passenger Name is required");
            }else if(PNATtxt.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Passenger National ID is required");
            }else if (Pphonetxt.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Passenger Phone Number is required");
            }else{
               // instiatate the MODEL object
                int PID = Integer.parseInt(PIDtxt.getText());
                PassengersMODEL updateP = new PassengersMODEL();
                updateP.setPDID(PID);
                updateP.setPName(PNametxt.getText());
                updateP.setPNAT(PNATtxt.getText());
                updateP.setPGen(PGencb.getSelectedItem().toString());
                updateP.setPAdd(PAddcb.getSelectedItem().toString());
                updateP.setPphone(Pphonetxt.getText());
                // instiatate the service object
                Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                PassengerService service = (PassengerService)registry.lookup("passenger");
                String feedback = service.updatePassenger(updateP);
                JOptionPane.showMessageDialog(this, feedback);
                DisplayPassengers();
                clear();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateBtnMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try{
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
            PassengerService service = (PassengerService)registry.lookup("passenger");
            int search = Integer.parseInt(searchIdTxt.getText());
            PassengersMODEL pass = new PassengersMODEL(search);
            PassengersMODEL thepass = service.searchById(pass);
            tableModel.setRowCount(0);
            tableModel.addRow(new Object[]{
               thepass.getPDID(),
               thepass.getPName(),
               thepass.getPNAT(),
               thepass.getPGen(),
               thepass.getPAdd(),
               thepass.getPphone()
            });
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        DisplayPassengers();
    }//GEN-LAST:event_refreshBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PassengersAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassengersAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassengersAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassengersAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengersAPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PAddcb;
    private javax.swing.JComboBox<String> PGencb;
    private javax.swing.JTextField PIDtxt;
    private javax.swing.JTextField PNATtxt;
    private javax.swing.JTextField PNametxt;
    private javax.swing.JTextField Pphonetxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable passengerTbl;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchIdTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
