
package threads;


public class MainDisplay3 
{
    public static void main(String[] args) 
    {
        Display3 dp=new Display3();
        Thread th= new Thread(dp);
        th.start();
    }
}
