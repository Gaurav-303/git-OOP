package carsimulation;

public class car {
    protected int speed;
    protected double fuel;
    protected double distance;

    public car(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
        this.distance = 0;
    }

    public void drive(int hours) {
        double possibleDist = speed * hours;
        double fuelNeeded = possibleDist / 15;

        if (fuelNeeded <= fuel) {
            distance += possibleDist;
            fuel -= fuelNeeded;
        } else {
            double drivableDist = fuel * 15;
            distance += drivableDist;
            fuel = 0;
        }
    }

    public void status() {
        System.out.println("Car → Distance: " + distance + " km, Fuel: " + fuel + " L");
    }
}
