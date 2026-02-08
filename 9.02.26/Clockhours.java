/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vishnuvardhini.dailyhomework;

/**
 *
 * @author VISHNUVARDHINI
 */
import java.util.Scanner;
public class Clockhours 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of clocks: ");
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        System.out.println("Enter hours:");
        for (int i = 0; i < n; i++) 
        {
            int hour = sc.nextInt();
            sum = sum + hour;   
            if (hour > max) 
            {   
                max = hour;
            }
        }
        System.out.println("Total Hours: " + sum);
        System.out.println("Highest Hour: " + max);
    }
}


