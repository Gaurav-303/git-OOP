package librarybookmanagement;

public class NonFiction extends Book {
    public NonFiction(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayType() {
        System.out.println("Category: Non-Fiction");
    }
}

