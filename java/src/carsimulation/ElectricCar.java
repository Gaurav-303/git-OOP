package carsimulation;

public class ElectricCar extends car {

    public ElectricCar(int speed, double battery) {
        super(speed, battery);  // battery stored in 'fuel'
    }

    @Override
    public void drive(int hours) {
        double possibleDist = speed * hours;
        double batteryNeeded = possibleDist / 2;

        if (batteryNeeded <= fuel) {
            distance += possibleDist;
            fuel -= batteryNeeded;
        } else {
            double drivableDist = fuel * 2;
            distance += drivableDist;
            fuel = 0;
        }
    }

    @Override
    public void status() {
        System.out.println("Electric Car → Distance: " + distance + " km, Battery: " + fuel + "%");
    }
}
