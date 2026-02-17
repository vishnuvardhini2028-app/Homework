/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmenu;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VISHNUVARDHINI
 */
public class DBcon 
{
    public static Connection getConnection()
    {

        Connection con = null;

        try 
        {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/JDBC",
                    "postgres",
                    "vishnu"
            );

        } catch (Exception e) 
        {
            System.out.println("DB Error: " + e);
        }

        return con;
    }
}


