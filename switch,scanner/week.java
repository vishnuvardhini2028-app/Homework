import java.util.Scanner;
class Week
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a week 1to7");
		int days=sc.nextInt();
		if(days==1)
		{
		   System.out.println(" sunday");
			
		}
		else if(days==2)
		{
		   System.out.println(" monday");
			
		}
		else if(days==3)
		{
		   System.out.println(" tuesday");
			
		}
		else if(days==4)
		{
		   System.out.println(" wednesday");
			
		}
		else if(days==5)
		{
		   System.out.println(" thursday");
			
		}
		else if(days==6)
		{
		   System.out.println(" friday");
			
		}
		else if(days==7)
		{
		   System.out.println("saturday");
			
		}
		else
		{
		   System.out.println("sorry there is no other days");
			
		}
			
		
	}
}