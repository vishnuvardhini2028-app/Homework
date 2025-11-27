
package TravelBooking;


public class TrainBooking 
{
    int i;
    TrainBooking(int i)
    {
       this.i=i;
      
    }

    
    void ticket(int price)
    {
        if(price==12457)
        {
            System.out.println("chennai express");
        }
        else if(price==12675)
        {
           System.out.println("express");

        }
    }
    void fn()
    {
        System.out.println(i);
    }
    
}
