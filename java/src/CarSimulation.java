class Car {
    int speed;
    double fuel;
    double distance;

    Car(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
        this.distance = 0;
    }

    void drive(int hours) {
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

    void status() {
        System.out.println("Car → Distance: " + distance + " km, Fuel: " + fuel + " L");
    }
}

class ElectricCar extends Car {
    ElectricCar(int speed, double battery) {
        super(speed, battery);
    }

    void drive(int hours) {
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

    void status() {
        System.out.println("Electric Car → Distance: " + distance + " km, Battery: " + fuel + "%");
    }
}

public class CarSimulation {
    public static void main(String[] args) {
        Car petrolCar = new Car(60, 10);
        Car tesla = new ElectricCar(80, 100);

        petrolCar.drive(2);
        tesla.drive(2);

        petrolCar.status();
        tesla.status();
    }
}
