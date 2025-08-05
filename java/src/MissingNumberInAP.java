public class MissingNumberInAP {

    public static void main(String[] args) {
        int[] arr = {2, 6, 10, 14, 18};
        int missing = findMissingNumber(arr);
        System.out.println("Missing number: " + missing);
    }

    public static int findMissingNumber(int[] arr) {
        sortArray(arr);
        int n = arr.length + 1;
        int d = (arr[arr.length - 1] - arr[0]) / n;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != d) {
                return arr[i] + d;
            }
        }
        return -1; // if nothing found
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
