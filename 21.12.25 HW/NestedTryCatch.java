
package exceptionalhandling;


public class NestedTryCatch 
{
    public static void main(String[] args) 
    {
       try
       {
         int a=10/0;
        
         try
         {
             int ar[]={1,2,3,4,5};
             System.out.println(ar[7]);
         
         } 
        catch(ArrayIndexOutOfBoundsException e)
         {
             System.out.println("invalid array index");
         }
       }
        catch(ArithmeticException e)
         {
             System.out.println("cannot be divide by zero");
         }
    }
 
}
