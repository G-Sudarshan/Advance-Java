import java.sql.*;

public class MyResultSetMetadata
{
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDemoDB","root","");

            st = con.createStatement();
            rs = st.executeQuery("select * from studentbasic");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            for(int i=1; i<=columnCount; i++)
            {
                System.out.println(rsmd.getColumnName(i));
                System.out.println(rsmd.getColumnType(i));
            }
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