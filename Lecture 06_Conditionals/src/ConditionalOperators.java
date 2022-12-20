import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value % 5 == 0 || value % 3 == 0){
            System.out.println("Found ans - " + value);
        }
    }
}
