/** This is the userID class. This creates userID objects. There are also method 
 * that create new users and to see if a user is registered.
 * 
 */
/**
 *
 * @author James Moore
 */
import java.util.*;
public class UserID {
    // constructor
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
    /**
     * This creates a new user object. It also asks the user all the info for the user.
     * It also checks to make sure the username is unique.
     * @param Users
     * @return ArrayList
     */
    public ArrayList NewUser(ArrayList Users){
        UserID user = new UserID();
        Scanner userInput = new Scanner(System.in);
        boolean newUserIsTheSame = true; // while loop controller 
        int i =0; // counter
        // this checks to make sure the username is unique.
        while(newUserIsTheSame){
            System.out.println("Please enter a username");
            UserName = userInput.next();
            user = (UserID) Users.get(i);
            if(UserName.equals(user.getUserName())){
                System.out.println("This username " + UserName+ " is already taken. Please choose another");
            }// end if
            else newUserIsTheSame= false;
            i++;
        }// end while
        // Name, username, password, and email
        System.out.println("Please enter your password");
        Password = userInput.next();
        System.out.println("Please enter your name");
        Name = userInput.next();
        System.out.println("Please enter your email");
        Email = userInput.next();
        // create a new object!
        UserID newUser = new UserID(Name, UserName, Password, Email);
        // now add it to the ArrayList
        Users.add(newUser);
        // return the ArrayList
        return Users;
    }//end method
    
    
    //cant have input from console from any method. Will not work with gui
    public ArrayList NewUser(ArrayList Users, String UserName, String passData, String nameData, String emailData){
        UserID user = new UserID();
        boolean newUserIsTheSame = true;
        int i = 0;
        while(newUserIsTheSame){
            user = (UserID) Users.get(i);
            if(UserName.equals(user.getUserName())){
                
            }else{
                newUserIsTheSame = false;
                i++;
            }
        }
        Password = passData;
        Name = nameData;
        Email = emailData;
        UserID newUser = new UserID(Name, UserName, Password, Email);
        Users.add(newUser);
        return Users; 
                
    }
    
    /**
     * This makes sure the user is registered.
     * @param Users
     * @return boolean
     */
    public boolean isRegisteredUser(ArrayList Users){
        boolean isNotRegistered = true;// while loop controller
        UserID user = new UserID();
        Scanner userInput = new Scanner(System.in);
        int i = 0;// cointer
        System.out.println("Username: ");
        UserName = userInput.next();
        System.out.println("Password: ");
        Password = userInput.next();
        // Got through the list to see if the username and password match and if they are in the list
        while(isNotRegistered && i < Users.size()){
            user = (UserID) Users.get(i);
            if(UserName.equals(user.getUserName()) && Password.equals(user.getPassword())){
                isNotRegistered = false; // yes it is in the list. this gets us out of the while loop
            } // end if
        i++;
        }//end while loop
        // return true if it was found
        if(!isNotRegistered){
            return true;
        }// end if
        //if not print a message and try again.
        else{
            System.out.println("The username and password does not match");
            return false;
        }// end else
        
    }// end method
    
    //needs to not require input from user during console to be usable in gui
    public boolean isRegUser(ArrayList Users, String name, String pass){
        boolean isNotRegistered = true;
                UserID user= new UserID();
                int i = 0;
                while(isNotRegistered & i < Users.size()){
                    user = (UserID) Users.get(i);
                    if(name.equals(user.getUserName()) && pass.equals(user.getPassword())){
                        isNotRegistered = false; // yes it is in the list. this gets us out of the while loop
                    }   
                    i++;
                }
                if(!isNotRegistered){
                    return true;
                }else{
                    return false;
                }
    }
    

    @Override
    public String toString() {
        return "UserID + " + UserName +" " +Password +" "+Name +" "+ Email +"\n";
    }// end method
    // this is used for printing the info to a file
    public String toStringQuit(){
        return UserName + " " + Password + " " + Name + " " + Email;
    }// end method
    
    
    protected String UserName;
    protected String Password;
    protected String Name;
    protected String Email;
}
