public class OddDigitReverser {
    public static void main(String[] args) {
        int number = 123456789;
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                result.append(digit);
            }
            number /= 10;
        }
        System.out.println(result.toString());
    }
}
