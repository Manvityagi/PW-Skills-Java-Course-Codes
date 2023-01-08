import java.util.Scanner;

public class SeriesSum {
    // main question - alternate sums
    static int seriesSum(int n){
        if(n == 0) return 0;
        if(n % 2 == 0) {  // even
            return seriesSum(n - 1) - n;
        } else { // odd
            return seriesSum(n - 1) + n;
        }
    }
    static int seriesSum1(int n){
        if(n == 0){
            return 0;
        }
        return seriesSum1(n-1) + n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
    }
}
