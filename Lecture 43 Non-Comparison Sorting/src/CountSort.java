public class CountSort {
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void basicCountSort(int[] arr){
        int max = findMax(arr); // Find the largest element of the arr
        int[] count = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                arr[k++] = i;
            }
        }
    }
    static void display(int[] a){
        for(int val : a){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr); // Find the largest element of the arr
        int[] count = new int[max+1];
        for(int i = 0; i < arr.length; i++){ // Make frequency array -> TC -> n
            count[arr[i]]++;
        }
        // Make prefix sum array of count array
        for(int i = 1; i < count.length; i++){ // TC -> max
            count[i] += count[i-1];
        }
        // Find the index of each element in the original array and put it in output  array
        for(int i = n-1; i >= 0; i--){ // TC -> n
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all elements of output to arr
        for(int i = 0; i < n; i++){ // TC -> n
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};
        countSort(arr);
//        basicCountSort(arr);
        display(arr);
    }
}
