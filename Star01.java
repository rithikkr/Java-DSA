public class Star01 {
    public static void main(String[] args) {
        // *
        // * *
        // * * *
        // * * * *
        // for(int line = 1; line <= 4; line ++){
        //     for(int star = 1; star <= line; star ++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // * * * *
        // * * * 
        // * * 
        // *
        // int n = 4;
        // for(int line = 1; line <= n; line ++){
        //     for(int star = 1; star <= (n - line + 1); star ++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 1
        // 1 2 
        // 1 2 3 
        // 1 2 3 4
        // int n = 4;
        // for(int line = 1; line <= n; line ++){
        //     for(int number = 1; number <= line; number ++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        // 1 2 3 4
        // 1 2 3
        // 1 2 
        // 1
        // int n = 4;
        // for(int line = 1; line <= n; line ++){
        //     for(int number = 1; number <= (n - line + 1); number ++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        // A
        // A B
        // A B C
        // A B C D
        int n = 4;
        char ch = 'A';
        for(int line = 1; line <= n; line ++){
            for(int charc = 1; charc <= line; charc ++){
                System.out.print(ch);
                ch ++;
            }
            System.out.println();
        }
    }
}
