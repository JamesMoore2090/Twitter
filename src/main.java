
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList registeredUsers = new ArrayList();
        ArrayList allUser = new ArrayList();
        registeredUsers = new main().loadAllUsers();
        System.out.println(registeredUsers);
        UserID newUser = new UserID();
        ArrayList Users = newUser.NewUser(registeredUsers);
        allUser.addAll(Users);
        allUser.addAll(registeredUsers);
        
    
        new main().userToFile(allUser);
    }
    
        // This method will load all the users from a file and put them in to a list.
    public ArrayList loadAllUsers() throws FileNotFoundException{
        ArrayList Users = new ArrayList();
        String UserName;
        String Password;
        String Name;
        String Email;
        FileReader F = new FileReader("Users.txt");
        try(Scanner S = new Scanner(F)){
            while(S.hasNextLine()){
                UserName = S.next();
                Password = S.next();
                Name = S.next();
                Email = S.next();
                UserID user = new UserID(Name, UserName, Password, Email);
                Users.add(user);
            }
       
        }
    return Users;
    }

    public void userToFile(ArrayList Users){
        File F = new File("Users.txt");
        F.delete();
        try{
            FileWriter FW = new FileWriter("Users.txt");
            BufferedWriter output = new BufferedWriter(FW);
            UserID fFile = new UserID();
            for(int i = 0; i < Users.size(); i++){
                fFile = (UserID) Users.get(i);
                output.write(fFile.toStringQuit());
                if(i < Users.size()-1){
                    output.newLine();
                }
            }
            output.close();
        }
        catch (Exception e){
            System.out.println("Cannot create new inventory to file.");
        }// end catch
    }
}

