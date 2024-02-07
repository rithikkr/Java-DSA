public class AdvancePattern {

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

    public static void main(String[] args) {
        // hollow_rectangel(4, 5);
        // half_pyramid(5);
        // half_pyramid_withNumber(5);
        floyds_triangle(5);
    }
}