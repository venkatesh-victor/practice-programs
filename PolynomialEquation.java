import java.util.Scanner;

public class PolynomialEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter co-efficients: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        sc.close();

        double delta = (b*b) - (4*a*c);

        if(delta > 0) {
            System.out.println("Roots are real and unequal");

            double alpha = (b + Math.sqrt(delta)) / (2*a);
            double beta  = (b - Math.sqrt(delta)) / (2*a);

            System.out.println("The roots are " + alpha + " and " + beta);
        }

        if(delta == 0) {
            System.out.println("Roots are real and equal");

            double root = b / (2*a);

            System.out.println("The solution is: " + root);
        }

        if(delta < 0) {
            System.out.println("The roots are imaginary");
            
            delta = Math.abs(delta);
            double alpha = (b + Math.sqrt(delta) / (2*a));
            double beta  = (b - Math.sqrt(delta) / (2*a));

            System.out.println("The roots are " + alpha + "i" + " and " + beta + "i");

        }
    }
}
