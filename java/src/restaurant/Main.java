package restaurant;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: same reference type for different items
        FoodItem order1 = new Pizza();
        FoodItem order2 = new Burger();
        FoodItem order3 = new Pasta();

        System.out.println("----- Order 1: Pizza -----");
        order1.displayDetails();
        order1.showIngredients();

        System.out.println("\n----- Order 2: Burger -----");
        order2.displayDetails();
        order2.showIngredients();

        System.out.println("\n----- Order 3: Pasta -----");
        order3.displayDetails();
        order3.showIngredients();
    }
}

