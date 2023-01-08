import java.util.Scanner;

public class GCD {
    static int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y, x % y);
    }

    static int iGCD(int x, int y){
        while (x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(iGCD(x, y));
        System.out.println(gcd(x, y));
    }
}
