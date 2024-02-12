public class PatternPrint3 {
    public static void main(String[] args) {
        int rows = 9;

        for(int i = 1; i <= rows; i++) {
            
            for(int spaces = 1; spaces <= rows - i; spaces++) {
                System.out.print("  ");
            }

            for(int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }
            
            if(i > 1) {
                for(int num = i - 1; num >= 1; num--) {
                    System.out.print(num + " ");
                }
            }

            System.out.println();
        }
            
    }
}

