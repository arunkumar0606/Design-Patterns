package Singleton.Eager;
public class Singleton{


public static void main(String[] args) {
    //Eager DB
    System.out.println("#### Using Eager Initialization ####");
    EagerDB eagerdb=EagerDB.getDbInstance();
    EagerDB eagerdb1=EagerDB.getDbInstance();
    eagerdb.executeQuery(" Create table X");
    System.out.println("is intances same ? "+ (eagerdb==eagerdb1)+"\n");

    //Lazy DB
    System.out.println("\n #### Using LAZY Initialization ####");
    LazyDB lazydb=LazyDB.getInstance();
    LazyDB lazydb1=LazyDB.getInstance();
    lazydb.executeQuery(" Create table Y");
    System.out.println("is intances same ? "+ (lazydb==lazydb1)+"\n");
}
}

