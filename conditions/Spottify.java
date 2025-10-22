import java.util.Scanner;
class Spottify
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Harris Jeyaraj");
		System.out.println("1.melody");
		System.out.println("2.kuthu");
		System.out.println("3.sad");
		System.out.println("select your options");
		int songs=sc.nextInt();
		if(songs==1)
		{
			System.out.println("melody song");
			System.out.println("1.Unnale");
			System.out.println("2.Annul Maele ");
			System.out.println("3.Yedho Ondru ");
			System.out.println("4.Vaseegara ");
			System.out.println("5.Paartha Mudhal ");
			int choose=sc.nextInt();
			if(choose==1)
			{
				System.out.println("1.Unnale");
			}
			else if(choose==2)
			{
			    System.out.println("2.Annul Maele ");
				
			}
			else if(choose==3)
			{
			    System.out.println("3.Yedho Ondru ");
				
			}
			else if(choose==4)
			{
			    System.out.println("4.Vaseegara ");
				
			}
			else if(choose==4)
			{
			    System.out.println("5.Paartha Mudhal ");
				
			}
			else
			{
			    System.out.println("sorry song is not in the list ");
				
			}
			
		}
		else if(songs==2)
		{
			System.out.println("kuthusong");
			System.out.println("1.Tirunelveli Halwa Da ");
			System.out.println("2.Aradi katre  ");
			System.out.println("3.Soda Bottle  ");
			System.out.println("4.Aruva Meesai  ");
			int choose=sc.nextInt();
			if(choose==1)
			{
			    System.out.println("1.Tirunelveli Halwa Da ");
				
			}
			else if(choose==2)
			{
			    System.out.println("2.Aradi katre  ");
				
			}
			else if(choose==3)
			{
			    System.out.println("3.Soda Bottle  ");
				
			}
			else if(choose==4)
			{
			    System.out.println("4.Aruva Meesai  ");
				
			}
			else
			{
			    System.out.println("sorry songs is not in the list ");
				
			}
		}
		else if(songs==3)
		{
			
			System.out.println("sad song");
			System.out.println("1.Venmathiye ");
			System.out.println("2.Oh maname  ");
			System.out.println("3.Yamma Yamma");
			System.out.println("4.Othayile");
			int choose=sc.nextInt();
			if(choose==1)
			{
			   System.out.println("1.Venmathiye ");
				
			}
			else if(choose==2)
			{
			   System.out.println("2.Oh maname  ");
				
			}
			else if(choose==3)
			{
			    System.out.println("3.Yamma Yamma   ");
				
			}
			else if(choose==4)
			{
			    System.out.println("4.Othayile");
				
			}
			else
			{
			    System.out.println("sorry song is not in the list ");
				
			}
		}
		else
		{
			    System.out.println("sorry song is not in the list ");
			  
		}
		
	}
}