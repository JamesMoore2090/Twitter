
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
        ArrayList allMessages= new ArrayList();
        ArrayList allUser = new ArrayList();
        ArrayList Users = new ArrayList();
        ArrayList Messages= new ArrayList();
        ArrayList Followers = new ArrayList();
        
        
        //how to call a function in the main program
        registeredUsers = new main().loadAllUsers();
        allMessages= new main().loadAllMessages();
        System.out.println(registeredUsers);
        System.out.println();
        UserID newUser = new UserID();
        Message newPost= new Message();
        boolean menu = true;
        
        Scanner Choice = new Scanner(System.in);
        String input;
        
        //Choose to use gui or to use the console
        //COMPLETELY FOR DEBUGGING PURPOSES. DELETE AFTER FINAL COMMIT
        System.out.println("WARNING: IF YOU CHOOSE TO USE GUI, IT IS BUGGY/ NOT FULLY FINISHED. USE THE CONSOLE UNTIL GUI IS COMPLETED. TEST YOUR CODE IN THE CONSOLE.");
        System.out.println("Y/N for GUI: ");
        
        Scanner scan = new Scanner(System.in);
        String in;
        in = scan.next();
        if(in.equalsIgnoreCase("Y")){
            //instantiate gui, set visible
            Loginform login = new Loginform();
            login.setVisible(true);
            
            //get the username and the password from an existing user
            
            
        }
        
        int i=0;
        while(i< allMessages.size()){
            Message currentMessage= new Message();
            currentMessage= (Message) allMessages.get(i);
            String currentPrivacy= currentMessage.getPrivacy();
            if(currentPrivacy.equals("public")){
                currentMessage.printMessage();
            }
            i++;
        }
        
        System.out.println("Welcome to Bottom Hehe");
        System.out.println("Are you a new user? Y/N");
        input = Choice.next();
        
        while(menu){

            
            if("Y".equalsIgnoreCase(input)){
                // create a new user
                Users = newUser.NewUser(registeredUsers);  
            }
            else{
                if(newUser.isRegisteredUser(registeredUsers)){
                    System.out.println("Would you like to compose a tweet? T");
                    System.out.println("See or add followers? F");
                    input= Choice.next();
                    if("T".equalsIgnoreCase(input)){
                        //create new message and add it to list of Messages
                        String tweetAuthor= newUser.getUserName();
                        Messages= newPost.NewMessage(allMessages, tweetAuthor);
                        
                    }
                    if("F".equalsIgnoreCase(input)){
                        Followers = new main().loadFollowers();
                        Followers newFollower = new Followers();
                        boolean followerMenu = true;
                        while(followerMenu){
                            System.out.println("Would you like to see your followers? S");
                            System.out.println("Would you like to find new followers? N");
                            System.out.println("Would you like to find a random follower? R");
                            System.out.println(" Are you finished with the followers? Yes/No");
                            input = Choice.next();
                            if ("S".equalsIgnoreCase(input)) {
                                // for right now I need to ask what the username is.
                                System.out.println("What is your Username?");
                                String UserName = Choice.next();
                                Followers foundFollower = new Followers();
                                foundFollower.seeFollowers(UserName, Followers);
                                      
                                
                            }// end if
                            if ("N".equalsIgnoreCase(input)) {
                                System.out.println("What is your Username?");
                                String UserName = Choice.next();
                                System.out.println();
                                Followers foundFollower = new Followers();
                                UserID followUser = new UserID();
                                for(int a = 0; a < registeredUsers.size(); a++){
                                      followUser = (UserID) registeredUsers.get(a);
                                      if(!UserName.equals(followUser.getUserName())){
                                          System.out.println(followUser.UserName);
                                      }
                                      
                                }
                                System.out.println("Who would you like to follow?");
                                      input = Choice.next();
                                      //newFollower.addTo(input);

                            }
                            if ("R".equalsIgnoreCase(input)) {

                            }
                            if ("Yes".equalsIgnoreCase(input)) {
                                new main().FollowersToFile(Followers);
                                followerMenu = false;
                            }
                        }// end while
                    }
                
                }
            }
            System.out.println();
            System.out.println("Do you want to quit? Y/N");
            input = Choice.next();
            if("Y".equalsIgnoreCase(input)){
                //this combinds the two arraylist in to one big.
                // function call to the close the program
                new main().userToFile(registeredUsers);
                new main().messageToFile(allMessages);
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
    
    
        // This method will load all the messages from a file and put them in to a list.
    public ArrayList loadAllMessages() throws FileNotFoundException{
        ArrayList Messages = new ArrayList();
        String Author;
        String Privacy;
        String Contents;
        FileReader F = new FileReader("Messages.txt");
        try(Scanner S = new Scanner(F)){
            while(S.hasNextLine()){
                Author = S.next();
                Privacy = S.next();
                Contents = S.nextLine();
                Message tweet = new Message(Author, Privacy, Contents);
                Messages.add(tweet);
            }
       
        }
    return Messages;
    }

    public void messageToFile(ArrayList Messages){
        File F = new File("Messages.txt");
        F.delete();
        try{
            FileWriter FW = new FileWriter("Messages.txt");
            BufferedWriter output = new BufferedWriter(FW);
            Message fFile = new Message();
            for(int i = 0; i < Messages.size(); i++){
                fFile = (Message) Messages.get(i);
                output.write(fFile.toStringQuit());
                if(i < Messages.size()-1){
                    output.newLine();
                }
            }
            output.close();
        }
        catch (Exception e){
            System.out.println("Cannot create new inventory to file.");
        }// end catch
    }


    public ArrayList loadFollowers() throws FileNotFoundException{
        String user;
        String Followers;
        ArrayList userIsFollowing = new ArrayList();
        //String whoUserIsFolloiwing;
        FileReader F = new FileReader("Followers.txt");
        try(Scanner S = new Scanner(F)){
            S.useDelimiter("\\n");
            //user = S.next();
            
            while(S.hasNext()){
                
                Followers = S.next();
                Followers userFollows = new Followers(Followers);
                userIsFollowing.add(userFollows);
            }
       
        }
       catch (Exception e){
            System.out.println("The Followers File did not open");
        }// end catch
    return userIsFollowing;
    }

    public void FollowersToFile(ArrayList Users){
        File F = new File("Followers.txt");
        F.delete();
        try{
            FileWriter FW = new FileWriter("Followers.txt");
            BufferedWriter output = new BufferedWriter(FW);
            Followers fFile = new Followers();
            for(int i = 0; i < Users.size(); i++){
                fFile = (Followers) Users.get(i);
                    output.write(fFile.toStringQuit());   
            }
            output.close();
        }
        catch (Exception e){
            System.out.println("We can not write the Followers to a file");
        }// end catch
    }
}
