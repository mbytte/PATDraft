/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuzzleBasic;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Meganl
 */
public class UI extends javax.swing.JPanel {
    
    
    String pic1 = "images//flowers1";
    String pic2 = "images//flowers2";
    
    ImageIcon icon1 = new ImageIcon(pic1);
    ImageIcon icon2 = new ImageIcon(pic2);
    
    
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }
    
    public static void main(String[] args) 
    {
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Picture1Screen = new javax.swing.JLabel();
        SwitchButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Picture2Screen = new javax.swing.JLabel();

        Picture1Screen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Meganl\\Documents\\NetBeansProjects\\PATDraft\\src\\main\\resources\\images\\flowers2.jpeg")); // NOI18N
        Picture1Screen.setText("jLabel2");

        SwitchButton.setText("Switch");
        SwitchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchButtonActionPerformed(evt);
            }
        });

        Picture2Screen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Meganl\\Documents\\NetBeansProjects\\PATDraft\\src\\main\\resources\\images\\flowers1.jpg")); // NOI18N
        Picture2Screen.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Picture2Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Picture2Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Picture1Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SwitchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Picture1Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SwitchButton)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SwitchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwitchButtonActionPerformed
        // TODO add your handling code here:
        //label.setIcon(finalIcon);
    }//GEN-LAST:event_SwitchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Picture1Screen;
    private javax.swing.JLabel Picture2Screen;
    private javax.swing.JButton SwitchButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}