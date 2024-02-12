import java.util.Scanner;

public class PrintC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= n; i++) 
        {
            if((i == 1) || (i == n))
            {
                for(int j = 1; j <= n; j++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }
            else
            {
                System.out.println("*");
            }
        }
    }  
}
