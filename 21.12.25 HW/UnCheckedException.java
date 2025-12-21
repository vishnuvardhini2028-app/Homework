/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionalhandling;

/**
 *
 * @author VISHNUVARDHINI
 */
public class UnCheckedException 
{
    static void uncheckedExceptionMethod() 
    {
        String str = null;
        System.out.println(str.length()); 
    }
    public static void main(String[] args)
    {
        
    
     try 
     {
        uncheckedExceptionMethod();
     } 
     catch (NullPointerException e) 
        {
            System.out.println("Caught unchecked exception: " + e);
        }

}
}
