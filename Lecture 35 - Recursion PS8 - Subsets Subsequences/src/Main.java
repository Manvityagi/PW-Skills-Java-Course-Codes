import java.util.ArrayList;

public class Main {
    static void printSSQ(String s, String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char currChar = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns + currChar); // Add curr char
        printSSQ(remString, currAns); // Do not add curr char
    }
    static void sumSubset(int[] a , int n , int idx , int sum){
        if(idx >= n){
            System.out.println(sum);
            return;
        }
        sumSubset(a, n, idx + 1, sum);
        sumSubset(a, n, idx + 1, sum + a[idx]);
    }
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }



    public static void main(String[] args) {
        int[] a = {2, 4, 5};
        sumSubset(a, a.length, 0, 0);
    }
}