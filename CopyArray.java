import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in array 1.");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter element " + i );
            arr1[i] = sc.nextInt();
        }

        sc.close();

        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.print("Array 2 is: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
