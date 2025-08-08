package librarybookmanagement;

// Abstraction & Encapsulation
public abstract class Book {
    private String title;
    private String author;
    private boolean isIssued; // Encapsulation: status hidden from outside

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }


    public abstract void displayType();

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("'" + title + "' has been issued.");
        } else {
            System.out.println("'" + title + "' is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("'" + title + "' has been returned.");
        } else {
            System.out.println("'" + title + "' was not issued.");
        }
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isIssued ? "Issued" : "Available"));
    }
}

