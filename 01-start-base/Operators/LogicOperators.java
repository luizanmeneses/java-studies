public class LogicOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        boolean result = (a == 1) && (b == 2); // Logical AND
        System.out.println("Result of AND: " + result);
        
        boolean result2 = (a == 1) || (b == 3); // Logical OR
        System.out.println("Result of OR: " + result2);

        boolean trueValue = true;
        boolean falseValue = false;
        System.out.println(trueValue && falseValue); // false
        System.out.println(trueValue || falseValue); // true
        System.out.println(trueValue ^ falseValue); // true (XOR)
        System.out.println(!trueValue || falseValue); // false (NOT)
    }
}