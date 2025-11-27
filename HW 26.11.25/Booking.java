
package TravelBooking;


public class Booking 
{
    public static void main(String[] args) 
    {
        TrainBooking tk=new TrainBooking(12675);
        tk.ticket(12675);
        TrainBooking t=new TrainBooking(12675);
        t.fn();
        FlightBooking fb=new FlightBooking("indigo","6E123");
        fb.fn();


    }
}
