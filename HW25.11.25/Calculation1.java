
package firstproject;


public class Calculation1 
{
  int units;
  double costPerUnit;

    
    Calculation1(int units, double costPerUnit) 
	{
        this.units = units;
        this.costPerUnit = costPerUnit;
    }

    
    void calculateBill() 
	{
        double total = units * costPerUnit;
        System.out.println("Total Unit : " + units);
        System.out.println("Cost Per Unit : Rs. " + costPerUnit);
        System.out.println("Total Bill : Rs. " + total);
    }  
}
