import java.util.Scanner;
class StudentGrade 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        if (marks > 90) 
		{
            System.out.println("Grade: A");
        } 
        else if (marks >= 70 && marks <= 90) 
		{
            System.out.println("Grade: B");
        } 
        else if (marks >= 50 && marks < 70) 
		{
            System.out.println("Grade: C");
        } 
        else if (marks >= 25 && marks < 50) 
		{
            System.out.println("Grade: D");
        } 
        else 
		{
            System.out.println("Grade: Fail");
        }
	}
}	