public class Search {
    // 1, 2, 3, 2, 2, 5
    static void findAllIndices(int[] a, int n, int target, int idx){
        // base case
        if(idx >= n){
            return;
        }
        //self work
        if(a[idx] == target){
            System.out.println(idx);
        }
        //recursive work
        findAllIndices(a, n, target, idx+1); // 1, 3, 4
    }



    // findFirstIndex -> return index of target if target present in array, otherwise return -1
    static int findIndex(int[] a, int n, int target, int idx){
        // base case
        if(idx >= n) return -1;
        //self work
        if(a[idx] == target) return idx;
        //recursive work
        return findIndex(a, n, target, idx+1);
    }

    // true, false -> based on existence
    static boolean search(int[] a, int n, int target, int idx){
        // base case
        if(idx >= n) return false;
        //self work
        if(a[idx] == target) return true;
        //recursive work
        return search(a, n, target, idx+1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;
        int n = a.length;
        findAllIndices(a, n, target, 0);

//        System.out.println(findIndex(a, n, target, 0));

//        if(search(a, a.length, target, 0)){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
    }
}
