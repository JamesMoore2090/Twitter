
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
        ArrayList Users = new ArrayList();
        registeredUsers = new main().loadAllUsers();
        System.out.println(registeredUsers);
        System.out.println();
        UserID newUser = new UserID();
        boolean menu = true;
        
        Scanner Choice = new Scanner(System.in);
        String input;
        
        while(menu){
        
            System.out.println("Welcome to Bottom Hehe");
            System.out.println("Are you a new user? Y/N");
            input = Choice.next();
            if("Y".equalsIgnoreCase(input)){
                // create a new user
                Users = newUser.NewUser(registeredUsers);  
            }
            else{
                if(newUser.isRegisteredUser(registeredUsers)){
                    System.out.println("Do cool stuff here");
                }
            }
            System.out.println();
            System.out.println("Do you want to quit? Y/N");
            input = Choice.next();
            if("Y".equalsIgnoreCase(input)){
                //this combinds the two arraylist in to one big.
                // function call to the close the program
                new main().userToFile(registeredUsers);
                menu = false;
            }
            
    
        }
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
       catch (Exception e){
            System.out.println("Cannot create new inventory to file.");
        }// end catch
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

