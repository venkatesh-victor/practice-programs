import java.util.Scanner;

public class AlphabetCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char character = sc.next().charAt(0);

		if(Character.isLetter(character))
			System.out.println(character + " is an alphabet.");

		else
			System.out.println(character + " is not an alphabet.");
	}
}