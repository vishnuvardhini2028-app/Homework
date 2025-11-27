
package VehicleMaintenance;


public class Car extends Vehicle
{

    @Override
    void car() 
    {
        System.out.println("Car serviced: oil change and tire check");
    }

    @Override
    void bus() 
    {
        System.out.println("Bus serviced: engine tuning and brake check");
    }
    
}
