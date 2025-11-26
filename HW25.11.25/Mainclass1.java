
package firstproject;


public class Mainclass1 
{
    double celsius;
    double fahrenheit;
    Mainclass1(double celsius)
    {
        this.celsius=celsius;
    }
    void fn()
    {
        double fahrenheit=(celsius*9/5)+32;
        System.out.println(celsius+" in C=" +fahrenheit+ " in F");
    }
}
