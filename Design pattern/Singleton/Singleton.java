package Singleton;
public class Singleton{


public static void main(String[] args) throws InterruptedException {
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
        syncdb.executeQuery("Update table X : Instance ID : "+ syncdb.hashCode());
    };
    Thread t1=new Thread(task,"Thread-1");
    Thread t2=new Thread(task,"Thread-2");
    Thread t3=new Thread(task,"Thread-3");
    t1.start();
    t2.start();
    t3.start();
    t3.join();

    //Double Checked Sync DB 
    System.out.println("\n #### Using Duble checked Synchronized LAZY Initialization ####");
    Runnable task1=()->{
        DoubleCheckDB doubleCheckDB=DoubleCheckDB.getInstance();
        doubleCheckDB.executeQuery("Update table Z : Instance ID : "+ doubleCheckDB.hashCode());
    };
    Thread t4=new Thread(task1,"Thread-4");
    Thread t5=new Thread(task1,"Thread-5");
    Thread t6=new Thread(task1,"Thread-6");
    t4.start();
    t5.start();
    t6.start();
    t6.join();

     //Bill Pugh DB 
    System.out.println("\n #### Using Bill Pugh Initialization ####");
    BillPughDB db2=BillPughDB.getInstance();
    BillPughDB db3=BillPughDB.getInstance();
    db2.executeQuery("Update row 1");
    System.out.println("is intances same ? "+ (db2==db3)+"\n");

}
}

