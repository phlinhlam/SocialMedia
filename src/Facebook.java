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
    System.out.println(" ");
    System.out.println("You have 15 new notifications");
    System.out.println("\nMickey Mouse liked your photo");
    return str;
}
public void addPhoto()
{
    System.out.println("You have uploaded a new photo!!!!");
}
    public void logOut()
    {
        System.out.println("You have logged out of Facebook");
    }



}
