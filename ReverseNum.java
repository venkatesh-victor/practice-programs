import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        sc.close();

        while(num > 0) {
            int rem = num % 10;
            System.out.print(rem);
            num = num / 10;
        }

        System.out.println();
    }
}
