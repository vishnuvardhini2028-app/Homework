
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Display3 implements Runnable
{
    @Override
    public void run() 
    {
       String word="Sure,java is an programming language which is used develop applications with platform independent";
       for(int i=0;i<word.length();i++)
       {
           char ch=word.charAt(i);
           try 
           {
               Thread.sleep(3000);
           } catch (InterruptedException ex) 
           {
               Logger.getLogger(Display3.class.getName()).log(Level.SEVERE, null, ex);
           }
           System.out.print(ch);
       }
               
    }
    
    
}
