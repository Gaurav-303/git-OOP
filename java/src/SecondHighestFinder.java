public class SecondHighestFinder {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 5, 2};
        int[] unique = removeDuplicates(arr);
        int secondHighest = findSecondHighest(unique);

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest unique number found.");
        } else {
            System.out.println("Second highest unique number: " + secondHighest);
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean exists = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                temp[count++] = arr[i];
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static int findSecondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                second = highest;
                highest = arr[i];
            } else if (arr[i] > second && arr[i] != highest) {
                second = arr[i];
            }
        }

        return second;
    }
}
