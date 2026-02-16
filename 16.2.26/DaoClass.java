
package pkg16.pkg2.pkg26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static jdk.nashorn.internal.runtime.Debug.id;


public class DaoClass 
{
    public void insert(PojoClass p1) throws ClassNotFoundException, SQLException
    {
    Class.forName("org.postgresql.Driver");
    Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC", "postgres", "vishnu");
    PreparedStatement ps=con.prepareStatement("insert into student(id,name,age,course) values (?,?,?,?)");
    PojoClass p=new PojoClass();
    ps.setInt(1,p1.getId());
    ps.setString(2, p1.getName());
    ps.setInt(3, p1.getAge());
    ps.setString(4,p1.getCourse());
   int res= ps.executeUpdate();
   if(res>0)
   {
       System.out.println("inserted succesfully");
   }
    
    }
    public void displayStudents() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC","postgres","vishnu");


        Statement s = con.createStatement();

        ResultSet rs = s.executeQuery("select * from student");

        while (rs.next()) 
        {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getDouble(3));
        }

        con.close();
    }
   
    }
       
       
    
   

