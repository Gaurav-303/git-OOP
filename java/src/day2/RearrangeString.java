package day2;

import java.util.*;

public class RearrangeString {
    public static String rearrange(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) pq.add(new int[]{i, freq[i]});
        }

        StringBuilder res = new StringBuilder();
        int[] prev = {-1, 0};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            res.append((char)(curr[0] + 'a'));
            if (prev[1] > 0) pq.add(prev);
            curr[1]--;
            prev = curr;
        }

        return res.length() == s.length() ? res.toString() : "";
    }

    public static void main(String[] args) {
        System.out.println(rearrange("aaabbc"));  // e.g., "ababac"
    }
}
