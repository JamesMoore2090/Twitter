
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
        getContentPane().setBackground(java.awt.Color.cyan);
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
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        displayHashtag = new javax.swing.JTextArea();
        getHashtag = new javax.swing.JButton();
        hashtag = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

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

        jLabel4.setText("View Private Tweets");

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

        jLabel6.setText("Search for users to follow");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Search Hashtags");

        displayHashtag.setColumns(20);
        displayHashtag.setRows(5);
        jScrollPane3.setViewportView(displayHashtag);

        getHashtag.setText("Search");
        getHashtag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getHashtagActionPerformed(evt);
            }
        });

        hashtag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashtagActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Minion reaching.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(getHashtag))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(goviewCreateTweet))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(goviewFollowers)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(viewTweets))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(103, 103, 103)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateTweets)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(goviewCreateTweet)
                                    .addComponent(goviewFollowers)
                                    .addComponent(viewTweets))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(hashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(getHashtag, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateTweets)))
                .addContainerGap(157, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu.this.setVisible(false);
        new SearchUsers().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hashtagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashtagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hashtagActionPerformed

    private void getHashtagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getHashtagActionPerformed
        //get whats in the search box
        String Hashtag = hashtag.getText();
        
        //get all messages
        ArrayList allMessages = new ArrayList();
        try {
            allMessages = new main().loadAllMessages();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //System.out.println("Please enter the term you wish to search by, include # symbol");
        String searchTerm= Hashtag;
        int k=0;
        while(k< allMessages.size()){
            Message currentMessage= new Message();
            currentMessage= (Message) allMessages.get(k);
            String thisTweet= currentMessage.getContents();
            String words[]= thisTweet.split(" ");
            for(int index=0; index< words.length; index++){
                if(words[index].equals(searchTerm)){
                    displayHashtag.append(currentMessage.toString() + "\n");
                    }// end if
                }//end for loop
                k++;    
        }//end while loop
    }//GEN-LAST:event_getHashtagActionPerformed

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
    private javax.swing.JTextArea displayHashtag;
    private javax.swing.JTextArea displayTweets;
    private javax.swing.JButton getHashtag;
    private javax.swing.JButton goviewCreateTweet;
    private javax.swing.JButton goviewFollowers;
    private javax.swing.JTextField hashtag;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
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
