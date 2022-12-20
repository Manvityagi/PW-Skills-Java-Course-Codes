public class Power {
//    static int pow(int p, int q){ // p^q -> TC - O(q)
//        if(q == 0) return 1;
//        return pow(p, q-1) * p; // p^q-1 * p = p^q
//    }

    static int pow(int p, int q){
        if(q == 0) return 1;
        int smallPow = pow(p, q/2);
        if(q % 2 == 0){ // even
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
