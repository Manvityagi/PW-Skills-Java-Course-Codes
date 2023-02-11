public class Main {
    static void displayArr(int[] num){
        for(int val : num){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void sort012_(int[] num){
        int count_0 = 0, count_1 = 0, count_2 = 0;
        for (int j : num) {
            if (j == 0) {
                count_0++;
            } else if (j == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }
        int k = 0;
        while(count_0 > 0){
            num[k++] = 0;
            count_0--;
        }
        while(count_1 > 0){
            num[k++] = 1;
            count_1--;
        }
        while(count_2 > 0){
            num[k++] = 2;
            count_2--;
        }
    }
    public static void main(String[] args) {
        int[] num2_ = {2, 2, 1, 2, 2, 0, 1, 0, 2, 0};
        sort012_(num2_);
        displayArr(num2_);
    }
}