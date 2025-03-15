package Factory.With;

public class VehicleFactory {
    public static Vehicle creatVehicle(String type){
        if("CAR".equals(type))
            return new Car();
        else if("BIKE".equals(type)){
            return new Bike();
        }
        return null;
    }
}
