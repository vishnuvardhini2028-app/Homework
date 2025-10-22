import java.util.Scanner;
class Grade
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character A,B,C,D,F");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'A':   
		    
			System.out.println(" very good");
			break;
	    case 'B':
			System.out.println("  good");
			break;
			
        case 'C':
			System.out.println(" ok");
			break;
			
		case 'D':
			System.out.println(" improve");
			break;
			
        case 'F':    		
			System.out.println(" poor");
			break;
			
			
		}
		
	}	
	
}