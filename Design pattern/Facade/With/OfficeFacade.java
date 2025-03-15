package Facade.With;

public class OfficeFacade {
    private Casual casual=new Casual();
    private Formal formal=new Formal();


    public void formalDay(){
        formal.shirt();
        formal.pant();
        formal.belt();
        formal.shoe();
    }

    public void casualDay(){
        casual.shirt();
        casual.shorts();
        casual.shoe();
        formal.belt();
    }

}
