
package firstproject;


public class Item1 
{
    int price;
    int discountpercent;
    Item1(int price,int discountpercent)
    {
        
        this.price=price;
        this.discountpercent=discountpercent;
    }
    void product()
    {
        double discountamt=(price*discountpercent)/100;
        double finalprice=price-discountamt;
        System.out.println("original"+ price);
        System.out.println("discountpercent"+ discountpercent);
        System.out.println("finalprice"+finalprice);
    }
}
