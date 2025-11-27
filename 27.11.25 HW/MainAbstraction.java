
package abstraction;


public class MainAbstraction 
{

    
    public static void main(String[] args) 
    {
        SmartDevice b = new SmartBulb();
        SmartDevice f = new SmartFan();

        b.turnon();
       

        f.turnon();
       
    }
    
}
