import java.sql.*;

public class MysqlPrepStmt
{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/MyDemoDB";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            
            System.out.println("Connecting to database....");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Creating statement....");
            String sql = "UPDATE StudentBasic set StudBranch=? WHERE roll=?";

            stmt = conn.prepareStatement(sql);

            stmt.setString(1,"CM");
            stmt.setInt(2,176101);

            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted: "+ rows);

            sql = "SELECT * FROM StudentBasic";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next())
            {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                String branch = rs.getString("StudBranch");

                //Displaying values

                System.out.println("rollno: "+ roll);
                System.out.println("name : "+ name);
                System.out.println("Branch: "+ branch);
            }

            conn.close();
            
        }catch (SQLException se){
            se.printStackTrace();
        } 
        catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        finally{
            try{
            conn.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("bye");
    }

}