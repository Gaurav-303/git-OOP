package vehiclemangement;

public class Truck extends Vehicle {
    public Truck(String plateNumber, int hoursStayed) {
        super(plateNumber, hoursStayed);
    }

    @Override
    public double getTollAmount() {
        return 50.0 * getHoursStayed();  // ₹50/hour
    }
}
