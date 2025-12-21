
package exceptionalhandling;

import java.util.Scanner;


public class MultipleException 
{ 
    public static void main(String[] args) 
    {
        
    
    
    Scanner sc=new Scanner(System.in);
    try
    {
       System.out.print("Enter an number 1: ");
       int a=sc.nextInt();
       System.out.print("Enter an number 2: ");
       int b=sc.nextInt();
       int result=a/b;
       System.out.println(result);
               
       
        int ar[]={1,2,3,4,5};
        System.out.print("Enter an index: ");
        int index=sc.nextInt();
        System.out.println("Array element: "+ar[index]);
    }
    catch(ArithmeticException e)
    {
        System.out.println("cannot divide by zero"); 
    }
    catch(ArrayIndexOutOfBoundsException e1)
    {
        System.out.println("invalid array index");
    }

}
}
