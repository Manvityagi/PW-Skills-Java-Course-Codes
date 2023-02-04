public class RadixSort {
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i < arr.length; i++){ // Make frequency array
            count[(arr[i]/place)%10]++;
        }
        // Make prefix sum array of count array
        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }
        for(int i = n-1; i >= 0; i--){
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        // copy all elements of output to arr
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr){
        int max = findMax(arr); // get maximum element
        // apply counting sort to sort elements based on place value
        for(int place = 1; max/place > 0; place *= 10){
            countSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {43, 453, 626, 894, 0, 3};
        radixSort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
