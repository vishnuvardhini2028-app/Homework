/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationChannels;


public class Notifier extends NotifierImpl 
{

    @Override
    void PushNotifier() 
    {
        System.out.println("Push sent: Alert!");
    }

    @Override
    void EmailNotifier() 
    {
        System.out.println("Email sent: Alert!"); 
    }
    
}
