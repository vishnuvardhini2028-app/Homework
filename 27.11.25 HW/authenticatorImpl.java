/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AuthenticationMechanism;


public class authenticatorImpl extends authenticator 
{

    @Override
    void authenticate(String user) 
    {
        System.out.println("user1 logged in with password");
    }

    @Override
    void authenticate(int pass) 
    {
        System.out.println("user1 logged in with OTP”");
    }
    
}
