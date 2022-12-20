public class BitwiseOperators {
    public static void main(String[] args) {
        int p = 5, q = 3; // p = 101, q = 011

        System.out.println(p & q); // 1
        System.out.println(p | q); // 7
        System.out.println(p ^ q); // 6

        System.out.println(p << 1); //10
        System.out.println(p << 2); //20

        int r = 11;
        System.out.println(r >> 1); // 5
        System.out.println(r >> 2); // 2
    }
}
