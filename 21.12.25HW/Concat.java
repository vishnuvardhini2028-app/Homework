
package string;

import java.util.Scanner;


public class Concat 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter any word 1 : ");
      String str=sc.nextLine();
      System.out.print("Enter any word 2 : ");
      String str1=sc.nextLine();
      String combinedword=str.concat(str1);
      System.out.println("concatenated string is : " + combinedword);
      
    }
}
