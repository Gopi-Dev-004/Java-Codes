import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Demo {

    public static void main(String[] args)throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String userName = "root";
        String password = "root";
        String query = "select * from employee";
        Connection  con = DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();
        ResultSet rs =  st.executeQuery(query);
        rs.next();
        System.out.println("Emp id  : "+rs.getInt(1));// 1,2,3 are column numbers in table
        System.out.println("Name  : "+rs.getString(2));
        System.out.println("Salary  : "+rs.getInt(3));

        con.close();

    }
}
