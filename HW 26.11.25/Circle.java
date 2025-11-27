
package AreaCalculation;


public class Circle 
{
    
  
    double radius;
    Circle(double radius)
    {
        
        this.radius=radius;
    }
    
    void fn()
    {
        double res=Math.PI*radius*radius;
        System.out.println("area of the circle is:" +res );
    }
}
