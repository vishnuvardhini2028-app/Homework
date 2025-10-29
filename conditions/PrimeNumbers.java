import java.util.Scanner;
class PrimeNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		//int n=10;
		boolean prime=true;
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
			
		}
		System.out.println( prime);
		
	}
}