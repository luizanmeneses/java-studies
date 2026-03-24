public class ArithmeticOperators {
    // Entry point for demonstrating basic arithmetic operators
    public static void main(String[] args){
        int result = 1 + 2;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result * 2;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result + 8;
        System.out.println(result);

        result = result % 7; //It's 3 because the remainder of 9 divided by 7 is 3.
        System.out.println(result);

        String text1 = "Hello";
        String text2 = "Operators";
        String concat = text1 + " " + text2; //The + operator can also be used to concatenate strings.
        System.out.println(concat);

        System.out.println(result++); //It will print 3 and then it will increment to 4. So, first print e after increment.
        System.out.println(++result); //It will increment to 5 and then it will print 5. Here, first increment and after print.
    }
}