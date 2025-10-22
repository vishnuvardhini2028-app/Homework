import java.util.Scanner;
class Months
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month from 1 to12");
		int days=sc.nextInt();
		switch(days)
		{
		case 1:
			System.out.println(" january month it has 31 days ");
		    break;
		case 2:
			System.out.println(" february month it has 28 days ");
		    break;
		case 3:
			System.out.println(" march month it has 31 days ");
		    break;
		case 4:
			System.out.println(" april month it has 30 days ");
		    break;
		case 5:
			System.out.println("may month it has 31 days ");
		    break;
		case 6:
			System.out.println(" june month it has 30 days ");
		    break;
		case 7:
			System.out.println(" july month it has 31 days ");
		    break;
		case 8:
			System.out.println(" august month it has 31 days ");
		    break;
		case 9:
			System.out.println(" septemper month it has 30 days ");
		    break;
		case 10:
			System.out.println(" october month it has 31 days ");
		    break;
		case 11:
			System.out.println(" november month it has 30 days ");
		    break;
		case 12:
			System.out.println(" december month it has 31 days ");
		    break;
			
			
			
			
		}
	}
}