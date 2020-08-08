import java.sql.*;

public class MyDatabaseMetadata
{
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDemoDB","root","");
            DatabaseMetaData dm = con.getMetaData();
            System.out.println(dm.getDriverVersion());
            System.out.println(dm.getDriverName());
            System.out.println(dm.getDatabaseProductName());
            System.out.println(dm.getDatabaseProductVersion());
            System.out.println(dm.getUserName());
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try {
                con.close();
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}