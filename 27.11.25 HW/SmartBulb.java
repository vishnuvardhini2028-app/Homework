
package abstraction;


public class SmartBulb extends SmartDevice
{

    @Override
    void turnon() 
    {
        System.out.println("Smart Bulb is now on");
 
    }
    @Override
    void turnoff() 
    {
      System.out.println("Smart Bulb is now off");

    }
    
}
