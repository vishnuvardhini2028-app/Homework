
package firstproject;


public class Cartvalue1 
{
    int product1;
    int product2;
    int product3;
    Cartvalue1(int product1,int product2,int product3)
    {
        this.product1=product1;
        this.product2=product2;
        this.product3=product3;
    }
    void total()
    {
        int total=product1+product2+product3;
        System.out.println("total cart value is " +total);
    }

}
