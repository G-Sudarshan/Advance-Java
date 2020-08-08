import java.sql.*;

public class EmpDemo
{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
            Statement stmt = con.createStatement();
            System.out.println("Connection done.....");
            String sql = "CREATE TABLE employees(emp_id int(20), emp_name varchar(100), salary int(20))";
            stmt.executeUpdate(sql);
            System.out.println("Table created....");
            sql = "INSERT INTO employees VALUES(1,'john',10000),('2','jack',20000),(3,'stark',30000),(4,'thomas',40000),(5,'peter',50000)";
            stmt.executeUpdate(sql);
            System.out.println("Records Inserted....");
            sql = "SELECT * FROM employees";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("emp id | emp name | salary");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"      | "+rs.getString(2)+" | "+rs.getInt(3));
            }
            con.close();

        

        } catch (Exception e) {
        System.out.println(e);    
        }
    }
}