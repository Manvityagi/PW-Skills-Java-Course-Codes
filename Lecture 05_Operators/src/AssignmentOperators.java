public class AssignmentOperators {
    public static void main(String[] args) {
        int p = 10;
        int q;

        // =
        q = p;
        System.out.println(q); //10

        // +=
        p += q; // p = p + q, p = 10 + 10 = 20
        System.out.println(p); //20

        p -= q; // p = p - q , p = 20 - 10 = 10
        System.out.println(p); //10

        p *= q; // p = p * q
        System.out.println(p); //100

        p /= q; // p = p/q , p = 100/10 = 10
        System.out.println(p); //10







    }
}
