import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float a = 13.129999999f;
        // int b = (int) a; //(int) Through this typecasting is possible, The after decimal point is removed;
        // System.out.println(b);

        char ch = 'a';   
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
        sc.close();
    }
}
