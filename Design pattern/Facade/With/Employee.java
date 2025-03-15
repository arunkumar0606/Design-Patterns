package Facade.With;

public class Employee {
    public static void main(String[] args) {

        OfficeFacade officeFacade=new OfficeFacade();

        officeFacade.casualDay();

        System.out.println("###########\n");
        officeFacade.formalDay();

    }
}
