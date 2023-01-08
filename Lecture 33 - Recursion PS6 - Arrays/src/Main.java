import java.util.ArrayList;
public class Main {
    static void allIndices2(int[] a, int n, int x, int idx){
        if(idx >= n) return;
        if(a[idx] == x) System.out.println(idx);
        allIndices2(a, n, x, idx+1);
    }
    static ArrayList<Integer> allIndices(int[] a, int n, int x, int idx){
        if(idx >= n){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(a[idx] == x){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(a, n, x, idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    static int firstIndex(int[] a, int n, int target, int idx){
        if(idx == n) return -1;
        if(a[idx] == target) return idx;
        return firstIndex(a, n, target, idx+1);
    }
    static int lastIndex(int[] a, int n, int target, int idx){
        if(idx == -1) return -1;
        if(a[idx] == target) return idx;
        return lastIndex(a, n, target, idx-1);
    }
    static boolean search(int[] a, int n, int target, int idx){
        if(idx >= n) return false;
        if(a[idx] == target) return true;
        return search(a, n, target, idx+1);
    }

    public static void main(String[] args) {
        int[] a = {};
        int target = 4;
        int n = a.length;
        System.out.println(firstIndex(a, n, target, 0));
        System.out.println(lastIndex(a, n, target, n-1));
        allIndices2(a, n, target, 0);
        ArrayList<Integer> ans = allIndices(a, n, target, 0);
        for(Integer i : ans){
            System.out.print(i + ",");
        }
    }
}