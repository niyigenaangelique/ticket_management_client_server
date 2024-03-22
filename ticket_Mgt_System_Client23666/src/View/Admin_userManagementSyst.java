
package View;


import Model.SignUpMODEL;
import Service.SignUpService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Admin_userManagementSyst extends javax.swing.JFrame {

   DefaultTableModel tableModel = new DefaultTableModel();
    public Admin_userManagementSyst() {
        initComponents();
        addColumnTable();
        DisplayUser();
        clear();
    }
    private void addColumnTable(){
        tableModel.addColumn("UsId");
        tableModel.addColumn("FName");
        tableModel.addColumn("LName");
        tableModel.addColumn("ADD1");
        tableModel.addColumn("ADD2");
        tableModel.addColumn("Password");
        USERTBL.setModel(tableModel);
    }
    private void DisplayUser(){
        try{
            tableModel.setRowCount(0);
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
            SignUpService service = (SignUpService) registry.lookup("signup");
            List<SignUpMODEL> signupList = service.retrieveAllSignUp();
            for(SignUpMODEL sign: signupList){
                tableModel.addRow(new Object[]{
                    sign.getUsId(),
                    sign.getFName(),
                    sign.getLName(),
                    sign.getADD1(),
                    sign.getADD2(),
                    sign.getPassword()
                });
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void clear(){
        UserIDtxt.setText("");
        FNametxt.setText("");
        LNametxt.setText("");
        //ADD1Cb.setSelectedIndex(-1);
        //ADD2Cb.setSelectedIndex(-1);
        PasswordField2.setText("");
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
        UserIDtxt = new javax.swing.JTextField();
        ADD2Cb = new javax.swing.JComboBox<>();
        ADD1Cb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        LNametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        USERTBL = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        FNametxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PasswordField2 = new javax.swing.JPasswordField();
        searchByIdTxt = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        SearchByIDBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

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
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("MANAGEMENT USER'S");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Address");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("USER ID");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("FIRST NAME");

        UserIDtxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        ADD2Cb.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        ADD2Cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD2CbActionPerformed(evt);
            }
        });

        ADD1Cb.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        ADD1Cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kigali City", "Northern Province", "Southern Province", "Eastern Province", "Western Province" }));
        ADD1Cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD1CbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("PASSWORD");

        LNametxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("USER'S LIST");

        LogOutBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 153));
        LogOutBtn.setText("LogOut");
        LogOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseClicked(evt);
            }
        });

        UpdateBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(0, 0, 153));
        UpdateBtn.setText("Update");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(0, 0, 153));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        USERTBL.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        USERTBL.setModel(new javax.swing.table.DefaultTableModel(
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
        USERTBL.setSelectionBackground(new java.awt.Color(255, 153, 0));
        USERTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                USERTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(USERTBL);

        FNametxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("LAST NAME");

        PasswordField2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        searchByIdTxt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        Refresh.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        Refresh.setForeground(new java.awt.Color(0, 0, 153));
        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });

        SearchByIDBtn.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        SearchByIDBtn.setForeground(new java.awt.Color(0, 0, 153));
        SearchByIDBtn.setText("Search");
        SearchByIDBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchByIDBtnMouseClicked(evt);
            }
        });
        SearchByIDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByIDBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(115, 115, 115))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(UserIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(LNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ADD1Cb, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(ADD2Cb, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(219, 219, 219)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(PasswordField2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(502, 502, 502)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(searchByIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(SearchByIDBtn)
                        .addGap(43, 43, 43)
                        .addComponent(Refresh)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(UserIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(ADD1Cb)
                                .addComponent(ADD2Cb)
                                .addComponent(PasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogOutBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchByIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh)
                    .addComponent(SearchByIDBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1867, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADD2CbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD2CbActionPerformed

    }//GEN-LAST:event_ADD2CbActionPerformed

    private void ADD1CbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD1CbActionPerformed
        String selectedItem = (String) ADD1Cb.getSelectedItem();
        switch (selectedItem){
            case "Kigali City":
                ADD2Cb.setModel(new DefaultComboBoxModel<>(new String[] { "Gasabo", "Kicukiro", "Nyarugenge"}));
                break;
            case "Northern Province":
                ADD2Cb.setModel(new DefaultComboBoxModel<>(new String[] {"Burera", "Gakenke", "Gicumbi", "Musanze", "Rulindo"}));
                break;
            case "Southern Province":
                ADD2Cb.setModel(new DefaultComboBoxModel<>(new String[] {"Gisagara", "Huye", "Kamonyi", "Muhanga", "Nyamagabe", "Nyanza", "Nyaruguru", "Ruhango"}));
                break;
            case "Eastern Province":
                ADD2Cb.setModel(new DefaultComboBoxModel<>(new String[] {"Bugesera", "Gatsibo", "Kayonza", "Kirehe", "Ngoma", "Nyagatare", "Rwamagana"}));
                break;
            case "Western Province":
                ADD2Cb.setModel(new DefaultComboBoxModel<>(new String[] {"Karongi", "Ngororero", "Nyabihu", "Nyamasheke", "Rubavu", "Rusizi", "Rutsiro"}));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_ADD1CbActionPerformed

     int key =0;
    private void USERTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USERTBLMouseClicked
        DefaultTableModel model = (DefaultTableModel) USERTBL.getModel();
        int myIndex = USERTBL.getSelectedRow();
        //String keyString = model.getValueAt(myIndex, 0).toString();
        /*try {
        key = Integer.parseInt(keyString);
            } catch (NumberFormatException e) {
            System.err.println("Error: Invalid key value: " + keyString);
        }*/
        System.out.println("Number of columns: " + model.getColumnCount() + ", index to access: " + myIndex);
        UserIDtxt.setText(String.valueOf(model.getValueAt(myIndex, 0)));
        FNametxt.setText(String.valueOf(model.getValueAt(myIndex, 1)));
        LNametxt.setText(String.valueOf(model.getValueAt(myIndex, 2)));
        ADD1Cb.setSelectedItem(String.valueOf(model.getValueAt(myIndex, 3)));
        ADD2Cb.setSelectedItem(String.valueOf(model.getValueAt(myIndex, 4)));
        if (model.getColumnCount() > 5) {
            PasswordField2.setText(String.valueOf(model.getValueAt(myIndex, 5)));
        }
    }//GEN-LAST:event_USERTBLMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        try{
            if(UserIDtxt.getText().trim().isEmpty() || FNametxt.getText().trim().isEmpty() || LNametxt.getText().trim().isEmpty() || ADD1Cb.getSelectedIndex() == -1 || ADD2Cb.getSelectedIndex() == -1 || PasswordField2.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "THE FIELDS ARE EMPTY","",JOptionPane.WARNING_MESSAGE);
            }else{
                if(UserIDtxt.getText().length() == 5){
                    if(PasswordField2.getText().length() < 8 || PasswordField2.getText().length() > 16){
                        JOptionPane.showMessageDialog(this, "PASSWORD MUST BE BETWEEN 8 AND 16 CHARACTERS","WARNING",JOptionPane.WARNING_MESSAGE);
                    }else{
                        // instiatate the MODEL object
                        SignUpMODEL sign = new SignUpMODEL();
                        int user = Integer.parseInt(UserIDtxt.getText());
                        sign.setUsId(user);
                        sign.setFName(FNametxt.getText());
                        sign.setLName(LNametxt.getText());
                        sign.setADD1(ADD1Cb.getSelectedItem().toString());
                        sign.setADD2(ADD2Cb.getSelectedItem().toString());
                        sign.setPassword(PasswordField2.getText());
                        // instiatate the dao object
                        Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                        SignUpService service = (SignUpService) registry.lookup("signup");
                        String feedback = service.updateSignUp(sign);
                        JOptionPane.showMessageDialog(this, feedback);
                        DisplayUser();
                        clear();
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "ID MUST BE FIVE CHARACTER","WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        try{
            if(UserIDtxt.getText().trim().isEmpty() || FNametxt.getText().trim().isEmpty() || LNametxt.getText().trim().isEmpty() || ADD1Cb.getSelectedIndex() == -1 || ADD2Cb.getSelectedIndex() == -1 || PasswordField2.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "THE FIELDS ARE EMPTY","",JOptionPane.WARNING_MESSAGE);  
            }else{
                    // instiatate the MODEL object
                    SignUpMODEL sign = new SignUpMODEL();
                    int user = Integer.parseInt(UserIDtxt.getText());
                    sign.setUsId(user);
                    sign.setFName(FNametxt.getText());
                    sign.setLName(LNametxt.getText());
                    sign.setADD1(ADD1Cb.getSelectedItem().toString());
                    sign.setADD2(ADD2Cb.getSelectedItem().toString());
                    sign.setPassword(PasswordField2.getText());
                    // instiatate the dao object
                    Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
                    SignUpService service = (SignUpService) registry.lookup("signup");
                    String feedback = service.deleteSignUp(sign);
                    JOptionPane.showMessageDialog(this, feedback);
                    DisplayUser();
                    clear();
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void LogOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseClicked
        LoginAPP log = new LoginAPP();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutBtnMouseClicked

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        DisplayUser();
    }//GEN-LAST:event_RefreshMouseClicked

    private void SearchByIDBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchByIDBtnMouseClicked
        
    }//GEN-LAST:event_SearchByIDBtnMouseClicked

    private void SearchByIDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByIDBtnActionPerformed
        try{
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",6000);
            SignUpService service = (SignUpService)registry.lookup("signup");
            int search = Integer.parseInt(searchByIdTxt.getText());
            SignUpMODEL sign = new SignUpMODEL(search);
            SignUpMODEL thesign = service.searchById(sign);
            tableModel.setRowCount(0);
            tableModel.addRow(new Object[]{
                thesign.getUsId(),
                thesign.getFName(),
                thesign.getLName(),
                thesign.getADD1(),
                thesign.getADD2(),
                thesign.getPassword()
            });
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_SearchByIDBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_userManagementSyst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_userManagementSyst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_userManagementSyst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_userManagementSyst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_userManagementSyst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ADD1Cb;
    private javax.swing.JComboBox<String> ADD2Cb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField FNametxt;
    private javax.swing.JTextField LNametxt;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPasswordField PasswordField2;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton SearchByIDBtn;
    private javax.swing.JTable USERTBL;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField UserIDtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField searchByIdTxt;
    // End of variables declaration//GEN-END:variables
}
