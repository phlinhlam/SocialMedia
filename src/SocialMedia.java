import java.util.ArrayList;
import java.util.Scanner;

public class SocialMedia {
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User();
        User user3 = new User();

        ArrayList<User> userDB = new ArrayList<>();//database

        System.out.println("Log in information");
        user.setUserEmail("myemail");
        user.setPassword("mypassword");
        userDB.add(user);

        user2.setUserEmail("user2email");
        user2.setPassword("user2pass");
        userDB.add(user2);

        user3.setUserEmail("user3email");
        user3.setPassword("user3pass");
        userDB.add(user3);
        //check for userInfo arraylist
        for(User u : userDB)
        {
            System.out.println(u.getUserEmail());
            System.out.println(u.getPassword());
        } //this works

        Scanner kb = new Scanner(System.in);
        //prompt user to enter login info
        System.out.println("Enter user email: ");
        String e = kb.nextLine();
        System.out.println("Enter password: ");
        String p = kb.nextLine();
        String yesNo = "yes";

        //check
        for(User u : userDB) {
            if(!u.getUserEmail().equalsIgnoreCase(e) && u.getPassword().equalsIgnoreCase(p))
            {
                System.out.println("Invalid email and/or password");
            }
            else if(u.getUserEmail().equalsIgnoreCase(e) && u.getPassword().equalsIgnoreCase(p)) {
                do {
                    System.out.println("Hi " +u.getUserEmail()+". Where do you want to log into?");
                    System.out.println("Type 1 for Facebook");
                    System.out.println("Type 2 for Twitter");
                    System.out.println("Type 3 for Instagram");
                    int choice = kb.nextInt();
                    switch (choice) {
                        case 1:
                            Facebook f = new Facebook();
                            f.logIn();
                            f.addPhoto();
                            f.displayFacebook();
                            break;
                        case 2:
                            Twitter t = new Twitter();
                            t.logIn();
                            t.displayTwitter();
                            t.retweet();
                            break;
                        case 3:
                            Instagram i = new Instagram();
                            i.logIn();
                            i.displayInsta();
                            break;
                    }//end switch
                    System.out.println("Do you want to continue? (Yes/No)");
                    yesNo = kb.next();
                    System.out.println("");

                } while (yesNo.equalsIgnoreCase("yes"));
                u.logOut();
                System.out.println("Goodbye");
            }//end else-if
        }//end for
    }//end main

}



