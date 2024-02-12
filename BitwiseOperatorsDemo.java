public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 6;

        int resultAnd = num1 & num2;
        System.out.println("Bitwise AND Result: " + resultAnd);

        int resultOr = num1 | num2;
        System.out.println("Bitwise OR Result: " + resultOr);

        int resultXor = num1 ^ num2;
        System.out.println("Bitwise XOR Result: " + resultXor);

        int resultNotNum1 = ~num1; 
        System.out.println("Bitwise NOT Result for num1: " + resultNotNum1);

        int resultNotNum2 = ~num2;
        System.out.println("Bitwise NOT Result for num2: " + resultNotNum2);

        int resultLeftShift = num1 << 1;
        System.out.println("Bitwise Left Shift Result for num1: " + resultLeftShift);

        int resultRightShift = num2 >> 1;
        System.out.println("Bitwise Right Shift Result for num2: " + resultRightShift);

        int num3 = -10;
        int resultUnsignedRightShift = num3 >>> 1;
        System.out.println("Bitwise Unsigned Right Shift Result for num3: " + resultUnsignedRightShift);
    }
}
