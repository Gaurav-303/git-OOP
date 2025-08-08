package librarybookmanagement;

public class Fiction extends Book {
    public Fiction(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayType() {
        System.out.println("Category: Fiction");
    }
}

