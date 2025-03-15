package Singleton;

public class DoubleCheckDB {
    private static volatile DoubleCheckDB dbInstance;

    private DoubleCheckDB(){

    }

    public static DoubleCheckDB getInstance(){
        if(dbInstance==null){
            synchronized (DoubleCheckDB.class){
                if(dbInstance==null){
                    dbInstance=new DoubleCheckDB();
                }
            }
        }
        return dbInstance;
    }

    public void executeQuery(String query){
        System.out.println("Execting Query = "+query);
    }
}

