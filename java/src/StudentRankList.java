import java.util.*;

public class StudentRankList {
    public static void main(String[] args) {
        int[] marks = {50, 80, 60};
        Integer[] sortedMarks = Arrays.stream(marks).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedMarks, Collections.reverseOrder());
        for (int i = 0; i < sortedMarks.length; i++) {
            System.out.println((i + 1) + ". " + sortedMarks[i]);
        }
    }
}

