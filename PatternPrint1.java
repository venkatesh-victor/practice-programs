public class PatternPrint1 {
	public static void main(String[] args) {
		int rows = 9, i, j, space;

		for(i = rows; i >= 1; i--) {
			
			for(space = rows - i; space > 0; space--) {
				System.out.print(" ");
			}
			
			for(j = i; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}
	}
}