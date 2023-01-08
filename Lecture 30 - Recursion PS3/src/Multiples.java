import java.util.Scanner;

public class Multiples {
    static void printMultiples(int n, int k){ // 5, 4
        //base case
        if(k == 0){
            return;
        }
        //recursive work
        printMultiples(n, k-1); // 5, 10, 15
        //self work
        System.out.println(n * k); // 20
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printMultiples(n, k);
    }
}
