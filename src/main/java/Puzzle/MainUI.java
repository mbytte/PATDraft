/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puzzle;

/**
 *
 * @author Meganl
 */

public class MainUI extends javax.swing.JFrame 
{
    //screen variables
    public static String[] frameStr = {"frame0", "frame1", "frame2", "frame3", "frame4", "frame5"};
    
    public MainUI() 
    {
        initComponents();
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel2 = new javax.swing.JLabel();
        frame0 = new javax.swing.JButton();
        frame1 = new javax.swing.JButton();
        frame2 = new javax.swing.JButton();
        frame3 = new javax.swing.JButton();
        frame4 = new javax.swing.JButton();
        frame5 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frame0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.jpg"))); // NOI18N
        frame0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame0ActionPerformed(evt);
            }
        });

        frame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.jpg"))); // NOI18N
        frame1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame1ActionPerformed(evt);
            }
        });

        frame2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        frame2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame2ActionPerformed(evt);
            }
        });

        frame3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        frame3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame3ActionPerformed(evt);
            }
        });

        frame4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); // NOI18N
        frame4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame4ActionPerformed(evt);
            }
        });

        frame5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.jpg"))); // NOI18N
        frame5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(frame0, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(frame1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(frame2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(frame4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(frame5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(frame2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frame5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(frame1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frame4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(frame0, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MainUI().setVisible(true);
            }
        });
    }

    //BUTTON PRESSED ACTIONS    
    private void frame1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame1ActionPerformed
    {//GEN-HEADEREND:event_frame1ActionPerformed
        //making PictureSwap an object
        Backend PictureSwap;
        PictureSwap = new Backend();     
        
        //getting the current location of the blank picture
        int blankPicFrame = Backend.getBlankPicPos();
              
        //only swapping pics if the blank space is next to frame1 (frame0, frame2, frame4)
        switch (blankPicFrame)
        {
            case 0 -> //swapping the pictures
                PictureSwap.pictureSwap(frame1, frame0, frameStr[1], frameStr[0]);
            case 2 -> //swapping the pictures
                PictureSwap.pictureSwap(frame1, frame2, frameStr[1], frameStr[2]);
            case 4 -> //swapping the pictures
                PictureSwap.pictureSwap(frame1, frame4, frameStr[1], frameStr[4]);
        }
        
        //checking if the picture is correctly sorted out
        Backend.winCheck();
    }//GEN-LAST:event_frame1ActionPerformed

    
    private void frame0ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame0ActionPerformed
    {//GEN-HEADEREND:event_frame0ActionPerformed
        //making PictureSwap an object
        Backend PictureSwap;
        PictureSwap = new Backend();     
        
        //getting the current location of the blank picture
        int blankPicFrame = Backend.getBlankPicPos();
        
        //only swapping pics if the blank space is next to frame0 (frame1, frame3)
        switch (blankPicFrame)
        {
            case 1 -> //swapping the pictures
                PictureSwap.pictureSwap(frame0, frame1, frameStr[0], frameStr[1]);
            case 3 -> //swapping the pictures
                PictureSwap.pictureSwap(frame0, frame3, frameStr[0], frameStr[3]);
        }
        
        //checking if the picture is correctly sorted out
        Backend.winCheck();
    }//GEN-LAST:event_frame0ActionPerformed

    
    private void frame2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame2ActionPerformed
    {//GEN-HEADEREND:event_frame2ActionPerformed
        //making PictureSwap an object
        Backend PictureSwap;
        PictureSwap = new Backend();     
        
        //getting the current location of the blank picture
        int blankPicFrame = Backend.getBlankPicPos();
        
        //only swapping pics if the blank space is next to frame2 (frame1, frame5)
        switch (blankPicFrame)
        {
            case 1 -> //swapping the pictures
                PictureSwap.pictureSwap(frame2, frame1, frameStr[2], frameStr[1]);
            case 5 -> //swapping the pictures
                PictureSwap.pictureSwap(frame2, frame5, frameStr[2], frameStr[5]);
        }
        
        //checking if the picture is correctly sorted out
        Backend.winCheck();
    }//GEN-LAST:event_frame2ActionPerformed

    private void frame3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame3ActionPerformed
    {//GEN-HEADEREND:event_frame3ActionPerformed
        //making PictureSwap an object
        Backend PictureSwap;
        PictureSwap = new Backend();     
        
        //getting the current location of the blank picture
        int blankPicFrame = Backend.getBlankPicPos();
        
        //only swapping pics if the blank space is next to frame3 (frame0, frame4)
        switch (blankPicFrame)
        {
            case 0 -> //swapping the pictures
                PictureSwap.pictureSwap(frame3, frame0, frameStr[3], frameStr[0]);
            case 4 -> //swapping the pictures
                PictureSwap.pictureSwap(frame3, frame4, frameStr[3], frameStr[4]);
        }
        //checking if the picture is correctly sorted out
        Backend.winCheck();
    }//GEN-LAST:event_frame3ActionPerformed

    
    private void frame4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame4ActionPerformed
    {//GEN-HEADEREND:event_frame4ActionPerformed
        //making PictureSwap an object
        Backend PictureSwap;
        PictureSwap = new Backend();     
        
        //getting the current location of the blank picture
        int blankPicFrame = Backend.getBlankPicPos();
        
        //only swapping pics if the blank space is next to frame4 (frame1, frame3, frame5)
        switch (blankPicFrame)
        {
            case 1 -> //swapping the pictures
                PictureSwap.pictureSwap(frame4, frame1, frameStr[4], frameStr[1]);
            case 3 -> //swapping the pictures
                PictureSwap.pictureSwap(frame4, frame3, frameStr[4], frameStr[3]);
            case 5 -> //swapping the pictures
                PictureSwap.pictureSwap(frame4, frame5, frameStr[4], frameStr[5]);
        }
        
        //checking if the picture is correctly sorted out
        Backend.winCheck();
    }//GEN-LAST:event_frame4ActionPerformed

    
    private void frame5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame5ActionPerformed
    {//GEN-HEADEREND:event_frame5ActionPerformed
        //making PictureSwap an object
        Backend PictureSwap;
        PictureSwap = new Backend();     
        
        //getting the current location of the blank picture
        int blankPicFrame = Backend.getBlankPicPos();
        
        //only swapping pics if the blank space is next to frame5 (frame2, frame4)
        switch (blankPicFrame)
        {
            case 2 -> //swapping the pictures
                PictureSwap.pictureSwap(frame5, frame2, frameStr[5], frameStr[2]);
            case 4 -> //swapping the pictures
                PictureSwap.pictureSwap(frame5, frame4, frameStr[5], frameStr[4]);
        }
        
        //checking if the picture is correctly sorted out
        Backend.winCheck();
    }//GEN-LAST:event_frame5ActionPerformed

    
    //SCREEN COMPONENTS
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton frame0;
    private javax.swing.JButton frame1;
    private javax.swing.JButton frame2;
    private javax.swing.JButton frame3;
    private javax.swing.JButton frame4;
    private javax.swing.JButton frame5;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
