import java.util.HashSet;
import java.util.Set;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] sortedArray1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] sortedArray2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};

        System.out.println("Input:\nArray 1:");
        for(int i = 0; i < sortedArray1.length; i++) {
            System.out.print(sortedArray1[i] + " ");
        }
        System.out.println();

        System.out.println("Array2:");
        for(int i = 0; i < sortedArray2.length; i++) {
            System.out.print(sortedArray2[i] + " ");
        }
        System.out.println();

        System.out.println("Output: Merged Array: ");
        mergedElements(sortedArray1, sortedArray2);

        System.out.println();
    }

   public static void mergedElements(int[] arr1, int[] arr2) {
        Set<Integer> uniqueElements = new HashSet<>();

        for(int element : arr1) {
            uniqueElements.add(element);
        }

        for(int element: arr2) {
            uniqueElements.add(element);
        }

        for(int element: uniqueElements) {
            System.out.print(element + " ");
        }
   }
   
}
