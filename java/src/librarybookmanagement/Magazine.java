package librarybookmanagement;

public class Magazine extends Book {
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayType() {
        System.out.println("Category: Magazine");
    }
}

