package DependencysEg;

public class Main {

    public static void main(String[] args) {


        DB mySql = new MySql();
        DB postgreSql = new PostgreSql();

        DBConn con = new DBConn(postgreSql);

        con.getConnection();



    }
}
