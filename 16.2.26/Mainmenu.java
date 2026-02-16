
package pkg16.pkg2.pkg26;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.runtime.Debug.id;


public class Mainmenu 
{
   Scanner sc=new Scanner(System.in);
   Scanner sc1=new Scanner(System.in);
   DaoClass d=new DaoClass();
   //d.insert(id, name, age, course);
   
   
   public void menu() throws ClassNotFoundException
   {
       System.out.println("1.insert");
        System.out.println("2.update");
        System.out.println("3.delete");
        System.out.println("4.view");
               
        int choose = Integer.parseInt(sc1.nextLine());
        switch(choose)
        {
            case 1:
            {
                System.out.print("Enter student id :");
                int s=Integer.parseInt(sc1.nextLine());
                System.out.println("Enter student name :");
                String s1=sc1.nextLine();
                System.out.print("Enter student age :");
                int s2=Integer.parseInt(sc1.nextLine());
                System.out.print("Enter student course :");
                String s3=sc1.nextLine();
                PojoClass p=new PojoClass();
                p.setId(s);
                p.setName(s1);
                p.setAge(s2);
                p.setCourse(s3);
                try {
                d.insert(p);
            } catch (SQLException ex) {
                Logger.getLogger(Mainmenu.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
            }
            case 4:
            {
                try {
                d.displayStudents();
            } 
                catch (SQLException ex) {
                Logger.getLogger(Mainmenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
   }

    //private void viewrecord() 
    //{
       

    //DaoClass d = new DaoClass();
    //try {
       // d.displayStudents();   // or d.view() based on your DAO
    //} 
    //catch (Exception e) {
       // System.out.println(e);
    //}
}

    

    

