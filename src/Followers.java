
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
     protected ArrayList followersList = new ArrayList();
     protected String User;
     protected String follower;
     private String combo;
     protected ArrayList<String> UserFollows = new ArrayList();

    // constructor
    public Followers(){
        
    }
     
     public Followers(String newFollower){
            //User = user;
            follower = newFollower;
            //UserFollows.add(user);
            UserFollows.add(newFollower);
        
        
    }
    
    
    public String getUser(){
        return User;
    }
    
    public ArrayList getList(){
        return UserFollows;
    }
    
    public String getFollower(int i){
        String Follower = UserFollows.get(i);
        return Follower;
    }
    
    public void seeFollowers(String userName, ArrayList Followers){
        
        Followers follower = new Followers();
        
        //System.out.println(Followers.get(0));
       // System.out.println(follower.toString() + " here");
        for(int i = 1; i < Followers.size(); i++){
            follower = (Followers) Followers.get(i);
            if(userName.equals(follower.getFollower(i))){
                System.out.println(follower.toString());
            }
        }
    }
    
    public void randomFollower(){
        // suggest a random follower from the registered users list
    }
    
     @Override
    public String toString(){
        return follower;
    }
    
    public String toStringQuit(){
        
        return follower;
    }
    
}
