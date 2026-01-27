/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vishnuvardhini.dailyhomework;

/**
 *
 * @author VISHNUVARDHINI
 */
public class Spiral 
{
    public static void main(String[] args) 
    {

        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20}
        };

        int top = 0, bottom = 4, left = 0, right = 3;

        while (top <= bottom && left <= right) 
        {

            for (int i = left; i <= right; i++)
                System.out.print(a[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(a[i][right] + " ");
            right--;

            for (int i = right; i >= left; i--)
                System.out.print(a[bottom][i] + " ");
            bottom--;

            for (int i = bottom; i >= top; i--)
                System.out.print(a[i][left] + " ");
            left++;
        }
    }
}

