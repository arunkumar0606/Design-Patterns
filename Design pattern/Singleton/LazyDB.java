package Singleton.Eager;

public class LazyDB {
    private static LazyDB dbInstance;

    private LazyDB(){
        System.out.println("Configured LazyDB...");
    }

    public void executeQuery(String query){
        System.out.println("Execting Query ="+query);
    }

    public static LazyDB getInstance(){
        if(dbInstance==null){
            dbInstance=new LazyDB();
        }
        return dbInstance;
    }



    
}
