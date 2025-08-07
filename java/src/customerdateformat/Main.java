package customerdateformat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        System.out.print("Enter month: ");
        int m = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        MyDate date = new MyDate(d, m, y);

        if (!date.isValid()) {
            System.out.println("Invalid Date.");
            return;
        }

        System.out.println("Original:");
        date.print();

        date.increment();

        System.out.println("After Increment:");
        date.print();

        sc.close();
    }
}

