import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character: ");
		char character = sc.next().charAt(0);

		System.out.println("Ascii value of " + character + " is: " + (int)character);
	}
}