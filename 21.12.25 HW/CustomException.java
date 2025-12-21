
package exceptionalhandling;



public class CustomException 
{
    public void agechecking(int age) throws Exception
        {
           if(age<18) 
           {
               throw new Exception("Invalid age");  
           
           }
           else
           {
               System.out.println("valid age");
           }
    }
 
}
