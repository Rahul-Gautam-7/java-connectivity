import java.sql.*;
import java.util.*;
public class display {

    public static void main(String[] args) {
        try
        {
        String url="jdbc:mysql://localhost:3306/rahul";
        String username="root";
        String password="";

        Connection con = DriverManager.getConnection(url, username, password);

        String query="select * from rahul";

        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(query);

        while (rs.next())
        {
            System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(2));
        }
        con.close();


        }
        catch (Exception e){}

    }
    
}
