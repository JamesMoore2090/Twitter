
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
    public Message(String postAuthor, String postPrivacy, String messagePost){
        Author= postAuthor;
        Privacy= postPrivacy;
        Contents= messagePost;
    }
    
    public String getAuthor(){
        return Author;
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
     * @param tweetAuthor user who posted tweet
     * @return ArrayList
     */
    public ArrayList NewMessage(ArrayList Messages, String tweetAuthor){
        Message post= new Message();
        Scanner input=  new Scanner(System.in);
        input.useDelimiter("\\n");
        System.out.println("Would you like this Tweet to be public or private?");
        Privacy= input.next();
        System.out.println("Please enter your tweet: ");
        Contents= input.next();
        Author= tweetAuthor;
        //Create new message object
        Message newMessage= new Message(Author, Privacy, Contents);
        //Add new message to list
        Messages.add(newMessage);
        return Messages;
            
    
    }
    
    //this is used to print out tweets
    public void printMessage(){
        System.out.println( Author + ": "+ "\n" + Contents + "\n");
    }
    
    // this is used for printing the info to a file
    public String toStringQuit(){
        return Author + " " +Privacy + " " + Contents;
    }// end method
    
    //Data Members
    protected String Privacy;
    protected String Contents;
    protected String Author;
}
