/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wahib
 */
public class formPengembalian extends javax.swing.JPanel {

    /**
     * Creates new form formPengembalian
     */
    public formPengembalian() {
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

        pelangganLbl1 = new javax.swing.JLabel();
        id_pelanggan2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(52, 73, 94));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pelangganLbl1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        pelangganLbl1.setForeground(new java.awt.Color(255, 255, 255));
        pelangganLbl1.setText("ID ORDER");
        add(pelangganLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, 30));

        id_pelanggan2.setBackground(new java.awt.Color(52, 73, 94));
        id_pelanggan2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        id_pelanggan2.setForeground(new java.awt.Color(255, 255, 255));
        id_pelanggan2.setBorder(null);
        add(id_pelanggan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 290, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 290, 10));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_pelanggan2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pelangganLbl1;
    // End of variables declaration//GEN-END:variables
}