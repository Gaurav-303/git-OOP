package restaurant;

public class Burger extends FoodItem {
    public Burger() {
        super(149.0, 10);
    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients: Bun, Patty, Lettuce, Cheese, Sauce");
    }
}
