package animalmanagementsystem;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo");
        Animal elephant = new Elephant("Ella");
        Animal monkey = new Monkey("Momo");

        lion.makeSound();
        elephant.eat();
        monkey.sleep();
        monkey.makeSound();
        monkey.wakeUp();
        monkey.eat();

        System.out.println(monkey.getName() + " Health: " + monkey.getHealth());
    }
}

