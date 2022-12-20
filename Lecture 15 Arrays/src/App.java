public class App {

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void changeArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }

    static void changeVal(int a){
        a = 1004;
    }

    public static void main(String[] args) {
        int a = 5;
        changeVal(a);
        System.out.println(a); // 5

        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 7;

        changeArray(arr);
        printArray(arr);

        boolean ans = true;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                ans = false;
            }
        }
        System.out.println(ans);
    }
}
