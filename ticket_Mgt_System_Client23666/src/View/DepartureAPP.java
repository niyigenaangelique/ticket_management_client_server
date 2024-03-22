/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Model.DepartureMODEL;
import Service.DepartureService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rugwi
 */
public class DepartureAPP extends javax.swing.JFrame {
    DefaultTableModel tableModel = new DefaultTableModel();
    public DepartureAPP() {
        initComponents();
        addColumnTable();
        DisplayDeparture();
        clear();
    }
    
    private void addColumnTable(){
        tableModel.addColumn("Decode");
        tableModel.addColumn("Source");
        tableModel.addColumn("Destination");
        tableModel.addColumn("TakeoffDate");
        tableModel.addColumn("Seats");
        departureTBL.setModel(tableModel);
    }
    
    private void DisplayDeparture(){
        try{
            tableModel.setRowCount(0);
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
            DepartureService service = (DepartureService) registry.lookup("departure");
            List<DepartureMODEL> departureList = service.retrieveAllDeparture();
            for(DepartureMODEL dep: departureList){
                tableModel.addRow(new Object[]{
                    dep.getDepcode(),
                    dep.getSource(),
                    dep.getDestination(),
                    dep.getTakeoffDate(),
                    dep.getSeats()
                });
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void clear(){
        depcodeTxt.setText("");
        dateCb.setDate(null);
        seatsTxt.setText("");
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
        depcodeTxt = new javax.swing.JTextField();
        destinationCb = new javax.swing.JComboBox<>();
        sourceCb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        seatsTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        departureTBL = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        dateCb = new com.toedter.calendar.JDateChooser();
        searchIDTxt = new javax.swing.JTextField();
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
        jLabel1.setText("MANAGEMENT DEPARTURE");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Source");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Destination");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Departure Code");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Takeoff Date");

        depcodeTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        destinationCb.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        destinationCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationCbActionPerformed(evt);
            }
        });

        sourceCb.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        sourceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kigali City", "Northern Province", "Southern Province", "Eastern Province", "Western Province" }));
        sourceCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceCbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Number of Seats");

        seatsTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("DEPARTURE LIST");

        saveBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 0, 255));
        saveBtn.setText("Save");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(0, 0, 255));
        updateBtn.setText("Update");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 0, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        departureTBL.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        departureTBL.setModel(new javax.swing.table.DefaultTableModel(
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
        departureTBL.setSelectionBackground(new java.awt.Color(255, 153, 0));
        departureTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departureTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(departureTBL);

        dateCb.setForeground(new java.awt.Color(255, 153, 0));
        dateCb.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        searchIDTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        searchBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 0, 255));
        searchBtn.setText("Search");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(0, 0, 255));
        refreshBtn.setText("Refresh");
        refreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshBtnMouseClicked(evt);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1584, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(searchIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(searchBtn)
                                        .addGap(46, 46, 46)
                                        .addComponent(refreshBtn)
                                        .addGap(221, 221, 221)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(596, 596, 596)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(depcodeTxt)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(247, 247, 247))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel3)
                                        .addGap(222, 222, 222)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(destinationCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(sourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(147, 147, 147)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(dateCb, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(61, 61, 61))))
                    .addComponent(jSeparator1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(destinationCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(depcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateCb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backBtn)
                            .addComponent(updateBtn)
                            .addComponent(saveBtn)
                            .addComponent(deleteBtn))))
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(refreshBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
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

    private void destinationCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationCbActionPerformed
   
    }//GEN-LAST:event_destinationCbActionPerformed

    private void sourceCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceCbActionPerformed
        String selectedItem = (String) sourceCb.getSelectedItem();
        //Populate the new sourceCb with items depending on the selected item in the first sourceCb
        switch (selectedItem){
            case "Kigali City":
                destinationCb.setModel(new DefaultComboBoxModel<>(new String[] { "Gasabo", "Kicukiro", "Nyarugenge"}));
                break;
            case "Northern Province":
                destinationCb.setModel(new DefaultComboBoxModel<>(new String[] {"Burera", "Gakenke", "Gicumbi", "Musanze", "Rulindo"}));
                break;
            case "Southern Province":
                destinationCb.setModel(new DefaultComboBoxModel<>(new String[] {"Gisagara", "Huye", "Kamonyi", "Muhanga", "Nyamagabe", "Nyanza", "Nyaruguru", "Ruhango"}));
                break;
            case "Eastern Province":
                destinationCb.setModel(new DefaultComboBoxModel<>(new String[] {"Bugesera", "Gatsibo", "Kayonza", "Kirehe", "Ngoma", "Nyagatare", "Rwamagana"}));
                break;
            case "Western Province":
                destinationCb.setModel(new DefaultComboBoxModel<>(new String[] {"Karongi", "Ngororero", "Nyabihu", "Nyamasheke", "Rubavu", "Rusizi", "Rutsiro"}));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_sourceCbActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainForm main = new MainForm();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        try{
            if(depcodeTxt.getText().isEmpty() || sourceCb.getSelectedIndex() == -1 || destinationCb.getSelectedIndex() == -1 || seatsTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "THE FIELDS ARE EMPTY","",JOptionPane.WARNING_MESSAGE);
            }else{
                if(depcodeTxt.getText().length() == 8){
                    // instiatate the MODEL object
                    //int SEATS = Integer.parseInt(seatsTxt.getText());
                    DepartureMODEL dep = new DepartureMODEL();
                    int PID = Integer.parseInt(depcodeTxt.getText());
                    dep.setDepcode(PID);
                    dep.setSource(sourceCb.getSelectedItem().toString());
                    dep.setDestination(destinationCb.getSelectedItem().toString());
                    dep.setTakeoffDate(dateCb.getDate().toString());
                    dep.setSeats(Integer.valueOf(seatsTxt.getText()));
                    // instiatate the service object
                    Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                    DepartureService service = (DepartureService) registry.lookup("departure");
                    String feedback = service.registerDeparture(dep);
                    JOptionPane.showMessageDialog(this, feedback);
                    DisplayDeparture();
                    clear();
                }else{
                    JOptionPane.showMessageDialog(this, "DEPARTURECODE MUST BE EIGHT CHARACTER","WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_saveBtnMouseClicked

    int key =0;
    private void departureTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departureTBLMouseClicked
      DefaultTableModel model = (DefaultTableModel)departureTBL.getModel();
   int myIndex = departureTBL.getSelectedRow();
   String dateString = String.valueOf(model.getValueAt(myIndex, 3));
   DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
   Date date;
    try {
        date = new java.sql.Date(dateFormat.parse(dateString).getTime());
        //key = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
        System.out.println("Number of columns: " + model.getColumnCount() + ", index to access: " + myIndex);
        depcodeTxt.setText(String.valueOf(model.getValueAt(myIndex, 0)));
        sourceCb.setSelectedItem(String.valueOf(model.getValueAt(myIndex, 1)));
        destinationCb.setSelectedItem(String.valueOf(model.getValueAt(myIndex, 2)));
        dateCb.setDate(new java.sql.Date(date.getTime()));
        if (model.getColumnCount() > 4){
           seatsTxt.setText(String.valueOf(model.getValueAt(myIndex, 4)));
        }
    } catch (ParseException ex) {
        ex.printStackTrace();
    }    
    }//GEN-LAST:event_departureTBLMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        try{
            if(depcodeTxt.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "DepartureCode is required");
            }else if(sourceCb.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(this, "DepartureSource is required");
            }else if(destinationCb.getSelectedIndex() == -1 ){
                JOptionPane.showMessageDialog(this, "DepDestination is required");
            }else if(seatsTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Num Seats is required");
            }else{
                // instiatate the MODEL object
                //int SEATS = Integer.parseInt(seatsTxt.getText());
                DepartureMODEL depUpdate = new DepartureMODEL();
                int PID = Integer.parseInt(depcodeTxt.getText());
                depUpdate.setDepcode(PID);
                depUpdate.setSource(sourceCb.getSelectedItem().toString());
                depUpdate.setDestination(destinationCb.getSelectedItem().toString());
                depUpdate.setTakeoffDate(dateCb.getDate().toString());
                depUpdate.setSeats(Integer.valueOf(seatsTxt.getText()));
                // instiatate the service object
                Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                DepartureService service = (DepartureService) registry.lookup("departure");
                String feedback = service.updateDeparture(depUpdate);
                JOptionPane.showMessageDialog(this, feedback);
                DisplayDeparture();
                clear();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        try{
            if(depcodeTxt.getText().isEmpty() || sourceCb.getSelectedIndex() == -1 || destinationCb.getSelectedIndex() == -1 || seatsTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Select a departure","",JOptionPane.WARNING_MESSAGE);
            }else{
                if(depcodeTxt.getText().length() == 8){
                    // instiatate the MODEL object
                    //int SEATS = Integer.parseInt(seatsTxt.getText());
                    DepartureMODEL depDelete = new DepartureMODEL();
                    int PID = Integer.parseInt(depcodeTxt.getText());
                    depDelete.setDepcode(PID);
                    depDelete.setSource(sourceCb.getSelectedItem().toString());
                    depDelete.setDestination(destinationCb.getSelectedItem().toString());
                    depDelete.setTakeoffDate(dateCb.getDate().toString());
                    depDelete.setSeats(Integer.valueOf(seatsTxt.getText()));
                    // instiatate the dao object
                    Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                    DepartureService service = (DepartureService) registry.lookup("departure");
                    String feedback = service.deleteDeparture(depDelete);
                    JOptionPane.showMessageDialog(this, feedback);
                    DisplayDeparture();
                    clear();
                }else{
                    JOptionPane.showMessageDialog(this, "DEPARTURECODE MUST BE EIGHT CHARACTER","WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        try{
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
            DepartureService service = (DepartureService) registry.lookup("departure");
            int search = Integer.parseInt(searchIDTxt.getText());
            DepartureMODEL dep = new DepartureMODEL(search);
            DepartureMODEL thedep = service.searchById(dep);
            tableModel.setRowCount(0);
            tableModel.addRow(new Object[]{
               thedep.getDepcode(),
               thedep.getSource(),
               thedep.getDestination(),
               thedep.getTakeoffDate(),
               thedep.getSeats()
            });
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnMouseClicked

    private void refreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseClicked
        DisplayDeparture();
    }//GEN-LAST:event_refreshBtnMouseClicked

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
            java.util.logging.Logger.getLogger(DepartureAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartureAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartureAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartureAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartureAPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateCb;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable departureTBL;
    private javax.swing.JTextField depcodeTxt;
    private javax.swing.JComboBox<String> destinationCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchIDTxt;
    private javax.swing.JTextField seatsTxt;
    private javax.swing.JComboBox<String> sourceCb;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
