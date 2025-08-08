package vehiclemangement;

public abstract class Vehicle {
    private String plateNumber;
    private int hoursStayed;

    public Vehicle(String plateNumber, int hoursStayed) {
        this.plateNumber = plateNumber;
        this.hoursStayed = hoursStayed;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getHoursStayed() {
        return hoursStayed;
    }

    // Abstract method (Abstraction)
    public abstract double getTollAmount();
}

