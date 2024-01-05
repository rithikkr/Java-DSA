public class TypePromotion {
    public static void main(String[] args) {
        // Wrong Statement
        // byte b = 5;
        // byte a = b * 2;
        // System.out.println(a);

        // Right Statement
        byte b = 5;
        byte a = (byte) (b * 2);
        System.out.println(a);
    }
}
