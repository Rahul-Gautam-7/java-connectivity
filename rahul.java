import java.util.*;
import java.sql.*;

public class rahul{
    public static void main(String[] args) {
        try
        {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url=("jdbc:mysql://localhost:3306/rahul");
            String username="root";
            String password="";

            Connection con=DriverManager.getConnection(url, username, password);

            if(con.isClosed())
            {
                System.out.println("Connection closed");

            }
            else{
                System.out.println("The connection is secured");
            }
        }
        catch (Exception e)
        {}
    }
}