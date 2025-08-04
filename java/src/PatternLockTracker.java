import java.util.Scanner;

public class PatternLockTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPattern = "1234";
        int attempts = 5;
        boolean success = false;

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Enter 4-digit pattern (Attempt " + i + "): ");
            String input = scanner.nextLine();
            if (input.equals(correctPattern)) {
                System.out.println("Success");
                success = true;
                break;
            }
        }

        if (!success) {
            System.out.println("System Locked");
        }

        scanner.close();
    }
}
