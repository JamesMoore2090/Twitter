
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jameson
 */
public class Message {
    //Constructor
    public Message(){
   
    }
    
    //Constructor to create new message
    public Message(String postPrivacy, String messagePost){
        Privacy= postPrivacy;
        Contents= messagePost;
    }
    
    public String getPrivacy(){
        return Privacy;
    }
    
    public String getContents(){
        return Contents;
    }
    
    /**
     * This creates a new message object, as well as puts each new object into a list of messages
     * @param Messages the list of messages
     * @return ArrayList
     */
    public ArrayList NewMessage(ArrayList Messages){
        Message post= new Message();
        Scanner input=  new Scanner(System.in);
        System.out.println("Would you like this Tweet to be public or private?");
        Privacy= input.next();
        System.out.println("Please enter your tweet: ");
        Contents= input.next();
        //Create new message object
        Message newMessage= new Message(Privacy, Contents);
        //Add new message to list
        Messages.add(newMessage);
        return Messages;
            
    
    }
    
    // this is used for printing the info to a file
    public String toStringQuit(){
        return Privacy + " " + Contents;
    }// end method
    
    //Data Members
    protected String Privacy;
    protected String Contents;
}
