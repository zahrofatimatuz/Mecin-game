/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author adheraprabu
 */
public class v_home extends javax.swing.JFrame {

    /**
     * Creates new form v_home
     */
    public v_home() {
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

        Button_play = new javax.swing.JButton();
        Button_Bantuan = new javax.swing.JButton();
        Button_Tentang = new javax.swing.JButton();
        Button_keluar = new javax.swing.JButton();
        Label_level1 = new javax.swing.JLabel();
        Label_level2 = new javax.swing.JLabel();
        Judul = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_play.setText("Play");
        Button_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_playActionPerformed(evt);
            }
        });
        getContentPane().add(Button_play, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        Button_Bantuan.setText("Bantuan");
        getContentPane().add(Button_Bantuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        Button_Tentang.setText("Tentang");
        getContentPane().add(Button_Tentang, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, -1, -1));

        Button_keluar.setText("Keluar");
        getContentPane().add(Button_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        Label_level1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_level1.setText("Level 1");
        Label_level1.setOpaque(true);
        getContentPane().add(Label_level1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 110, 140));

        Label_level2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_level2.setText("Level 2");
        Label_level2.setOpaque(true);
        getContentPane().add(Label_level2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 110, 140));

        Judul.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Judul.setText("Wellcome");
        getContentPane().add(Judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        Background.setBackground(new java.awt.Color(255, 102, 102));
        Background.setForeground(new java.awt.Color(255, 204, 204));
        Background.setOpaque(true);
        Background.setPreferredSize(new java.awt.Dimension(1200, 750));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_playActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_playActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Button_Bantuan;
    private javax.swing.JButton Button_Tentang;
    private javax.swing.JButton Button_keluar;
    private javax.swing.JButton Button_play;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel Label_level1;
    private javax.swing.JLabel Label_level2;
    // End of variables declaration//GEN-END:variables
}
