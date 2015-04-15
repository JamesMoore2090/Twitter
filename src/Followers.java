
import java.io.*;
import java.util.*;
/*
 * The followers class is used to create a followers object with the user and follower.
 * There are also methods to get a random user to follow, get a new follower, and 
 * to send the followers to an ArrayList.
 */

/**
 *
 * @author James
 */
public class Followers {

    /**
     * The basic constructor for the Followers.
     */
    public Followers() {

    }// end constructor

    /**
     * This is the non default constructor, sets the user and follower.
     * @param user
     * @param newFollower 
     */
    public Followers(String user, String newFollower) {
        User = user;
        follower = newFollower;
    }// end non default constructor
   
    public int compareTo(Followers other) {
        return this.User.compareTo(other.User);
    }// end method
    
    /**
     * This prints the list of users then returns a new user to the main.
     * @param User
     * @param Users
     * @param follows
     * @return 
     */
    public String newFollower(String User, ArrayList Users, ArrayList follows) {
        UserID followUser = new UserID();
        Scanner whoToFollow = new Scanner(System.in);
        String input;
        String foll;
        int a = 0; // counter control
        int c = 0; // counter control
        while (a < Users.size()) {
            c = 0;
            followUser = (UserID) Users.get(a);
            if (c < follows.size()) {
                foll = (String) follows.get(c);
                if ((!User.equals(followUser.UserName) && (!foll.equals(followUser.UserName)))) {
                    System.out.println(followUser.UserName);
                }// end if
                c++;
            }// end if
            a++;
        }// end while
        System.out.println("Who would you like to follow?");
        input = whoToFollow.next();
        return input;
    }// end method

    /**
     * This creates an arrayList of the current users followers.
     * @param userName
     * @param follows
     * @return 
     */
    public ArrayList getFollower(String userName, ArrayList follows) {
        Followers foundFollower = new Followers();
        ArrayList followerList = new ArrayList();
        for (int a = 0; a < follows.size(); a++) {
            foundFollower = (Followers) follows.get(a);
            // method call
            String test = foundFollower.whoAmIfollowing(userName);
            if (test != null) {
                followerList.add(test);
            }// end if
        }// end for
        return followerList;
    }//end method

    /**
     * This returns the followers else return null
     * @param userName
     * @return 
     */
    public String whoAmIfollowing(String userName) {
        if (userName.equals(User)) {
            return follower;
        }
        else return "You have no followers";
    }
    
    public void randomFollower(){
        // suggest a random follower from the registered users list
        UserID followUser = new UserID();
        String foll;
        int a = 0;// counter controller
        int c = 0; // counter controller
        // create a random number
        Random rm = new Random();
        int size = user.size(); // gets the size
        int ranNum = rm.nextInt(size);
        UserID ranUser = new UserID();
        ranUser = (UserID) user.get(ranNum); // gets random user
        // now test it to see if you are already following this person!
        while (a < size) {
            c = 0;
            followUser = (UserID) user.get(a);
            if (c < follows.size()) {
                foll = (String) follows.get(c);
                if ((!userName.equals(ranUser.UserName) && (!foll.equals(ranUser.UserName)))) {
                    // return if you get here
                    return ranUser.getUserName();
                }// end if
                c++;
            }// end if
            a++;
        }// end while
        // else return null
        return null;
    }// end method

    @Override
    public String toString() {
        return follower;
    }// end meth

    /**
     * This the how we get the info in the right format to send to the file.
     *
     * @return
     */
    public String toStringQuit() {
        return User + " " + follower;
    }// end method

    protected String User;
    protected String follower;
}
