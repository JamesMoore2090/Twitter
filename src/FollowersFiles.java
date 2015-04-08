
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
public class FollowersFiles {
    
               // This method will load all the users from a file and put them in to a list.
    public ArrayList loadFollowers() throws FileNotFoundException{
        String user;
        String Followers;
        ArrayList userIsFollowing = new ArrayList();
        String whoUserIsFolloiwing;
        FileReader F = new FileReader("Followers.txt");
        try(Scanner S = new Scanner(F)){
            user = S.next();
            while(S.hasNextLine()){
                Followers = S.next();
                Followers userFollows = new Followers(user, Followers);
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
                if(i < Users.size()-1){
                    output.newLine();
                }
            }
            output.close();
        }
        catch (Exception e){
            System.out.println("We can not write the Followers to a file");
        }// end catch
    }
}
