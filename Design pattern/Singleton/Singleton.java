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

    //Synchornized DB
    System.out.println("\n #### Using Synchronized LAZY Initialization ####");
    Runnable task=()->{
        SyncDB syncdb=SyncDB.getInstance();
        syncdb.executeQuery("Update table X : Instance ID"+ syncdb.hashCode());
    };
    Thread t1=new Thread(task,"Thread-1");
    Thread t2=new Thread(task,"Thread-2");
    Thread t3=new Thread(task,"Thread-3");
    t1.start();
    t2.start();
    t3.start();
    
}
}

