
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle Tracy
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        goviewCreateTweet = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        goviewFollowers = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        viewTweets = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTweets = new javax.swing.JTextArea();
        updateTweets = new javax.swing.JButton();

        jScrollPane2.setViewportView(jScrollBar1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu");

        jLabel2.setText("Create Tweet");

        goviewCreateTweet.setText("Tweet");
        goviewCreateTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goviewCreateTweetActionPerformed(evt);
            }
        });

        jLabel3.setText("View Followers");

        goviewFollowers.setText("View");

        jLabel4.setText("View Tweets");

        viewTweets.setText("View Tweets");
        viewTweets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTweetsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Latest Tweets");

        displayTweets.setColumns(20);
        displayTweets.setRows(5);
        jScrollPane1.setViewportView(displayTweets);

        updateTweets.setText("Update");
        updateTweets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTweetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(567, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(562, 562, 562))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(goviewCreateTweet))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(goviewFollowers)
                        .addGap(82, 82, 82)
                        .addComponent(viewTweets)))
                .addGap(297, 297, 297)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(updateTweets)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goviewCreateTweet)
                            .addComponent(goviewFollowers)
                            .addComponent(viewTweets))
                        .addGap(361, 361, 361))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(updateTweets)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goviewCreateTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goviewCreateTweetActionPerformed
        //get rid of this frame
        Menu.this.setVisible(false);
        
        //go to next frame
        new createTweetForm().setVisible(true);
    }//GEN-LAST:event_goviewCreateTweetActionPerformed

    private void viewTweetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTweetsActionPerformed
        Menu.this.setVisible(false);
        
        new viewTweets().setVisible(true);
    }//GEN-LAST:event_viewTweetsActionPerformed

    private void updateTweetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTweetsActionPerformed
        //copy and create new file
        


        //get all messages imported
        ArrayList allMessages = new ArrayList();
        
        try {
            allMessages = new main().loadAllMessages();
            
            //update the tweet with tweets from users
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        int i=0;
        while(i< allMessages.size()){
            Message currentMessage= new Message();
            currentMessage= (Message) allMessages.get(i);
            boolean currentPrivacy= currentMessage.getPrivacy();
           if(currentPrivacy== false){
               
                displayTweets.append(currentMessage.toString() + "\n");
                
            }
            i++;
        }

        
    }//GEN-LAST:event_updateTweetsActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea displayTweets;
    private javax.swing.JButton goviewCreateTweet;
    private javax.swing.JButton goviewFollowers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton updateTweets;
    private javax.swing.JButton viewTweets;
    // End of variables declaration//GEN-END:variables

    public ArrayList loadAllMessages() throws FileNotFoundException {
        ArrayList Messages = new ArrayList();
        String Author;
        boolean Privacy;
        String Contents;
        FileReader F = new FileReader("Messages.txt");
        try (Scanner S = new Scanner(F)) {
            while (S.hasNextLine()) {
                Author = S.next();
                Privacy = S.nextBoolean();
                Contents = S.nextLine();
                Message tweet = new Message(Author, Privacy, Contents);
                Messages.add(tweet);
            }

        }
        return Messages;
    }


}
