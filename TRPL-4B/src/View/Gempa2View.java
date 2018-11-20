/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author rkhis
 */
public class Gempa2View extends javax.swing.JFrame {

    /** Creates new form Gempa2View */
    public Gempa2View() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public void ObatMouseListener(MouseListener l) {
        this.Button_Obat.addMouseListener(l);
    }
    
    public void ObatdanSapuMouseListener(MouseListener l) {
        this.Button_ObatdanSapu.addMouseListener(l);
    }
    
    public void ObatdanTanduMouseListener(MouseListener l) {
        this.Button_ObatdanTandu.addMouseListener(l);
    }
    
    public void TanduMouseListener(MouseListener l) {
        this.Button_Tandu.addMouseListener(l);
    }
    
    public JButton getButton_Obat() {
        return Button_Obat;
    }

    public void setButton_Obat(JButton Button_Obat) {
        this.Button_Obat = Button_Obat;
    }

    public JButton getButton_ObatdanSapu() {
        return Button_ObatdanSapu;
    }

    public void setButton_ObatdanSapu(JButton Button_ObatdanSapu) {
        this.Button_ObatdanSapu = Button_ObatdanSapu;
    }

    public JButton getButton_ObatdanTandu() {
        return Button_ObatdanTandu;
    }

    public void setButton_ObatdanTandu(JButton Button_ObatdanTandu) {
        this.Button_ObatdanTandu = Button_ObatdanTandu;
    }

    public JButton getButton_Tandu() {
        return Button_Tandu;
    }

    public void setButton_Tandu(JButton Button_Tandu) {
        this.Button_Tandu = Button_Tandu;
    }

    public JLabel getLabel_darah() {
        return Label_darah;
    }

    public void setLabel_darah(JLabel Label_darah) {
        this.Label_darah = Label_darah;
    }

    public JLabel getBg() {
        return bg;
    }

    public void setBg(JLabel bg) {
        this.bg = bg;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_ObatdanSapu = new javax.swing.JButton();
        Button_ObatdanTandu = new javax.swing.JButton();
        Button_Tandu = new javax.swing.JButton();
        Button_Obat = new javax.swing.JButton();
        Label_darah = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_ObatdanSapu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/PopUp/opt-obatdanSapu.png"))); // NOI18N
        Button_ObatdanSapu.setBorder(null);
        Button_ObatdanSapu.setBorderPainted(false);
        Button_ObatdanSapu.setContentAreaFilled(false);
        Button_ObatdanSapu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_ObatdanSapu.setFocusable(false);
        getContentPane().add(Button_ObatdanSapu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        Button_ObatdanTandu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/PopUp/opt-obatdanTandu.png"))); // NOI18N
        Button_ObatdanTandu.setBorder(null);
        Button_ObatdanTandu.setBorderPainted(false);
        Button_ObatdanTandu.setContentAreaFilled(false);
        Button_ObatdanTandu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_ObatdanTandu.setFocusable(false);
        getContentPane().add(Button_ObatdanTandu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, -1, -1));

        Button_Tandu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/PopUp/opt-tandu.png"))); // NOI18N
        Button_Tandu.setBorder(null);
        Button_Tandu.setBorderPainted(false);
        Button_Tandu.setContentAreaFilled(false);
        Button_Tandu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Tandu.setFocusable(false);
        getContentPane().add(Button_Tandu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        Button_Obat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/PopUp/opt-obat.png"))); // NOI18N
        Button_Obat.setBorder(null);
        Button_Obat.setBorderPainted(false);
        Button_Obat.setContentAreaFilled(false);
        Button_Obat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Obat.setFocusable(false);
        getContentPane().add(Button_Obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        Label_darah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Level/100_.png"))); // NOI18N
        getContentPane().add(Label_darah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Level/korbanGempa.png"))); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(1200, 750));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Gempa2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gempa2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gempa2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gempa2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gempa2View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Obat;
    private javax.swing.JButton Button_ObatdanSapu;
    private javax.swing.JButton Button_ObatdanTandu;
    private javax.swing.JButton Button_Tandu;
    private javax.swing.JLabel Label_darah;
    private javax.swing.JLabel bg;
    // End of variables declaration//GEN-END:variables

}
