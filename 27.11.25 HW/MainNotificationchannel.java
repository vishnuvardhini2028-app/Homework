
package NotificationChannels;


public class MainNotificationchannel 
{
    public static void main(String[] args) 
    {
      Notifier n=new Notifier();
      n.PushNotifier();
      Notifier n1=new Notifier();
      n1.EmailNotifier();
    }
}
