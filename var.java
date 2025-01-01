public class var {
    public static void main(String[] args) {
        // Integer variable
        int myInt = 10;
        System.out.println("Integer: " + myInt);

        // Double variable
        double myDouble = 5.99;
        System.out.println("Double: " + myDouble);

        // Character variable (single quotes)
        char myChar = 'A';
        System.out.println("Character: " + myChar);

        // String variable
        String myString = "Hello, World!";
        System.out.println("String: " + myString);

        // Boolean variable
        boolean myBool = true;
        System.out.println("Boolean: " + myBool);
        // Method overloading demonstration
        System.out.println("Sum of 2 and 3: " + sum(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + sum(2.5, 3.5));
        System.out.println("Sum of 1, 2, and 3: " + sum(1, 2, 3));
        }

        // Method to sum two integers
        public static int sum(int a, int b) {
        return a + b;
        }

        // Method to sum two doubles
        public static double sum(double a, double b) {
        return a + b;
        }

        // Method to sum three integers
        public static int sum(int a, int b, int c) {
        return a + b + c;
        }
    }
}