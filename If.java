import java.util.*;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age >= 18) {
        //     System.out.println("You can Drive");
        // }
        // else{
        //     System.out.println("You cannot drive");
        // }

        // Greater number
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // if (A >= B) {
        //     System.out.println("A is Greater");
        // }
        // else{
        //     System.out.println("B is Greater");
        // }

        // Even Odd
        // int number = sc.nextInt();
        // if (number % 2== 0) {
        //     System.out.println("Even number");
        // }
        // else{
        //     System.out.println("Odd number");
        // }

        // Else if
        // int age = sc.nextInt();
        // if(age <= 18){
        //     System.out.println("Adult");
        // }
        // else if(age <= 30){
        //     System.out.println("Middle age");
        // }
        // else{
        //     System.out.println("Old age");
        // }

        // Income tax calculator
        // int income = sc.nextInt();
        // int tax;
        // if(income <= 500000){
        //     tax = 0;
        // }
        // else if(income >= 500000 && income < 1000000){
        //     tax = (int)(income * 0.2);
        // }
        // else{
        //     tax = (int)(income * 0.3);
        // }
        // System.out.println("Your tax is : " + tax);

        // Largest of 3
        // int A = 1, B = 3, C = 6;
        // if((A >= B) && (A >= C)){
        //     System.out.println("Largest is A");
        // }
        // else if(B >= C){
        //     System.out.println("Largest is B");
        // }
        // else{
        //     System.out.println("Largest is C");
        // }

        // Ternary operator
        int number = 4;
        String type = ((number % 2) == 0) ? "Even" : "Odd";
        System.out.println(type);
        sc.close();
    }
}
