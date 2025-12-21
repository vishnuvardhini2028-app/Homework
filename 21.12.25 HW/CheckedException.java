/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionalhandling;

import java.io.IOException;

/**
 *
 * @author VISHNUVARDHINI
 */
public class CheckedException 
{
    static void checkedExceptionMethod() throws IOException 
    {
        throw new IOException("This is a checked exception");
    }
     public static void main(String[] args) 
     {

        
        try
        {
            checkedExceptionMethod();
        } catch (IOException e) 
        {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
     }
}
