public class Main {
    static int findSquareRoot(int x) {
        int st = 0, end = x, ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid; // you can use long to avoid overflow error
            if (val == x)
                return mid;
            else if (val < x) {
                ans = mid;
                st = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }
    static int firstOcc(int[] a, int val){
        int st = 0, end = a.length-1;
        int fo = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(val == a[mid]){
                fo = mid;
                end = mid-1;
            } else if(val < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return fo;
    }
    static boolean recBinarySearch(int[] a, int st, int end, int val) {
        if (st > end) return false;
        int mid = (st + end) / 2; // find middle element of the array
        if (a[mid] == val)
            return true; // value found
        else if (val < a[mid])
            return recBinarySearch(a, st, mid - 1, val);
        else
            return recBinarySearch(a, mid + 1, end, val);
    }

    static boolean binarySearch(int[] a, int val) {
        int n = a.length;
        int st = 0, end = n - 1; // 0 based indexing
        while (st <= end) {
            int mid = (st + end) / 2; // find middle element of the array
            if (a[mid] == val)
                return true; // value found
            else if (val < a[mid])
                end = mid - 1;
            else
                st = mid + 1;
        }
        return false; // value not found in the array
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int val = 16;
        while(val != 30){
            System.out.printf("sqrt of %d is %d\n", val, findSquareRoot(val));
            int fo = firstOcc(a, val);
//            System.out.printf("First occurrence of %d is %d\n", val, fo);
//            System.out.println(binarySearch(a, val));
//            System.out.println(recBinarySearch(a, 0, a.length-1, val));
            val++;
        }
    }
}