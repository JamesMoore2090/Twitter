
import java.io.*;
import java.util.*
;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class Followers {
     


    // constructor
    public Followers(){
        
    }
     
     public Followers(String user, String newFollower){
            User = user;
            follower = newFollower;  
    }

    public String newFollower(String User, ArrayList Users) {
        UserID followUser = new UserID();
        Scanner whoToFollow = new Scanner(System.in);
        String input;
        for (int a = 0; a < Users.size(); a++) {
            followUser = (UserID) Users.get(a);
            if (!User.equals(followUser.getUserName())) {
                    System.out.println(followUser.UserName);
            }

        }
        System.out.println("Who would you like to follow?");
        input = whoToFollow.next();
        return input;
    }
     
    
     public String getFollower(){
         return follower;
     }
    
     public int compareTo(Followers other) {
        return this.User.compareTo(other.User);
    }// end method
     
    public void seeFollowers(String userName){
        if(userName.equals(User)){
            System.out.println(follower);
        }
    }
    
    public String whoAmIfollowing(String userName){
        if(userName.equals(User)){
            return follower;
        }
        else return "You have no followers";
    }
    
    public void randomFollower(){
        // suggest a random follower from the registered users list
    }
    
     @Override
    public String toString(){
        return follower;
    }
    
    public String toStringQuit(){
        
        return User + " " + follower;
    }
    
    protected String User;
    protected String follower;
}
