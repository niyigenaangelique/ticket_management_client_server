/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author rugwi
 */
public class Process extends javax.swing.JFrame {

    /**
     * Creates new form Process
     */
    public Process() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MyProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        STARTBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        MyProgressBar.setBackground(new java.awt.Color(204, 204, 204));
        MyProgressBar.setForeground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText(" Welcome to Bus-Ticket-Transport");

        STARTBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        STARTBtn.setText("START");
        STARTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(397, 397, 397))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(STARTBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(STARTBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MyProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void STARTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTBtnActionPerformed
        // disable parent frame
        this.setEnabled(false);
        // disable parent frame
        this.setEnabled(false);
        
 
        // start progress bar
        Thread start = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    final int progress = i;
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                               //MyProgressBar.setBackground(Color.white);
                               MyProgressBar.setStringPainted(true);
                               
                               // Set the text foreground color to white
                                //MyProgressBar.setForeground(new Color(50,111,180));
                                //MyProgressBar.setBackground(new Color(255, 255, 255));

                                // Create a bold font
                                Font font = MyProgressBar.getFont().deriveFont(Font.BOLD);

                                // Set the font for the progress bar
                                MyProgressBar.setFont(font);
                                     
                                     
                            //jProgressBar.setValue(0);
                            MyProgressBar.setUI(new BasicProgressBarUI() {
                            protected Color getSelectionBackground() { return new Color(7,71,147); }
                            protected Color getSelectionForeground() { return Color.WHITE; }
                            });
                            MyProgressBar.setValue(progress);

                        }
                    });
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }
                }

                // enable parent frame and show LOGIN_PAGE
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        dispose();
                        LoginAPP log = new LoginAPP();
                        log.setVisible(true);
                    }
                });
            }
        });
        start.start();
    }//GEN-LAST:event_STARTBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*Process Myprocess = new Process();
        Myprocess.setVisible(true);
        try{
            for(int i=0; i<=100;i++){
                Thread.sleep(40);
                Myprocess.MyProgressBar.setValue(i);
                Myprocess.Perc.setText(Integer.toString(i)+"%");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        Login log = new Login();
        log.setVisible(true);
        Myprocess.dispose();*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Process().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar MyProgressBar;
    private javax.swing.JButton STARTBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
