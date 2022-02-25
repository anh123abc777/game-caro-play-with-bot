
package caro;


public class Start extends javax.swing.JFrame {

    private final Settings settings = new Settings();
    public Start() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        twoPlayers = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        onePlayer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BT_Toturial = new javax.swing.JButton();
        buttonSettings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setLocation(new java.awt.Point(700, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        twoPlayers.setBackground(new java.awt.Color(69, 65, 64));
        twoPlayers.setFont(new java.awt.Font("UVN Ai Cap Nang", 1, 24)); // NOI18N
        twoPlayers.setForeground(new java.awt.Color(255, 255, 255));
        twoPlayers.setText("Hai người chơi");
        twoPlayers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        twoPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayersActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(189, 87, 52));
        exit.setFont(new java.awt.Font("UVN Ai Cap Nang", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Thoát");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        onePlayer.setBackground(new java.awt.Color(69, 65, 64));
        onePlayer.setFont(new java.awt.Font("UVN Ai Cap Nang", 1, 24)); // NOI18N
        onePlayer.setForeground(new java.awt.Color(255, 255, 255));
        onePlayer.setText("Một người chơi");
        onePlayer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        onePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePlayerActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caro/anh/caro.jpg"))); // NOI18N

        BT_Toturial.setBackground(new java.awt.Color(240, 240, 240));
        BT_Toturial.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BT_Toturial.setForeground(new java.awt.Color(51, 51, 51));
        BT_Toturial.setText("  !  ");
        BT_Toturial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_Toturial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ToturialActionPerformed(evt);
            }
        });

        buttonSettings.setBackground(new java.awt.Color(69, 65, 64));
        buttonSettings.setFont(new java.awt.Font("UVN Ai Cap Nang", 1, 24)); // NOI18N
        buttonSettings.setForeground(new java.awt.Color(255, 255, 255));
        buttonSettings.setText("Tuỳ Chỉnh");
        buttonSettings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(twoPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(onePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BT_Toturial)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BT_Toturial)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(twoPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(onePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public Settings getSettings(){
        return settings;
    }
    public Start getModelStart(){
        return this;
    }
    private void twoPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayersActionPerformed
        new SetName(this).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_twoPlayersActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void onePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePlayerActionPerformed
        new Play("you","com",settings.getSizeBoard(),settings.getWidthBoard(),0,0,settings.getTimeLimit(),true,this).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onePlayerActionPerformed

    private void BT_ToturialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ToturialActionPerformed
        new Toturial().setVisible(true);
    }//GEN-LAST:event_BT_ToturialActionPerformed

    private void buttonSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSettingsActionPerformed
        
        settings.setVisible(true);
        
    }//GEN-LAST:event_buttonSettingsActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Toturial;
    private javax.swing.JButton buttonSettings;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton onePlayer;
    private javax.swing.JButton twoPlayers;
    // End of variables declaration//GEN-END:variables
}
