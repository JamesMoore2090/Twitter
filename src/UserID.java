/*
 * This class creates the user Object.

Other Stuff maybe added later
 */

/**
 *
 * @author James
 */
public class UserID {
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
    
    protected String UserName;
    protected String Password;
    protected String Name;
    protected String Email;
}
