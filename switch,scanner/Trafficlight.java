import java.util.Scanner;
class Trafficlight
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a colour");
		String light=sc.nextLine();
		switch(light)
		{
		case "red":
		       System.out.println("red for stop");
		       break;
		case "yellow":
		       System.out.println("yellow for wait");
		       break;
		case "green":
		       System.out.println("green for go");
		       break;
		       
		}
		
	}
}