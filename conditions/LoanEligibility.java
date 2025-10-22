import java.util.Scanner;
class  LoanEligibility
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
        int age = sc.nextInt();
		System.out.print("Enter your monthly income: ");
        double income = sc.nextDouble();
		if(age>21&&income>10000)
		{
			System.out.println("You are eligible for a loan.");
		}
		else if(age<21)
		{
			 System.out.println("You are not eligible for a loan because your age is below 21.");
			
		}
		else if(income < 15000) 
		{
            System.out.println("You are not eligible for a loan because your income is below ₹15,000.");
        } 
		else 
		{
            System.out.println("You are not eligible for a loan.");
		}
			
		
		
		
			
		
	}
}