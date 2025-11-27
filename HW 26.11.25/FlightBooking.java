
package TravelBooking;


public class FlightBooking 
{
   String flightname;
   String seatnumber;
   FlightBooking(String flightname, String seatnumber)
   {
       this.flightname=flightname;
       this.seatnumber=seatnumber;
   }
   void fn()
   {
       System.out.println("Flight:" +flightname+" - "+seatnumber);
   }
}
