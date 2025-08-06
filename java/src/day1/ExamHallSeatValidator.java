package day1;

public class ExamHallSeatValidator {
    public static void main(String[] args) {
        int[] ids = {21, 34, 43, 52};
        for (int i = 0; i < ids.length - 1; i++) {
            int lastDigit1 = ids[i] % 10;
            int lastDigit2 = ids[i + 1] % 10;
            if (lastDigit1 == lastDigit2) {
                System.out.println("Invalid - " + ids[i] + " and " + ids[i + 1] + " have same last digit");
                return;
            }
        }
        System.out.println("Valid");
    }
}
