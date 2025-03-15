package Singleton;

public class EagerDB {

    private static final EagerDB dbInstance=new EagerDB();

    private EagerDB(){

        System.out.println("Configured EagerDB...");
    }

    public void executeQuery(String query){
        System.out.println("Execting Query ="+query);
    }

    public static EagerDB getDbInstance(){
        return dbInstance;
    }
    
}
