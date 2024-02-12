import java.util.Scanner;

public class RepeatCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        String input = sc.nextLine();

        String output = "";

        int i = 0;
        while (i < input.length()) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                output += currentChar;
                i++;
            }

            else if (Character.isDigit(currentChar)) {
                int count = 0;
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    count = count * 10 + ((int) input.charAt(i));
                    i++;
                }

                for (int j = 0; j < count; j++) {
                    output += currentChar;
                }
            }
        }

        System.out.println("Output: " + output);
    }
}
