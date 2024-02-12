import java.util.Arrays;

public class AlternateSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Input: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        alternateSort(arr);

        System.out.println("Alternate sorted array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void alternateSort(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int[] result = new int[n];

        int left = 0, right = n - 1, index = 0;

        while (left <= right) {
            result[index] = arr[right];
            index++;
            right--;

            if (left <= right) {
                result[index] = arr[left];
                index++;
                left++;
            }
        }

        for(int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}
