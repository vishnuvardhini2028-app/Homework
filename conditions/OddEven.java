import java.util.Scanner;
class OddEven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		if(num%2==0)
		{
		  System.out.println("the given number is even");
			
		}
		else
		{
		  System.out.println("the given number is odd");
			
		}
	}
}