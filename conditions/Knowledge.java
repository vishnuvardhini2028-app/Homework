import java.util.Scanner;
class Knowledge
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Types of Books");
		System.out.println("1.Fiction");
		System.out.println("2.Fantasy");
		System.out.println("3.Business");
		System.out.println("4.Psychology");
		System.out.println("Select your options");
		int Books=sc.nextInt();
		if(Books==1)
		{
		   System.out.println("Fiction");
		   System.out.println("1.RISE OF THE FALLEN: The Manwaan Series Book ");
		   System.out.println("Author: Abhishek Krishnan");
		   System.out.println("Language: English ");
		   System.out.println("Rate: Rs.300. ");
		   System.out.println("2.Shadows Rising ");
		   System.out.println("Author: Rohan Monteiro  ");
		   System.out.println("Language: English ");
		   System.out.println("Rate: Rs.250. ");
		   System.out.println("3.Kunex, It Ends with Us ");
		   System.out.println("Author: Rohan Monteiro ");
		   System.out.println("Language: English");
		   System.out.println("Rate: Rs.350. ");
		   int story=sc.nextInt();
		   if(story==1)
		   {
		       System.out.println("1.RISE OF THE FALLEN: The Manwaan Series Book ");
			   
		   }
		   else if(story==2)
		   {
		       System.out.println("2.Shadows Rising ");
			   
		   }
		   else if(story==3)
		   {
		       System.out.println("3.Kunex, It Ends with Us ");
			   
		   }
			
		}
		else if(Books==2)
		{
			System.out.println("Fantasy ");
		    System.out.println("1.Compass and Blade");
		    System.out.println("Author:Rachel Greenlaw");
			System.out.println("Language: English ");
		    System.out.println("Rate: Rs.370. ");
		    System.out.println("2.Blood metal Bone  ");
		    System.out.println("Author:Lindsay Cummings");
			System.out.println("Language: English ");
		    System.out.println("Rate: Rs.275. ");
		    System.out.println("3.The shadows between us");
		    System.out.println("Author:Tricia Leven-seller");
			System.out.println("Language: English");
		    System.out.println("Rate: Rs.304.");
			int story=sc.nextInt();
		    if(story==1)
			{
		      System.out.println("1.Compass and Blade  ");
			   	
			}
			else if(story==2)
			{
		       System.out.println("2.Blood metal Bone  ");
				
			}
			else if(story==3)
			{
		       System.out.println("3.The shadows between us. ");
				
			}
		}
		else if(Books==3)
		{
			System.out.println(" Business");
		    System.out.println("1.The Psychology of Money  ");
			System.out.println("Language: English ");
		    System.out.println("Rate: Rs.300. ");
		    System.out.println("2.Do It Today   ");
			System.out.println("Language: English ");
		    System.out.println("Rate: Rs.100. ");
		    System.out.println("3.Atomic Habits  ");
			System.out.println("Language: English");
		    System.out.println("Rate: Rs.350. ");
			int story=sc.nextInt();
		    if(story==1)
			{
		        System.out.println("1.The Psychology of Money  ");
				
			}
			else if(story==2)
			{
		       System.out.println("2.Do It Today   ");
				
			}
			else if(story==3)
			{
		      System.out.println("3.Atomic Habits  ");
				
			}
		}
		else if(Books==4)
		{
		   System.out.println("Psychology");
		   System.out.println("1.Dark Psychology Secrets & Manipulation  ");
		   System.out.println("Author: Amy Brown  ");
		   System.out.println("Language: English ");
		   System.out.println("Rate: Rs.300. ");
		   System.out.println("2.The Power of Your Subconscious Mind Do It Today");
		   System.out.println("Author: Joseph Murphy    ");
		   System.out.println("Language: English ");
		   System.out.println("Rate: Rs.100. ");
		   System.out.println("3.The Courage to Be Disliked  ");
		   System.out.println("Author:Ichiro Kishimi and Fumitake Koga  ");
		   System.out.println("Language: English");
		   System.out.println("Rate: Rs.350. ");
		   int story=sc.nextInt();
		   if(story==1)
		   {
		     System.out.println("1.Dark Psychology Secrets & Manipulation  ");
			   
		   }
		   else if(story==2)
		   {
		     System.out.println("2.The Power of Your Subconscious Mind Do It Today");
			   
		   }
		   else if(story==3)
		   {
		     System.out.println("Author:Ichiro Kishimi and Fumitake Koga  ");
			   
		   }
		   
		}
		else
		{
		    System.out.println("sorry other book is not available");
			 
			 
		}
			
	
	  
	 
		
	}
		
	
}