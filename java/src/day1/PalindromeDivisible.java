package day1;

import java.util.Scanner;

public class PalindromeDivisible {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }

    public static boolean sumDivisibleBy3(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Invalid input! Please enter a 3-digit number.");
        } else if (isPalindrome(number) && sumDivisibleBy3(number)) {
            System.out.println("Jackpot!");
        } else {
            System.out.println("Try Again!");
        }

        scanner.close();
    }
}
