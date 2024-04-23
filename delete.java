import java.sql.*;

public class delete {
    public static void main(String[] args) {
        
        try
        {
            //connection
            String url="jdbc:mysql://localhost:3306/rahul";
            String username="root";
            String password="";
            Connection con=DriverManager.getConnection(url, username, password);

            //delete
            String query="DELETE FROM RAHUL WHERE id=1";
            Statement st=con.createStatement();
            st.executeUpdate(query);
            System.out.println("Data deleted successfully");
        }
        catch (Exception e)
        {}
    }
}
