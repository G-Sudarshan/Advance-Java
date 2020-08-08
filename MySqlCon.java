import java.sql.*;

class MySqlCon
{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("CREATE TABLE IF NOT EXISTS employee");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" || "+rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}