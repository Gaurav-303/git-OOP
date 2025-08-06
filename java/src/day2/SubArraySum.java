package day2;

import java.util.*;

public class SubArraySum {
    public static List<Integer> findSubarray(int[] arr, int target) {
        int start = 0, sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > target) {
                sum -= arr[start++];
            }
            if (sum == target) {
                List<Integer> res = new ArrayList<>();
                for (int i = start; i <= end; i++) res.add(arr[i]);
                return res;
            }
        }
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(findSubarray(arr, target));
    }
}
