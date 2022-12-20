import java.util.Scanner;

public class RotateArray {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j){
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }

        for(int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original array");
        printArray(arr);
        rotateInPlace(arr, k);
//        int[] ans = rotate(arr, k);
        System.out.println("Array after rotation");
        printArray(arr);

    }
}
