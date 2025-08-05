public class ReversibleNumberChecker {

    public static void main(String[] args) {
        int num = 36;
        boolean result = isReversible(num);
        System.out.println(result);
    }

    public static boolean isReversible(int n) {
        int reversed = reverse(n);
        int sum = n + reversed;

        while (sum > 0) {
            int digit = sum % 10;
            if (digit % 2 == 0) {
                return false;
            }
            sum /= 10;
        }

        return true;
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
