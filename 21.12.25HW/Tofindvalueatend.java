
package string;

import java.util.Scanner;


public class Tofindvalueatend 
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input : ");
        String str = sc.nextLine();

        
        if (str.endsWith("a")) 
        {
            System.out.println("Its ends with the word a");
        } else 
        {
            System.out.println("Its not ends with the word a");
        }
    } 
}
