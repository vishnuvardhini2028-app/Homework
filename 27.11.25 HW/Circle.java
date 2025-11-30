
package ShapeAreaCalculation;


 class Circle implements Shape
{
     double radius;
     Circle(double radius)
     {
        this.radius=radius;
     }

    
    @Override
    public double area() 
    {
        
        double res=Math.PI*radius*radius;
        System.out.println("area:"+res);
        return res;
    }

    
     
    
    
}
