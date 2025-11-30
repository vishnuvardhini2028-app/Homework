
package ShapeAreaCalculation;


 class Rectangle  implements Shape
{
    static Rectangle re;
     double length;
     double width;
     Rectangle(double length,double width)
     {
         this.length=length;
         this.width=width;
     }

    

    

   
     @Override
    public double area()
    {
         //double ar;
         double r = length*width;
        System.out.println("area:"+r);
        return r;

    }

    
}
