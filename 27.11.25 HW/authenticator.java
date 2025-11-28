
package AuthenticationMechanism;


public abstract class authenticator  
{
    abstract void authenticate(String user);
    abstract void authenticate(int pass);
}
