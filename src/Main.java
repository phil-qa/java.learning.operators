public class Main {
    public static void main(String[] args){
        //Example of an operator on two operands
        String myString = "A string";
        String newString = myString + myString;
        System.out.println(newString);

        //Another example of where the two operands 12 and 13 return a value having been operated on
        int myNumber = 12 + 13;
        System.out.println(myNumber);

        int result = 4 + 2; // 4 + 2 = 6
        System.out.println("4 + 2 = " + result);
        int stored = result;
        System.out.println("previousResult =  " + stored);
        result = result - 1;    // 6 - 1 = 5
        System.out.println("6  - 1 = " + result);
        System.out.println("previousResult =  " + stored);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        //example of boolean
       String remainder =  3 % 2 != 0 ? "Had a remainder" : "Did not have a remainder";
       System.out.println(remainder);
    }
}
