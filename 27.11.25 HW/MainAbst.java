/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AuthenticationMechanism;

/**
 *
 * @author VISHNUVARDHINI
 */
public class MainAbst 
{
    public static void main(String[] args)
    {
        authenticatorImpl au=new authenticatorImpl();
        au.authenticate("user1");
        authenticatorImpl au1=new  authenticatorImpl(); 
        au1.authenticate(123456);
    }
}
