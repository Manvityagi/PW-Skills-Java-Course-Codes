import java.util.Scanner;

public class SumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        for(; num >= 1;){ // num -= 2, num = num - 2
            System.out.println(num);
            num -= 2;
        }
    }
}
