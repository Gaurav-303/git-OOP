package vehiclemangement;

public class TollBooth {
    public void processVehicle(Vehicle vehicle) {
        System.out.println("Processing Vehicle: " + vehicle.getPlateNumber());
        System.out.println("Hours Stayed: " + vehicle.getHoursStayed());
        System.out.println("Toll Amount: ₹" + vehicle.getTollAmount());
        System.out.println("--------------------------------");
    }
}

