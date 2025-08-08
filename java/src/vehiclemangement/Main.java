package vehiclemangement;

public class Main {
    public static void main(String[] args) {

        TollBooth tollBooth = new TollBooth();

        Vehicle bike = new Bike("MH12AB1234", 2);
        Vehicle car = new Car("MH14CD5678", 3);
        Vehicle truck = new Truck("MH20EF9012", 5);

        tollBooth.processVehicle(bike);   // Polymorphism
        tollBooth.processVehicle(car);    // Polymorphism
        tollBooth.processVehicle(truck);  // Polymorphism
    }
}

