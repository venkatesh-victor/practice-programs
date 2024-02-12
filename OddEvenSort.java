import java.util.Arrays;

public class OddEvenSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        sortOddEvenPositions(arr);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void sortOddEvenPositions(int[] arr) {
        int n = arr.length;

        int[] oddPositions = new int[(n + 1) / 2];
        int[] evenPositions = new int[n / 2];

        int oddIndex = 0, evenIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenPositions[evenIndex++] = arr[i];
            } else {
                oddPositions[oddIndex++] = arr[i];
            }
        }

        Arrays.sort(oddPositions);
        reverse(oddPositions);

        Arrays.sort(evenPositions);

        int i = 0, j = 0;
        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                arr[k] = evenPositions[i++];
            } 
            else {
                arr[k] = oddPositions[j++];
            }
        }
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
