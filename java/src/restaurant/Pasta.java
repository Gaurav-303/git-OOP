package restaurant;

public class Pasta extends FoodItem {
    public Pasta() {
        super(199.0, 12);
    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients: Pasta, Cream, Cheese, Vegetables");
    }
}

