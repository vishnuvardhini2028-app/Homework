/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vishnuvardhini.dailyhomework;

/**
 *
 * @author VISHNUVARDHINI
 */
public class Countletters 
{
    public static void main(String[] args) 
    {
        String st = "abbccccc";
        int count = 1;

        for (int i = 0; i < st.length(); i++)
        {
            if (i < st.length() - 1 && st.charAt(i) == st.charAt(i + 1)) 
            {
                count++;
            } else 
            {
                System.out.print(st.charAt(i));
                if (count > 1)
                    System.out.print(count);
                count = 1;
            }
        }
    }
}

