import java.util.*;
public class Loops {
    public static void main(String[] args) {
        // While Loop
        // int counter = 0;
        // while (counter < 100) {
        //     System.out.println("Hello World");
        //     counter ++;
        // }

        // Print number 1 to 100
        // int counter = 1;
        // while (counter <= 100) {
        //     System.out.println(counter);
        //     counter ++;
        // }

        // Through user input
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;
        // while (counter <= range) {
        //     System.out.println(counter);
        //     counter ++;
        
        // Print sum of first n natural number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println("Sum is " + sum);

        // Printing Hello World Through for Loop
        // int i = 1;
        // for(int i = 1; i <= 10; i ++){
        //     System.out.println("Hello World");
        // }

        // Print Star square pattern
        // for(int line = 1; line <= 4; line ++){
        //     System.out.println("* * * *");
        // }
        // Through while Loop
        // int line = 1;
        // while (line <= 4) {
        //     System.out.println("* * * *");
        //     line ++;
        // }

        // Reverse a number
        // int n = 105686;
        // while (n > 0) {
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit);
        //     n = n /10;
        // }

        // Reverse the given number
        // int n = 10899;
        // int rev = 0;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     n = n / 10;
        // }
        // System.out.println(rev);

        // Hello World through do while Loop
        // int counter = 1;
        // do{
        //     System.out.println("Hello World");
        //     counter ++;
        // }while(counter <= 10);

        // Break statement
        // for(int i = 1; i <= 5; i ++){
        //     if (i == 3) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the loop");

        // Keep entering number till user enter a multiple of 10
        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.print("Enter your number :");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0) {
        //         break;
        //     }
        //     System.out.println(n);
        // }while(true);

        // Continue statement
        // for(int i = 1; i <= 5; i ++){
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // Display all number entered by user except multiple of 10
        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.print("Enter your number :");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println("Number was :" + n);
        // }while(true);
        
        // Print natural number through for loop
        // int n = 5;
        // int sum = 0;
        // for(int i = 1; i <= n; i ++){
        //     sum += i;
        // }
        // System.out.println(sum);
            
        // Check if a number is prime or not
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            
        if (n == 2) {
                System.out.println(n + " is a prime number");
            }else{
                boolean isPrime = true;
                for(int i = 2; i <=Math.sqrt(n); i ++){
                    if (n % i == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime == true) {
                    System.out.println(n + " is a prime number");
                }
                else{
                    System.out.println(n + " is not a prime number");
                }
            }
            sc.close();
        }
    }
