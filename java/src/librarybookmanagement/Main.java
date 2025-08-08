package librarybookmanagement;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Fiction("The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new NonFiction("Sapiens", "Yuval Noah Harari");
        Book b3 = new Magazine("National Geographic", "Various");

        b1.displayType();
        b1.printDetails();
        b2.displayType();
        b2.printDetails();
        b3.displayType();
        b3.printDetails();

        System.out.println("\n--- Issue Books ---");
        b1.issueBook();
        b1.issueBook(); // Try issuing again to check status
        b2.issueBook();

        System.out.println("\n--- Return Books ---");
        b1.returnBook();
        b1.returnBook(); // Try returning again

        System.out.println("\n--- Final Details ---");
        b1.printDetails();
        b2.printDetails();
        b3.printDetails();
    }
}

