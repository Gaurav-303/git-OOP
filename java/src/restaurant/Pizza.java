package restaurant;

public class Pizza extends FoodItem {
    public Pizza() {
        super(299.0, 15);
    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients: Dough, Tomato Sauce, Cheese, Veggies");
    }
}

