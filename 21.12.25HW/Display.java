
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Display extends Thread
{
    String word="Hai";
    @Override
    public void run()
    {
      for(int i=0;i<word.length();i++)
      {
         char ch=word.charAt(i);
      
        try 
       {
           
           Thread.sleep(3000);
        } catch (InterruptedException ex) 
        {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print(ch);
        
    }
        
}
}
