public class Twitter extends User {

    public void logIn()
    {
        System.out.println("You've logged into Twitter");
    }
    public void retweet()
    {
        System.out.println("Mickey Mouse retweeted your tweet");
    }
    public void logOut()
    {
        System.out.println("You've logged out of Twitter");
    }

    public String displayTwitter()
    {
        String str = " ";
        System.out.println("Someone just direct messaged you on Twitter");
        return str;
    }
}
