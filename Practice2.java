public class Practice2 {
    public static void main(String[] args) {
        // int x = 2;
        // int y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.println(exp1); 5
        // System.out.println(exp2); 4

        // int x = 200;
        // int y = 50;
        // int z = 100;
        // if(x > y && y > z){
        //     System.out.println("Hello");
        // }
        // if(z > y && z < x){
        //     System.out.println("Java"); Right
        // }
        // if((y+200) < x && (y+150) < z){
        //     System.out.println("Hello Java");
        // }

        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z); 4 0 0

        int x = 10;
        int y = 5;
        int exp1 = (y * (x / y +  x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
