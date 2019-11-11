public class Facebook extends User {
    public Facebook() {
    }

    public Facebook(String userEmail, String password) {
        super(userEmail, password);
    }

    public void logIn()
    {
        System.out.println("You've logged into Facebook");
    }

    public String displayFacebook()
{
    String str = " ";
    System.out.println("You have 15 new notifications");
    return str;
}

    public void logOut()
    {
        System.out.println("Do you want to log out?");
    }



}
