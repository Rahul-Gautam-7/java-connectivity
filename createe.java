import java.sql.*;
import java.util.*;

public class createe {
    public static void main(String[] args) {
        try
        {
        String url=("jdbc:mysql://localhost:3306/rahul");
        String username="root";
        String password="";
        Connection con = DriverManager.getConnection(url, username, password);
        
            String query="CREATE TABLE RAHUL(id int(15) primary key auto_increment ,name varchar(100),stream varchar(100))";

        Statement st=con.createStatement();
        st.executeUpdate(query);
        System.out.println("Table created successfully");
        con.close();
        }
        catch (Exception e){}
    }
    
}
