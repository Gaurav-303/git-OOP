import java.util.Scanner;

public class VowelPuzzleChecker {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    static String checkPuzzleWord(String word) {
        if (word.length() < 3) {
            return "Invalid";
        }

        if (!isVowel(word.charAt(0)) || !isVowel(word.charAt(word.length() - 1))) {
            return "Invalid";
        }

        int vowelCount = 0;
        for (int i = 1; i < word.length() - 1; i++) {
            if (isVowel(word.charAt(i))) {
                vowelCount++;
            }
        }

        return vowelCount == 2 ? "Valid" : "Invalid";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        String result = checkPuzzleWord(input);
        System.out.println(result);
    }
}