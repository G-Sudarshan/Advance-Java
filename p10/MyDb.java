import java.sql.*;

public class MyDb
{
    public static void main(String[] args) {
        try {
            String connectString = "jdbc:mysql://localhost:3306/stud";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(connectString,"root","");
            Statement st = con.createStatement();
            System.out.println("ok, connection is done");
            String sql1 = "INSERT INTO users VALUES(176110,'Prafull'),(176113,'Aniket')";
            int rownum = st.executeUpdate(sql1);
            System.out.println(rownum+" Rows inserted successfully");
            String sql2 = "UPDATE users SET roll=176154 where name='Aniket'";
            rownum = st.executeUpdate(sql2);
            System.out.println(rownum+" Rows updated successfully");
            String sql3 = "select * from users";
            ResultSet rs = st.executeQuery(sql3);
            while(rs.next())
            {
               System.out.println(rs.getInt(1)+" | "+rs.getString(2)); 
            }
            con.close();          
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}