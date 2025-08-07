package animalmanagementsystem;


public abstract class Animal {
    private String name;
    private int health;
    private boolean isSleeping;

    public Animal(String name) {
        this.name = name;
        this.health = 100;
        this.isSleeping = false;
    }

    public void eat() {
        if (!isSleeping) {
            System.out.println(name + " is eating.");
            health += 10;
        } else {
            System.out.println(name + " is sleeping and cannot eat.");
        }
    }

    public void sleep() {
        System.out.println(name + " is now sleeping.");
        isSleeping = true;
    }

    public void wakeUp() {
        System.out.println(name + " woke up.");
        isSleeping = false;
    }

    public abstract void makeSound();

    // Getters and Setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public String getName() {
        return name;
    }
}

