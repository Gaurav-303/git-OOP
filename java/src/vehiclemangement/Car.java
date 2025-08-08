package vehiclemangement;
public class Car extends Vehicle {
    public Car(String plateNumber, int hoursStayed) {
        super(plateNumber, hoursStayed);
    }

    @Override
    public double getTollAmount() {
        return 20.0 * getHoursStayed();  // ₹20/hour
    }
}

