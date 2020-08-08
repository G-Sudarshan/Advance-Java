import java.sql.*;

public class MyDb
{
 public static void main(String[] args) {
     try {
         String connectString = "jdbc:mysql://localhost:3306/stud";
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection(connectString,"root","");
         Statement st = con.createStatement();
         System.out.println("ok, connection done");
         String q = "CREATE TABLE stud_info(roll int(20),name varchar(30),city varchar(30))";
         st.executeUpdate(q);
         System.out.println("Table created successfully");
         con.close();
     } catch (Exception e) {
        System.out.println(e);
     }
 }   
}