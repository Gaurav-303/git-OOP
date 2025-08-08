package restaurant;

// Abstraction: Common blueprint for all food items
public abstract class FoodItem {
    private double price;         // Encapsulation
    private int preparationTime;  // Encapsulation

    public FoodItem(double price, int preparationTime) {
        this.price = price;
        this.preparationTime = preparationTime;
    }

    public double getPrice() {
        return price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    // Abstract method for ingredients
    public abstract void showIngredients();

    public void displayDetails() {
        System.out.println("Price: ₹" + price);
        System.out.println("Preparation Time: " + preparationTime + " mins");
    }
}

