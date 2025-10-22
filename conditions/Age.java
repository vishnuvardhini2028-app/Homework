import java.util.Scanner;
class Age
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int ages=sc.nextInt();
		if(ages>=60)
		{
		  System.out.println("they are senior citizen ");
			
		}
		else
		{
		  System.out.println("they are not senior citizen");
			
		}
		
	}
}