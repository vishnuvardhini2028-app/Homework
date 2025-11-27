
package abstraction;


public class SmartFan extends SmartDevice
{

    @Override
    void turnon() 
    {
        System.out.println("Smart Bulb is spinning up");
    }

    @Override
    void turnoff() 
    {
      System.out.println("Smart Bulb is now off");

    }
}
