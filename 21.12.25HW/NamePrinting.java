
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class NamePrinting extends Thread
{
   @Override
   public void run()
   {
       
       try 
       { 
           System.out.println("Diwakar");
           Thread.sleep(2000);
           System.out.println("katrhik");
           Thread.sleep(2000);
           System.out.println("Rajesh");
           Thread.sleep(2000);
           System.out.println("Sathish");
           Thread.sleep(2000);
           System.out.println("Suriya");
           Thread.sleep(2000);
       }
       catch (InterruptedException ex) 
       {
           Logger.getLogger(NamePrinting.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
}
