public class findMin{
    static int findMinimum(int[] a){
        int n = a.length;
        int st = 0, end = n-1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] <= a[n-1]){
                ans = mid;
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 1, 2};
        System.out.println(findMinimum(a));
    }
}
