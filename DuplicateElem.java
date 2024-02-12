import java.util.Scanner;
import java.util.Arrays;

public class DuplicateElem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements one by one: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.println("Duplicates elements are:-");
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i + 1]) 
				System.out.print(arr[i] + " ");
		}

		System.out.println();

	}
}