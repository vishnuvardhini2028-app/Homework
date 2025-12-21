
package collections;

import java.util.ArrayList;
import java.util.Scanner;


public class Collections 
{
   public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>();

        int choice;
        int sum = 0;

        do 
        {
            System.out.println("1 for Entry  2 for Exit");
            choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.print("Enter the value : ");
                int value = sc.nextInt();
                list.add(value);
            }

        } while (choice != 2);

       
        for (int num : list)//sum
        {
            
        sum += num;
        }

        System.out.println("Sum of the values is " + sum);
    }
    }
    

