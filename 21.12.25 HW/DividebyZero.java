/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionalhandling;

import java.util.Scanner;


public class DividebyZero 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter an number 1: ");
       int a=sc.nextInt();
       System.out.print("Enter an number 2: ");
       int b=sc.nextInt();
       
       try
       {
           int result=a/b;
           System.out.println(result);
       }
       catch(ArithmeticException e)
       {
           System.out.println("you have entered the wrong number");
       }
       finally
       {
           System.out.println("Thankyou");
       }
    }
    
}
