
package firstproject;


public class Tax1 
{
    String name;
    double salary;
    Tax1(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    void netsalary()
    {
        double tax=salary*0.10;
        double netsalary=salary-tax;
        System.out.println("Name:"+name);
        System.out.println("salary:"+ salary);
        System.out.println("tax:"+ tax);
        System.out.println("Netsalary" + netsalary);
    }
}
