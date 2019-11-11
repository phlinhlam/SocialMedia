import java.util.ArrayList;
import java.util.Scanner;

public class SocialMedia {
    public static void main(String[] args) {
        User user = new User();

        ArrayList<User> userInfo = new ArrayList<>();//database
        System.out.println("Log in information");
        user.setUserEmail("myemail");
        user.setPassword("mypassword");
        userInfo.add(user);

        //check for userInfo arraylist
        for(User u : userInfo)
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

        //check
        if(user.getUserEmail().equalsIgnoreCase(e) && user.getPassword().equalsIgnoreCase(p))
        {
            System.out.println("Where do you want to log into?");
            System.out.println("Type 1 for Facebook");
            System.out.println("Type 2 for Twitter");
            System.out.println("Type 3 for Instagram");
            int choice = kb.nextInt();
            switch (choice)
            {
                case 1:
                    Facebook f = new Facebook();
                    f.logIn();
                    break;
                case 2:
                    Twitter t = new Twitter();
                    t.logIn();
                    break;
                case 3:
                    Instagram i = new Instagram();
                    i.logIn();
                    break;
            }//end switch
        }//end if
        else {
            System.out.println("Incorrect email or password");
        }
    }

}
