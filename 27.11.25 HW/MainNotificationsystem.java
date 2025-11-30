
package NotificationSystem;


public class MainNotificationsystem 
{
    public static void main(String[] args)
    {
         SmsNotifier sm=new  SmsNotifier();
         sm.send("hello");
    }
}
