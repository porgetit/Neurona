/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe;

import java.util.HashMap;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class MainMenu extends javax.swing.JFrame {
    private final boolean isSinglePlayer;

    /**
     * Creates new form MainView
     */
    public MainMenu() {
        this.isSinglePlayer = true;
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

        jLabel1 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        OnePersonButton = new javax.swing.JButton();
        TwoPeopleButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        jLabel1.setText("Vista Uno");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(167, 300));
        setMinimumSize(new java.awt.Dimension(167, 300));
        setName("mainMenu"); // NOI18N
        setSize(new java.awt.Dimension(167, 300));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("TicTacToe");
        Title.setEnabled(false);

        OnePersonButton.setBackground(new java.awt.Color(0, 0, 0));
        OnePersonButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OnePersonButton.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        OnePersonButton.setText("VS Machine");
        OnePersonButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OnePersonButton.setBorderPainted(false);
        OnePersonButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OnePersonButton.setFocusPainted(false);
        OnePersonButton.setFocusable(false);
        OnePersonButton.setOpaque(true);
        OnePersonButton.setPreferredSize(new java.awt.Dimension(106, 50));
        OnePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnePersonButtonActionPerformed(evt);
            }
        });

        TwoPeopleButton.setBackground(new java.awt.Color(0, 0, 0));
        TwoPeopleButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TwoPeopleButton.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        TwoPeopleButton.setText("VS Player");
        TwoPeopleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TwoPeopleButton.setBorderPainted(false);
        TwoPeopleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TwoPeopleButton.setFocusPainted(false);
        TwoPeopleButton.setFocusable(false);
        TwoPeopleButton.setPreferredSize(new java.awt.Dimension(106, 50));
        TwoPeopleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoPeopleButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ExitButton.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        ExitButton.setText("Exit");
        ExitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitButton.setBorderPainted(false);
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.setFocusPainted(false);
        ExitButton.setFocusable(false);
        ExitButton.setPreferredSize(new java.awt.Dimension(106, 50));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Title)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TwoPeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OnePersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Title)
                .addGap(32, 32, 32)
                .addComponent(OnePersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TwoPeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void OnePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnePersonButtonActionPerformed
        this.dispose();
        new GameView(new HashMap<String, Integer>() {{
            put("Player 1", 0);
            put("Machine", 0);
        }}).setVisible(true);
    }//GEN-LAST:event_OnePersonButtonActionPerformed

    private void TwoPeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoPeopleButtonActionPerformed
        this.dispose();
        new GameView(new HashMap<String, Integer>() {{
            put("Player 1", 0);
            put("Player 2", 0);
        }}).setVisible(true);
    }//GEN-LAST:event_TwoPeopleButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton OnePersonButton;
    private javax.swing.JLabel Title;
    private javax.swing.JButton TwoPeopleButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}