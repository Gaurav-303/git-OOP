package day1;

public class PasswordEncoder {
    public static void main(String[] args) {
        String input = "Java1234";
        StringBuilder encoded = new StringBuilder();
        for (char c : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                encoded.append("@");
            } else if (Character.isDigit(c) && (c - '0') % 2 == 0) {
                encoded.append("*");
            } else {
                encoded.append(Character.toUpperCase(c));
            }
        }
        System.out.println(encoded.toString());
    }
}
