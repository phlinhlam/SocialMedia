import java.util.ArrayList;
import java.util.Scanner;

public class SocialMedia {
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User();

        ArrayList<User> userDB = new ArrayList<>();//database
        System.out.println("Log in information");
        user.setUserEmail("myemail");
        user.setPassword("mypassword");
        userDB.add(user);

        user2.setUserEmail("user2email");
        user2.setPassword("user2pass");
        userDB.add(user2);

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
        if(user.getUserEmail().equalsIgnoreCase(e) && user.getPassword().equalsIgnoreCase(p)) {
            do {
                System.out.println("Where do you want to log into?");
                System.out.println("Type 1 for Facebook");
                System.out.println("Type 2 for Twitter");
                System.out.println("Type 3 for Instagram");
                int choice = kb.nextInt();
                switch (choice) {
                    case 1:
                        Facebook f = new Facebook();
                        f.logIn();
                        f.logOut();
                        break;
                    case 2:
                        Twitter t = new Twitter();
                        t.logIn();
                        t.logOut();
                        break;
                    case 3:
                        Instagram i = new Instagram();
                        i.logIn();
                        i.logOut();
                        break;
                }//end switch
                System.out.println("Do you want to continue? (Yes/No)");
                yesNo = kb.next();
                System.out.println("");

            } while (yesNo.equalsIgnoreCase("yes"));
            System.out.println("Exit");
        }//end if
        else{
            System.out.println("Incorrect email or password");
        }//end else
    }//end main
}



