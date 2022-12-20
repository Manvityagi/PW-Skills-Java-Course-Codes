import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        if(num % 2 == 0){
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }

        String ans;
        ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);

    }
}
