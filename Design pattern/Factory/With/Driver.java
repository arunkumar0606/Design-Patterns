package Factory.With;

public class Driver {
    public static void main(String[] args) {
        //when driver wants to drive Car
        Vehicle vehicle=VehicleFactory.creatVehicle("CAR");
        vehicle.drive();

        //when driver wants to drive bike
        Vehicle vehicle2=VehicleFactory.creatVehicle("BIKE");
        vehicle2.drive();
    }
}
