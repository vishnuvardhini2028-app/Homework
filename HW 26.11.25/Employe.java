
package Employeeroles;


public class Employe 
{
    String name;
    String role;

    Employe(String name, String role) 
    {
        this.name = name;
        this.role = role;
    }

    void details() 
    {
        System.out.println("Name : " + name + ", Role : " + role);
    }
}
