/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author FAZA
 */
public class AboutView extends javax.swing.JFrame {

    /**
     * Creates new form AboutView
     */
    public AboutView() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public void KembaliMouseListener(MouseListener l) {
        this.Button_kembali.addMouseListener(l);
    }

    public JButton getButton_kembali() {
        return Button_kembali;
    }

    public void setButton_kembali(JButton Button_kembali) {
        this.Button_kembali = Button_kembali;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_kembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/About/btn-back.png"))); // NOI18N
        Button_kembali.setBorderPainted(false);
        Button_kembali.setContentAreaFilled(false);
        Button_kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_kembali.setFocusable(false);
        getContentPane().add(Button_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/About/bg-About.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_kembali;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
