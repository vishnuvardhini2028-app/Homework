
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Java extends Thread
{
    @Override
    public void run()
    {
    
   for(int i=0;i<=10;i++)
    {
        System.out.println("Hello,Java");
       try {
           Thread.sleep(1000);
       } catch (InterruptedException ex) 
       {
           Logger.getLogger(Java.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    }
    



 public static void main(String[] args)
    {
     Java ja=new Java();
     
     ja.start();
     
    }
    
}
