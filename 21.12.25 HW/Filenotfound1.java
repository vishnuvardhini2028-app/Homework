
package exceptionalhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Filenotfound1 
{
    public static void main(String[] args) 
    {
      FileReader fr = null;
      try
      {
          fr=new FileReader("test.txt");
          System.out.println("File opened successfully");
      }
      catch(FileNotFoundException e)
      {
          System.out.println("File not found");
      }
      finally
      {
          System.out.println("Closing Resources");
      }
      
    }
}
