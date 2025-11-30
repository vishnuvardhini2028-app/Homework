
package NotificationSystem;


 class SmsNotifier implements Notifier
{

    @Override
    public void send(String message) 
    {
       System.out.println("Sending sms: " +message);

    }
    
}
