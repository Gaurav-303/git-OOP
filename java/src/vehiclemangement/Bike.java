package vehiclemangement;

public class Bike extends Vehicle {
    public Bike(String plateNumber, int hoursStayed) {
        super(plateNumber, hoursStayed);
    }

    @Override
    public double getTollAmount() {
        return 10.0 * getHoursStayed();  // ₹10/hour
    }
}

