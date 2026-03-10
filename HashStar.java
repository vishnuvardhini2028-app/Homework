/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vishnuvardhini.dailyhomework;

import java.util.Scanner;

/**
 *
 * @author VISHNUVARDHINI
 */
public class HashStar 
{
   public static void main(String[] args) 
   {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int star = 0;
        int hash = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                star++;
            }
            else if(s.charAt(i) == '#'){
                hash++;
            }
        }

        System.out.println(star - hash);
    }
} 

