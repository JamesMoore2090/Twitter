
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
     protected ArrayList<String> UserFollows = new ArrayList();

    // constructor
    public Followers(){
        
    }
    
    //non default constructor
    public Followers(String user, String userFollowers){
        if(User.equals(user)){
            UserFollows.add(userFollowers);
        }
        else {
            User = user;
            UserFollows.add(userFollowers);
        }
    }
    
    public void randomFollower(){
        // suggest a random follower from the registered users list
    }
    
    public String toStringQuit(){
        String NewUsers = null;
        for(int i = 0; i < UserFollows.size(); i++){
             NewUsers =  User + " " + UserFollows.get(i) + '\n';
        }
        return NewUsers;
    }
    
}
