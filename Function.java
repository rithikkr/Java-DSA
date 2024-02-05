import java.util.Scanner;

public class Function {
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
        // Swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    public static int multiply(int a, int b){
        int multiply = a * b;
        return multiply;
    }

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static int bincoff(int n, int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n - r);

        int bincoff = fac_n / (fac_r * fac_nmr);
        return bincoff;
    }

    // Function to calculate sum of 2 numbers
    // public static int sum(int a, int b){
    //     return a + b;
    // }
    // Function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    // Function to calculate int sum
    public static int sum(int a, int b){
        return a + b;
    }
    // Function to calculate float sum
    public static float sum(float a, float b){
        return a + b;
    }

    // Normal approach for prime number
    // public static boolean isPrime(int n){
    //     // corner cases for 2
    //     if (n == 2) {
    //         return true;
    //     }
    //     for(int i = 2; i <= n-1; i++){
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // Optimize approach for prime number
    public static boolean isPrime(int n){
        if (n == 2) {
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i ++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Print prime number 1 to 20
    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if (isPrime(i)) { //true
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    // Binary to decimal conversion
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow ++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    // Decimal to Binary
    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow ++;
            n = n /2;
        }
        System.out.println("Binary of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        // printHelloWorld();
        
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a , b);
        // System.out.println(sum);
        // sc.close();

        // Swap - Value Exchange
        // int a = 10;
        // int b = 5;
        // swap(a , b);

        // int a = 10;
        // int b = 5;
        // int product = multiply(a, b);
        // System.out.println(product);

        // System.out.println(factorial(4));

        // System.out.println(bincoff(5, 2));

        // System.out.println(sum(2, 5));
        // System.out.println(sum(2, 5, 9));

        // System.out.println(sum(2, 5));
        // System.out.println(sum(2.5f, 5.2f));

        // System.out.println(isPrime(3));
        
        // primesInRange(16);

        binToDec(1011);
        decToBin(15);

    }
}
