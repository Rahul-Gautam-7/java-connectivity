import java.sql.*;
public class insert
{
    public static void main(String[] args) {
        try
        {
            String url="jdbc:mysql://localhost:3306/rahul";
            String username="root";
            String password="";
            Connection con = DriverManager.getConnection(url, username, password);

            String query="INSERT INTO RAHUL VALUES (1,'rahul','stream')";

            Statement st = con.createStatement();
            st.executeUpdate(query);

            System.out.println("Data inserted successfully");
            con.close();




        }
        catch (Exception e){}
    }
}