
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
        ArrayList allMessages = new ArrayList();
        ArrayList allUser = new ArrayList();
        ArrayList Users = new ArrayList();
        ArrayList Messages = new ArrayList();
        ArrayList Followers = new ArrayList();

        //how to call a function in the main program
        registeredUsers = new main().loadAllUsers();
        allMessages = new main().loadAllMessages();
        System.out.println(registeredUsers);
        System.out.println();
        UserID newUser = new UserID();
        Message newPost = new Message();
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
        if (in.equalsIgnoreCase("Y")) {
            //instantiate gui, set visible
            Loginform login = new Loginform();
            login.setVisible(true);

            Menu menuform = new Menu();
            //menuform.setVisible(true);

            //get the username and the password from an existing user
        }
        
        int i=0;
        while(i< allMessages.size()){
            Message currentMessage= new Message();
            currentMessage= (Message) allMessages.get(i);
            boolean currentPrivacy= currentMessage.getPrivacy();
            if(currentPrivacy== false){
                currentMessage.printMessage();
            }
            i++;
        }

        System.out.println("Welcome to Bottom Hehe");
        System.out.println("Are you a new user? Y/N");
        input = Choice.next();

        while (menu) {

            if ("Y".equalsIgnoreCase(input)) {
                // create a new user
                Users = newUser.NewUser(registeredUsers);  
            }
            else{
                if(newUser.isRegisteredUser(registeredUsers)){
                    System.out.println("Would you like to compose a tweet? T: ");
                    System.out.println("See or add followers? F: ");
                    System.out.println("View your timeline? V");
                    System.out.println("Search tweets by hashtag? H");
                    input= Choice.next();
                    if("T".equalsIgnoreCase(input)){
                        //create new message and add it to list of Messages
                        String tweetAuthor = newUser.getUserName();
                        Messages = newPost.NewMessage(allMessages, tweetAuthor);

                    }
                    if ("F".equalsIgnoreCase(input)) {
                        // this loads all the users
                            // Followers is a global ArrayList
                            Followers = new main().loadFollowers();
                            // object
                            Followers newFollower = new Followers();
                            // ArrayList to hold the current users followers.
                            ArrayList theFollowers = new ArrayList();
                            // menu control
                            boolean followerMenu = true;
                            System.out.println("What is your Username?");
                            String UserName = Choice.next();
                            // adds the followers to the arraylist
                            theFollowers = newFollower.getFollower(UserName, Followers);
                            Collections.sort(theFollowers);
                            while (followerMenu) {
                                System.out.println("Would you like to see your followers? S");
                                System.out.println("Would you like to find new followers? N");
                                System.out.println("Would you like to find a random follower? R");
                                System.out.println(" Are you finished with the followers? Yes/No");
                                input = Choice.next();
                                // print all the followers for the current user
                                if ("S".equalsIgnoreCase(input)) {
                                    for (int b = 0; b < theFollowers.size(); b++) {
                                        String foll;
                                        foll = (String) theFollowers.get(b);
                                        System.out.println(foll);
                                    }// end for
                                }// end if
                                // to find a new follower
                                if ("N".equalsIgnoreCase(input)) {
                                    Followers addFollower = new Followers();
                                    //method call to newFollower
                                    String addNewFollower = addFollower.newFollower(UserName, registeredUsers, theFollowers);
                                    // create new object
                                    Followers newFollows = new Followers(UserName, addNewFollower);
                                    // add to arraylist
                                    Followers.add(newFollows);
                                    Collections.sort(theFollowers);
                                    // write new followers to a files
                                    new main().FollowersToFile(Followers);
                                }// end if
                                // find a random follower
                                if ("R".equalsIgnoreCase(input)) {
                                    Followers randomFollower = new Followers();
                                    //method call to get a random follower
                                    String ranName = randomFollower.randomFollower(UserName, registeredUsers, theFollowers);
                                    // if the method returns null do it again.
                                    while (ranName.equals("null")) {
                                        ranName = randomFollower.randomFollower(UserName, registeredUsers, theFollowers);
                                    }// end while
                                    System.out.println("This is the random User: " + ranName);
                                    System.out.println("Would you like to follow them? Y/N");
                                    String y_n = Choice.next();
                                    if ("Y".equalsIgnoreCase(y_n)) {
                                        // create a new follower add them to the list
                                        Followers newFollows = new Followers(UserName, ranName);
                                        Followers.add(newFollows);
                                        Collections.sort(theFollowers);
                                        new main().FollowersToFile(Followers);
                                    }// end if                      
                                }// end if
                                if ("Yes".equalsIgnoreCase(input)) {
                                    new main().FollowersToFile(Followers);
                                    followerMenu = false;
                                }// end if
                            }// end while
                        }// end if
                    
                    if("V".equalsIgnoreCase(input)){
                        Followers = new main().loadFollowers();
                        String currentUser = newUser.getUserName();
                        Followers userSubscribers= new Followers();
                        for (int a = 0; a < Followers.size(); a++) {
                            userSubscribers = (Followers) Followers.get(a);
                            String currentFollower= userSubscribers.whoAmIfollowing(currentUser);
                            int j=0;
                            while(j< allMessages.size()){
                                Message currentMessage= new Message();
                                currentMessage= (Message) allMessages.get(j);
                                if(currentFollower.equals(currentMessage.getAuthor())){
                                    currentMessage.printMessage();
                                }//end if
                                j++;
                            } //end while
                        }// end for loop
                         
                    }// end if for view timeline
                    
                    if("H".equalsIgnoreCase(input)){
                        System.out.println("Please enter the term you wish to search by, include # symbol");
                        String searchTerm= Choice.next();
                        int k=0;
                        while(k< allMessages.size()){
                        Message currentMessage= new Message();
                        currentMessage= (Message) allMessages.get(k);
                        String thisTweet= currentMessage.getContents();
                        String words[]= thisTweet.split(" ");
                            for(int index=0; index< words.length; index++){
                                if(words[index].equals(searchTerm)){
                                    currentMessage.printMessage();
                                }// end if
                            }//end for loop
                        k++;    
                        }//end while loop
                    }//end if for hashtags
                    
                    }// end if
                }// end if
                System.out.println();
                System.out.println("Do you want to quit? Y/N");
                input = Choice.next();
                if ("Y".equalsIgnoreCase(input)) {
                //this combinds the two arraylist in to one big.
                    // function call to the close the program
                    new main().userToFile(registeredUsers);
                    new main().messageToFile(allMessages);
                    menu = false;
                }// end if
            }// end if
        
    }//END MAIN

    // all the methods load or write to a file.
        // This method will load all the users from a file and put them in to a list.
    public ArrayList loadAllUsers() throws FileNotFoundException {
        ArrayList Users = new ArrayList();
        String UserName;
        String Password;
        String Name;
        String Email;
        FileReader F = new FileReader("Users.txt");
        try (Scanner S = new Scanner(F)) {
            while (S.hasNextLine()) {
                UserName = S.next();
                Password = S.next();
                Name = S.next();
                Email = S.next();
                UserID user = new UserID(Name, UserName, Password, Email);
                Users.add(user);
            }

        } catch (Exception e) {
            System.out.println("Cannot create new inventory to file.");
        }// end catch
        return Users;
    }

    public void userToFile(ArrayList Users) {
        File F = new File("Users.txt");
        F.delete();
        try {
            FileWriter FW = new FileWriter("Users.txt");
            BufferedWriter output = new BufferedWriter(FW);
            UserID fFile = new UserID();
            for (int i = 0; i < Users.size(); i++) {
                fFile = (UserID) Users.get(i);
                output.write(fFile.toStringQuit());
                if (i < Users.size() - 1) {
                    output.newLine();
                }
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Cannot create new inventory to file.");
        }// end catch
    }

    // This method will load all the messages from a file and put them in to a list.
    public ArrayList loadAllMessages() throws FileNotFoundException {
        ArrayList Messages = new ArrayList();
        String Author;
        boolean Privacy;
        String Contents;
        FileReader F = new FileReader("Messages.txt");
        try (Scanner S = new Scanner(F)) {
            while (S.hasNextLine()) {
                Author = S.next();
                Privacy = S.nextBoolean();
                Contents = S.nextLine();
                Message tweet = new Message(Author, Privacy, Contents);
                Messages.add(tweet);
            }

        }
        return Messages;
    }

    public void messageToFile(ArrayList Messages) {
        File F = new File("Messages.txt");
        F.delete();
        try {
            FileWriter FW = new FileWriter("Messages.txt");
            BufferedWriter output = new BufferedWriter(FW);
            Message fFile = new Message();
            for (int i = 0; i < Messages.size(); i++) {
                fFile = (Message) Messages.get(i);
                output.write(fFile.toStringQuit());
                if (i < Messages.size() - 1) {
                    output.newLine();
                }
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Cannot create new inventory to file.");
        }// end catch
    }

    public ArrayList loadFollowers() throws FileNotFoundException {
        String user;
        String Followers;
        ArrayList userIsFollowing = new ArrayList();
        //String whoUserIsFolloiwing;
        FileReader F = new FileReader("Followers.txt");
        try (Scanner S = new Scanner(F)) {
            //S.useDelimiter("\\n");

            while (S.hasNextLine()) {
                user = S.next();
                Followers = S.next();
                Followers userFollows = new Followers(user, Followers);
                userIsFollowing.add(userFollows);
            }

        } catch (Exception e) {
            System.out.println("The Followers File did not open");
        }// end catch
        return userIsFollowing;
    }

    public void FollowersToFile(ArrayList Users) {
        File F = new File("Followers.txt");
        F.delete();
        try {
            FileWriter FW = new FileWriter("Followers.txt");
            BufferedWriter output = new BufferedWriter(FW);
            Followers fFile = new Followers();
            for (int i = 0; i < Users.size(); i++) {
                fFile = (Followers) Users.get(i);
                output.write(fFile.toStringQuit());
                if (i < Users.size() - 1) {
                    output.newLine();
                }
            }
            output.close();
        } catch (Exception e) {
            System.out.println("We can not write the Followers to a file");
        }// end catch
    }
}

