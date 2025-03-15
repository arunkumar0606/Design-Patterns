package Factory.Without;

public class Driver {
    public static void main(String[] args) {
        
        // when driver wants to drive car 
        Car car=new Car();
        car.drive();

        //when driver wants to drive Bike
        Bike bike =new Bike();
        bike.drive();
    }
}
