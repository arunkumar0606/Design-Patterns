package Factory.With;

public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving car through inheritance");
    }
    
}
