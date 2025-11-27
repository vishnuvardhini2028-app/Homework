
package AreaCalculation;


public class Rectangle 
{
    double length;
    double breadth;
    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    void fn()
    {
        double res=length*breadth;
        System.out.println("area of the rectangle is:" +res);
    }
}
