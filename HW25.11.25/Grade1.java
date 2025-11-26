
package firstproject;


public class Grade1 
{
    int m1;
    int m2;
    int m3;       
   
    Grade1(int m1, int m2, int m3)
    {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    
    void printGrade() 
    {
        double avg = (m1 + m2 + m3) / 3.0;
        System.out.println("Average : " + avg);

        char grade;
        if (avg >= 90) 
        {
            grade = 'A';
        } else if (avg >= 80) 
        {
            grade = 'B';
        } else if (avg >= 70) 
        {
            grade = 'C';
        } else if (avg >= 60) 
        {
            grade = 'D';
        } else 
        {
            grade = 'F';
        }

        System.out.println("Grade : " + grade);
    }
}
