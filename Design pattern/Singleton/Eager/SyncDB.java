package Singleton.Eager;

public class SyncDB{
    private static SyncDB dbInstance;

    private SyncDB(){
        System.out.println("Configured SyncDB...");
    }

    public void executeQuery(String query){
        System.out.println("Execting Query = "+query);
    }

    public static synchronized SyncDB getInstance(){
        if(dbInstance==null){
            dbInstance=new SyncDB();
        }
        return dbInstance;
    }



    
}
