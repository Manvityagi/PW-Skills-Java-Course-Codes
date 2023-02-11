public class BinarySearch {
    static boolean binarySearch(int[] a, int target){
        int n = a.length;
        int st = 0, end = n-1; // 0 based indexing
        while(st <= end){
            int mid = (st + end)/2;
            if(target == a[mid]){
                return true;
            } else if(target < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return false;
    }
    static boolean recBinarySearch(int[] a, int st, int end, int target){
        if(st > end) return false; // base case
        int mid = (st + end)/2;
        if(target == a[mid]){
            return true;
        } else if (target < a[mid]){
            return recBinarySearch(a, st, mid-1, target); // subproblems
        } else {
            return recBinarySearch(a, mid+1, end, target); // subproblems
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int target = 0;
        while(target != 10) {
            System.out.printf("%d exists in arr: %b \n", target, recBinarySearch(a, 0, a.length-1, target));
            System.out.printf("%d exists in arr: %b \n", target, binarySearch(a, target));
            System.out.println();
            target++;
        }
    }
}
