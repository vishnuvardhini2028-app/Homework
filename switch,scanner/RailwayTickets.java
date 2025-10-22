import java.util.Scanner;
class RailwayTickets
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a seat type");
		System.out.println("1 - General");
        System.out.println("2 - Sleeper");
        System.out.println("3 - AC 3 Tier");
        System.out.println("4 - AC 2 Tier");
        System.out.println("5 - First Class");
        System.out.print("Your choice: ");
        int seatType = sc.nextInt();
		switch(seatType)
		{
		case 1:
		        System.out.println("Seat Type: General");
                System.out.println("Ticket Rate: 150");
		        break;
		case 2:
		        System.out.println("Seat Type: Sleeper");
                System.out.println("Ticket Rate: 300");
		        break;
		case 3:
		        System.out.println("Seat Type: AC 3 Tier");
                System.out.println("Ticket Rate: 600");
		        break;
		case 4:
		        System.out.println("Seat Type: AC 2 Tier");
                System.out.println("Ticket Rate: 900");
		        break;
		case 5:
		        System.out.println("Seat Type: First Class");
                System.out.println("Ticket Rate: 1200");
		        break;
		default:
                System.out.println("Invalid seat type! Please enter a number between 1 and 5.");
        }
		
		
		
	}
}