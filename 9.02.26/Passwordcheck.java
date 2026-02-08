/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vishnuvardhini.dailyhomework;

import java.util.Scanner;
public class Passwordcheck 
{
  
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String p = sc.nextLine();

        int i;
        int digit = 0;
        int capital = 0;

        
        if (p.length() < 4) {
            System.out.println("Invalid Password");
            return;
        }

         
        if (p.charAt(0) >= '0' && p.charAt(0) <= '9') {
            System.out.println("Invalid Password");
            return;
        }

        for (i = 0; i < p.length(); i++) {

            if (p.charAt(i) == ' ' || p.charAt(i) == '/') {
                System.out.println("Invalid Password");
                return;
            }

           
            if (p.charAt(i) >= '0' && p.charAt(i) <= '9') {
                digit = 1;
            }

           
            if (p.charAt(i) >= 'A' && p.charAt(i) <= 'Z') {
                capital = 1;
            }
        }

        if (digit == 1 && capital == 1) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}

