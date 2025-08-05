public class RemoveOnlyDigits {
    public static void main(String[] args) {
        String input = "a1b2c3d4";
        System.out.println(reverseDigitsOnly(input));
    }

    public static String reverseDigitsOnly(String s) {
        StringBuilder result = new StringBuilder(s);
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (!Character.isDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isDigit(s.charAt(right))) {
                right--;
            } else {
                result.setCharAt(left, s.charAt(right));
                result.setCharAt(right, s.charAt(left));
                left++;
                right--;
            }
        }
        return result.toString();
    }
}
