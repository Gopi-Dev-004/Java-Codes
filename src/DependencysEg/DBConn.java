package DependencysEg;

public class DBConn {

   private DB db;

    public DBConn(DB db){
        this.db = db;
    }

    void getConnection(){
        db.connect();
    }

}
