
package LoginAuthentication;


public class AdminAuth implements Authenticator
{

    @Override
    public void login(String user, String pass) 
    {
        System.out.println("Admin login sucessful");
    }

    

   
    
}
