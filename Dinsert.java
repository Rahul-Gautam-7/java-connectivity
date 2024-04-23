import java.sql.*;
import java.util.*;
public class Dinsert {
    public static void main(String[] args) {
        try
        {
            String url="jdbc:mysql://localhost:3306/rahul";
            String username="root";
            String password="";

            Connection con = DriverManager.getConnection(url, username, password);
            Scanner sc = new Scanner(System.in);
                Scanner rc = new Scanner(System.in);
          
            System.out.print("Enter the name : ");
            String name=sc.nextLine();

            System.out.print("Enter the id : ");
            int nm=sc.nextInt();


            System.out.print("Enter the stream :");
            String stm=rc.nextLine();

            String query="INSERT INTO RAHUL VALUES('"+nm+"','"+name+"','"+stm+"')";
            
           Statement st =con.createStatement();
            st.executeUpdate(query);
            System.out.println("Record inserted successfully");
            con.close();


            

        }
        catch (Exception e){}
    }
    
}
