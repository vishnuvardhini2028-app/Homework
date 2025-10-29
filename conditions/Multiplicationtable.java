import java.util.Scanner;
class Multiplicationtable
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		if(num%3==0)
		{
		   System.out.println("The given number is divisible by 3");
			
		}
		else if(num%7==0)
		{
		   System.out.println("The given number is divisible by 7");
			
		}
		else
		{
		   System.out.println("The given number is not divisible by either 7 or 3");
			
		}
		
	}
}