import java.util.Arrays;
import java.util.Scanner;

public class Questions {
    static int[] smallestAndLargestElement(int[] arr){ //1, 2, 3, 4, 5
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }

    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    static int countOccurrences(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    static int a;

    public static void main(String[] args) {
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Enter x");
//        int x = sc.nextInt();

//      System.out.println("COUNT OF X: " + countOccurrences(arr, x));
//        System.out.println("LAST OCCURRENCE OF X: " + lastOccurrence(arr, x));
//        System.out.println("Is Sorted: " + isSorted(arr));
        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest: " + ans[0]);
        System.out.println("Largest: " + ans[1]);
    }
}
