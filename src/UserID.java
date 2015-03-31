
import java.util.*;


/*
 * This class creates the user Object.

Other Stuff maybe added later
 */

/**
 *
 * @author James
 */
public class UserID {
    
    public UserID(){
        
    }

// constructor to create the user.
    public UserID(String name, String username, String passWord, String email){
        Name = name;
        UserName = username;
        Password = passWord;
        Email = email;
    }
    
    public String getUserName(){
        return UserName;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getEmail(){
        return Email;
    }
    // there is a problem with this and checking to see if there are two of the same usernames
    public ArrayList NewUser(ArrayList Users){
        // ask the user for information 
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a username");
        UserName = userInput.next();
        UserID user = new UserID();
        int i = 0;
        while(i < Users.size()){
            user = (UserID) Users.get(i);
            System.out.println("Here");
            if( UserName.equals(user.getUserName())){
                System.out.println("This Username is already being used please choose another.");
                UserName = userInput.next();
            }
            i++;
        }
        // Name, username, password, and email
        System.out.println("Please enter your password");
        Password = userInput.next();
        System.out.println("Please enter your name");
        Name = userInput.next();
        System.out.println("Please enter your email");
        Email = userInput.next();
        // if not then then create a new userID object
        UserID newUser = new UserID(Name, UserName, Password, Email);
        Users.add(newUser);
        return Users;
    }
    
    // this will get users login information and check to make sure they are in the list
    public boolean isRegisteredUser(ArrayList users){
        return true;
    }

    @Override
    public String toString() {
        return "UserID + " + UserName +" " +Password +" "+Name +" "+ Email ;
    }
    public String toStringQuit(){
        return UserName + " " + Password + " " + Name + " " + Email;
    }
    
    
    protected String UserName;
    protected String Password;
    protected String Name;
    protected String Email;
}
