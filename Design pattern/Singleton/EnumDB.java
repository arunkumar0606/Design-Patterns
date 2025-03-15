package Singleton;

public enum EnumDB {
    DBINSTANCE;

    private EnumDB(){

        System.out.println("Configured EagerDB...");
    }

    public void executeQuery(String query){
        System.out.println("Execting Query ="+query);
    }

}
