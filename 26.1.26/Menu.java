/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vishnuvardhini.dailyhomework;

/**
 *
 * @author VISHNUVARDHINI
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 



public class Menu 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int[] prices = null;
        ArrayList<Integer> list = new ArrayList<>();

        while (true) 
        {
            int choice = sc.nextInt();

            if (choice == 1) 
            {
                int n = sc.nextInt();
                prices = new int[n];
                for (int i = 0; i < n; i++)
                    prices[i] = sc.nextInt();
                System.out.println("Prices stored");
            }

            else if (choice == 2) 
            {
                int n = sc.nextInt();
                list.clear();
                for (int i = 0; i < n; i++)
                    list.add(prices[i]);
                System.out.println("Prices copied to ArrayList");
            }

            else if (choice == 3) 
            {
                int max = Collections.max(list);
                System.out.println("Maximum price = " + max);
            }

            else if (choice == 4) 
            {
                int p = sc.nextInt();
                list.remove(Integer.valueOf(p));
                System.out.println("Price " + p + " removed");
            }

            else if (choice == 5) 
            {
                System.out.print("Prices: ");
                for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();

            }

            else if (choice == 6) 
            {
                System.out.println("Exit");
                break;
            }
        }
    }
}

