import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: Enter number of terms: ");
        int n = sc.nextInt();
        sc.close();

        String result = "";

        int sum = 0, j = 1;
        for(int i = 1; i <= n; i++) {
            sum = sum + j;
            result = result + j + "+";
            j = (j * 10) + 1; 
        }

        System.out.println(result);
        System.out.println(sum);
    }
}
