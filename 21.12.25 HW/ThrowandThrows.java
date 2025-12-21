
package exceptionalhandling;


public class ThrowandThrows 
{
  static void negativenumber(int num) throws Exception
  {
      if(num<0)
      {
          throw new Exception("Number cannot be negative");
      }
      System.out.println("Valid number: " + num);
  }
    public static void main(String[] args) 
    {
        try
        {
           negativenumber(-3);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
