package Observer;

public class User implements Subscriber{

    private String name; 

    public User(String name){
        this.name=name;
    }

    public void update(String videoName){
        System.out.println(name+" recieved notification :"+"Arun Uploaded new video : "+videoName);
    }
    
}
