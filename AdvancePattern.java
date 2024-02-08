public class AdvancePattern {

    // * * * * *
    // *       *
    // *       *
    // * * * * *
    public static void hollow_rectangel(int totalrows, int totalcols){
        // Outerloop
        for(int i = 1; i <= totalrows; i ++){
            // inner - columns
            for(int j = 1; j <= totalcols; j ++){
                // cell - (i , j)
                if (i == 1 || i == totalrows || j == 1 || j == totalcols) {
                    // Boundary cell
                    System.err.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //       *
    //     * *
    //   * * *
    // * * * *
    public static void half_pyramid(int n){
        // Outer loop
        for(int i = 1; i <= n; i ++){
            // Printing spaces
            for(int j = 1; j <= (n - i); j ++){
                System.out.print(" ");
            }

            // Printing star
            for(int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 1 2 3 4 5
    // 1 2 3 4 
    // 1 2 3 
    // 1 2 
    // 1 
    public static void half_pyramid_withNumber(int n){
        // Outer loop
        for(int i = 1; i <= n; i ++){

            // inner - Number
            for(int j = 1; j <= (n - i + 1); j ++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 1
    // 2 3 
    // 4 5 6 
    // 7 8 9 10
    // 11 12 13 14
    public static void floyds_triangle(int n){
        // outer loop
        int counter = 1;
        for(int i = 1; i <= n; i ++){
            
            // inner - how many times will counter be printed
            for(int j = 1; j <= i; j ++){
                System.out.print(counter + " ");
                counter ++;
            }
            System.out.println();
        }
    }

    // 1 
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    public static void zero_one_triangle(int n){
        // Outer loop
        for(int i = 0; i <= n; i ++){
            // Inner loop
            for(int j = 1; j <= i; j ++){

                // Main - Printing logic
                if ((i +j) % 2 == 0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // *             *
    // * *         * *
    // * * *     * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * *     * * *
    // * *         * *
    // *             *
    public static void butterfly_pattern(int n){
        // 1st half 
        for(int i = 1; i <= n; i ++){
            // for printing stars - i
            for(int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            // for printing spaces - 2 * (n - i)
            for(int j = 1; j <= (2 * (n - i)); j ++){
                System.out.print(" ");
            }
            // for printing stars - i
            for(int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();

        }
            // 2nd half
        for(int i = n; i >= 1; i --){
            // for printing stars - i
            for(int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            // for printing spaces - 2 * (n - i)
            for(int j = 1; j <= (2 * (n - i)); j ++){
                System.out.print(" ");
            }
            // for printing stars - i
            for(int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //         * * * * *
    //       * * * * *
    //     * * * * *
    //   * * * * *
    // * * * * *
    public static void solid_rhombus(int n){
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= (n - i); j ++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j ++){
                System.err.print("*");
            }
            System.out.println();
        }
    }

    //      * * * * * 
    //     *      * 
    //    *      * 
    //   *      * 
    // * * * * *
    public static void hollow_rectangle(int n){
        for(int i = 1; i <= n; i ++){
            // Printing spaces
            for(int j = 1; j <= (n - i); j ++){
                System.out.print(" ");
            }

            // hollow hollow_rectangle
            for(int j = 1; j <= n; j ++){
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //         *
    //       * * *
    //     * * * * *
    //   * * * * * * *
    //   * * * * * * *
    //     * * * * *
    //       * * * 
    //         *

    public static void dimond_printing(int n){
        // 1st half
        for(int i = 1; i <= n; i ++){
            // for printing spaces
            for(int j = 1; j <= (n - i); j ++){
                System.out.print(" ");
            }
            // for printing stars
            for(int j = 1; j <= (2 * i - 1); j ++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i = n; i >= 1; i --){
            // for printing spaces
            for(int j = 1; j <= (n - i); j ++){
                System.out.print(" ");
            }
            // for printing stars
            for(int j = 1; j <= (2 * i - 1); j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollow_rectangel(4, 5);
        // half_pyramid(5);
        // half_pyramid_withNumber(5);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // butterfly_pattern(5);
        // solid_rhombus(5);
        // hollow_rectangle(5);
        dimond_printing(4);
    }
}