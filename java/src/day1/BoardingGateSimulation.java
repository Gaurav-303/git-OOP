package day1;

import java.util.*;

public class BoardingGateSimulation {
    public static void main(String[] args) {
        int[] actual = {101, 103, 102, 104};
        int[] expected = actual.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i]) {
                count++;
            }
        }
        System.out.println(count / 2);
    }
}
