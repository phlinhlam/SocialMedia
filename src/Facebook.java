public class Facebook extends User {
    Facebook(){}
    public void logIn()
    {
        System.out.println("You've logged into Facebook");
    }

public String displayFacbook()
{
    String str = " ";
    System.out.println("Your user name is: " + userEmail + "\nYou have 15 new notifications");
    return str;
}

    public void logOut()
    {
        System.out.println("Do you want to log out?");
    }



}
