import java.util.Scanner;

public class Rotate {

    static void rotateByK(){

    }
    static void rotateByK(int[] arr, int k){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotation steps k");
        int k = sc.nextInt();

        rotateByK(arr, k);
    }
}
