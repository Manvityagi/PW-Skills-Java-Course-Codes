public class SortArr {
    static void display(int[] num){
        for(int val : num){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void sortArr(int[] num){
        int n = num.length;
        int x = -1, y = -1;
        if(n <= 1){ // corner case, edge case
            return;
        }
        //process all adjacent elements
        for(int i = 1; i < n; i++){
            if(num[i-1] > num[i]){
                if(x == -1){ // first conflict
                    x = i-1;
                    y = i;
                } else { // 2nd conflict
                    y = i;
                }
            }
        }
        // swap x, y in num
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }

    public static void main(String[] args) {
        int[] num = {3};
        sortArr(num);
        display(num);
    }
}
