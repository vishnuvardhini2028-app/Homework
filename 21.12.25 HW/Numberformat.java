
package exceptionalhandling;

import java.util.Scanner;


public class Numberformat 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter an Number: ");
      String number=sc.nextLine();
      
      try
      {
         int num=Integer.parseInt(number);
          System.out.println("converted number: " + num);
      }
      catch(NumberFormatException e)
      {
          System.out.println("invalid input: Enter a numeric value");
      }
    }
}
