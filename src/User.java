import java.util.ArrayList;

public class User {
    public String userEmail;
    public String password;


    public User() {
    }

    public User(String userEmail, String password) {
        this.userEmail = userEmail;
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void logOut()
    {
        System.out.println("You are successfully logged out");
    }

    public String display()
    {
        String str = " ";
        System.out.println("Your user name is: " + userEmail);
        System.out.println("Your password is: " +password);
        return str;
    }




}
