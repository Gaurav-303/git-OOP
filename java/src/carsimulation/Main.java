package carsimulation;

public class Main {
    public static void main(String[] args) {
        car petrolcar = new car(60, 10);
        car tesla = new ElectricCar(80, 100);

        petrolcar.drive(2);
        tesla.drive(2);

        petrolcar.status();
        tesla.status();
    }
}
