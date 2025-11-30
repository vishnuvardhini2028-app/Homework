
package pkginterface;


public class CreditCard implements PaymentMethod
{

   @Override
   public void pay(double amount) 
    {
        System.out.println(" paid "+amount+" using credit card ");
    }
    
}
