package day2;

public class RepeatingPatternFinder {

    public static void main(String[] args) {
        String input = "abcabcabc";
        String pattern = findRepeatingPattern(input);
        System.out.println(pattern);
    }

    public static String findRepeatingPattern(String str) {
        int len = str.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String sub = str.substring(0, i);
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < len / i; j++) {
                    repeated.append(sub);
                }
                if (repeated.toString().equals(str)) {
                    return sub;
                }
            }
        }
        return str;
    }
}
