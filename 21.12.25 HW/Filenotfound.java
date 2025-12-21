
package exceptionalhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Filenotfound 
{
    public static void main(String[] args) 
    {
      try
      {
          FileReader fr=new FileReader("test.txt");
          System.out.println("File opened Successfully");
      }
      catch(FileNotFoundException e)
      {
          System.out.println("sorry,File not found");
      }
    }
}
