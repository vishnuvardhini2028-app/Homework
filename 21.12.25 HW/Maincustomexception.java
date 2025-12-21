
package exceptionalhandling;

//import java.util.Scanner;


public class Maincustomexception extends Exception
{
   

   public static void main(String[] args) throws Exception 
    {
        //Scanner sc=new Scanner(System.in);
        //System.out.print("Enter an age");
        //int age=sc.nextInt();
        CustomException ce=new CustomException();
        ce.agechecking(20);
        
    }    
}


