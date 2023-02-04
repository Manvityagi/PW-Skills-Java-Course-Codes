import java.util.*;

public class Main {
    public static void bbucketSort(float[] arr) {
        //Let's create 10 buckets
        ArrayList<ArrayList<Float>> buckets = new ArrayList<>();
        // Initialize each bucket
        for (int i = 0; i < 10; i++) {
            buckets.add(new ArrayList<>());
        }
        // Dividing arr into buckets
        for (int i = 0; i < arr.length; i++) {
            int index;
            if (arr[i] >= 1) {
                index = ((int) arr[i]) % 10;
            } else {
                index = (int) (arr[i] * 10);
            }
            buckets.get(index).add(arr[i]);
        }
        // Sorting each bucket
        for (int i = 0; i < 10; i++) {
            Collections.sort(buckets.get(i));
        }
        // Merging buckets together
        int index = 0;
        for (int bucket = 0; bucket < 10; bucket++) {
            ArrayList<Float> currBucket = buckets.get(bucket);
            for (int i = 0; i < currBucket.size(); i++) {
                arr[index++] = currBucket.get(i);
            }
        }
    }
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < n; i++) { // Store the count of each element
            count[(arr[i] / place) % 10]++;
        }
        for (int i = 1; i < count.length; i++) { // prefix sum
            count[i] += count[i - 1];
        }
        // Find the index of each element of the original arr in count arr, and place the elements in output arr
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void display(float[] arr) {
        for (float val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void radixSort(int arr[]) {
        // Get maximum element
        int max = findMax(arr);
        // Apply counting sort to sort elements based on place value.
        for (int place = 1; max / place > 0; place *= 10)
            countSort(arr, place);
    }
    static void bucketSort(float[] arr) {
        int n = arr.length;
        ArrayList<Float>[] bucket = new ArrayList[n];
        // Create empty buckets
        for (int i = 0; i < n; i++)
            bucket[i] = new ArrayList<Float>();
        // Add elements into the buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }
        // Sort the elements of each bucket
        for (int i = 0; i < bucket.length; i++) {
            Collections.sort((bucket[i]));
        }
        // Merge all buckets to get sorted array
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            ArrayList<Float> currBucket = bucket[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {0, 1236, 41, 19, 242, 0, 6, 5, 232};
//        countSort(arr);
//        radixSort(arr);
//        display(arr);
    //    float[] a1 = {5, 4, 3, 2, 1};
        float[] a2 = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        //bucketSort(a1);
        bucketSort(a2);
       // display(a1);
        display(a2);
    }
}