public class Main {
    void f1(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    void f2(int[] arr1, int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        for(int i = 0; i < n; i++){
            System.out.println(arr1[i]);
        }

        for(int i = 0; i < m; i++){
            System.out.println(arr2[i]);
        }
    }

    void f3(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Hello");
            }
        }
    }

    void f4(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.println("Hello");
            }
        }
    }

    void f5(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < Math.sqrt(n); j++){
                System.out.println("Hello");
            }
        }
    }
    public static void main(String[] args) {
    }
}