package foodmenu;

import java.sql.*;
import foodmenu.Pojocls;



public class FoodDAO
{

    Connection con = DBcon.getConnection();
   public void addFood(Pojocls p) throws Exception 
   {
     PreparedStatement ps=con.prepareStatement("insert into foodmenu values(?,?,?)");

        ps.setInt(1, p.getId());
        ps.setString(2, p.getName());
        ps.setDouble(3, p.getPrice());

        ps.executeUpdate();
    }
   public ResultSet viewFood() throws Exception {

        Statement st = con.createStatement();
        return st.executeQuery("select * from foodmenu");
    }

   
    public ResultSet searchFood(String name) throws Exception 
    {
      PreparedStatement ps = con.prepareStatement("select * from foodmenu where f_name=?");

        ps.setString(1, name);
        return ps.executeQuery();
    }

    
    public int updatePrice(int id, int price) throws Exception
    {
        PreparedStatement ps =con.prepareStatement("update foodmenu SET f_price=? where f_id=?");

        ps.setInt(1, (int) price);
        ps.setInt(2, id);

        return ps.executeUpdate();
    }

 
    public int deleteFood(int id) throws Exception 
    { 
        PreparedStatement ps =con.prepareStatement("delete from foodmenu where f_id=?");

        ps.setInt(1, id);
        return ps.executeUpdate();
    }

    
    public double totalBill() throws Exception 
    {

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select sum(f_price) from foodmenu");

        if (rs.next())
            return rs.getInt(1);

        return 0;
    }
}
