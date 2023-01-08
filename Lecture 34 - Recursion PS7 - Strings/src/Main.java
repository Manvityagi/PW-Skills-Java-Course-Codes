import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // college
        System.out.println(s.substring(7)); // 1, 2, 3, 4, 5...n-1
    }
}