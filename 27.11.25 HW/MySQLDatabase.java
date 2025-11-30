
package DatabaseOperations;


public class MySQLDatabase implements Database 
{

    @Override
    public void connect() 
    {
        System.out.println("connected to mysql database");
    }

    @Override
    public void disconnect() 
    {
     System.out.println("connected to mysql database");
 
    }
    
}
