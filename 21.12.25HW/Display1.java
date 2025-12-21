
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Display1 extends Thread 
{
  String word="Hai,sir how can I help you";  
  @Override
  public void run()
  {
    for(int i=0;i<word.length();i++)
    {
        char ch=word.charAt(i);
        try 
        {
            Thread.sleep(3000);
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(Display1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print(ch);
    }
  }
}
