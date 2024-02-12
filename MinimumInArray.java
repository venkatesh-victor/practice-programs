import java.util.Scanner;

public class MinimumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter element " + i);
            arr[i] = sc.nextInt();
        }

        sc.close();

        int min = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("The smallest value of the array is: " + min);
    }
}
