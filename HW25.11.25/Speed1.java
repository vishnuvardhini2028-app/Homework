
package firstproject;


public class Speed1 
{
    double distance;
    double time;
    Speed1(double distance,double time)
    {
        this.distance=distance;
        this.time=time;
    }
    void calculatespeed()
    {
        double speed=distance/time;
        System.out.println("the speed is: "+speed+ "Km/hr");
    }
    
}
