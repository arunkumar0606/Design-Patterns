package Singleton;

public class BillPughDB {

    private static class Dbhelper{
        private static final BillPughDB dbInstance=new BillPughDB();
    }
    private BillPughDB(){
        System.out.println("Configured BillPugh...");
    }

    public static BillPughDB getInstance(){
        return Dbhelper.dbInstance;
    }

    public void executeQuery(String query){
        System.out.println("Execting Query = "+query);
    }


}
