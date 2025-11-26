
package firstproject;


public class BodyMassIndex1 
{
    double weight;   // in kg
    double height;   // in meters

 
    BodyMassIndex1(double weight, double height) 
    {
        this.weight = weight;
        this.height = height;
    }


    void printBMI() 
    {
        double bmi = weight / (height * height);
        System.out.printf("BMI ", +bmi); 
    }
}    
