
package exceptionalhandling;

import java.util.Scanner;

public class Arraybound 
{
    public static void main(String[] args) 
    {
        int ar[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index=sc.nextInt();
        
        try
        {
            System.out.println("value at index: " +index+ " is " +ar[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: index is out of range");
        }
        finally
        {
            System.out.println("program completed");
        }
    }
}
