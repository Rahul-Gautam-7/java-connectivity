import java.util.*;
import java.sql.*;

public class update {

    public static void main(String[] args) {
    
        try
        {
            //connection to mysql 
            String url="jdbc:mysql://localhost:3306/rahul";
            String username="root";
            String password="";
            Connection con = DriverManager.getConnection(url, username, password);


            //update query
            String query = "UPDATE RAHUL SET  name='laxman' WHERE id=1 ";
            Statement st=con.createStatement();
            st.executeUpdate(query);
            System.out.println("Table updated successfully");
        }
        catch (Exception e)
        {}
    }
    
}
