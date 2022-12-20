import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiDimensionalArray {

    static void printArray(int[][] arr){

        for(int i = 0; i < arr.length; i++){ //row
//            System.out.println(arr[i]);
            for(int j = 0; j < arr[i].length; j++){ //column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();

        int[][] arr = new int[r][c]; // total = r*c

        System.out.println("Enter " + r*c + " elements");
        for(int i = 0; i < r; i++) { // row
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr);


//        int[][] arr2 = {
//                        {1, 5, 6},
//                        {7, 9 , 11},
//                        {8, 1, 1}
//                       };

//        printArray(arr2);

    }
}
