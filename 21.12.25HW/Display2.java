
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Display2 extends Thread
{
  String word="Can you tell me about Java";  
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
