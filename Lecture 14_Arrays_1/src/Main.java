class ArraysExample{

    void cloneArray2(){
        int ai[] = {1, 2, 3, 4, 5};

        /* copying the reference ai to aic,
         * after following assignment, aic
         * will point to the same array ai points.
         */
        int aic[] = ai;

        aic[2] = -9;

        /* both print statements will print
         * the same result because ai, and aic
         * are the reference of same array, then no matter
         * which reference is being used to update array values.
         */
        System.out.println(aic[2]);
        System.out.println(ai[2]);

        /* Now illustrating clone().
         * In below assignment ai.clone() creates
         * a separate copy of the array in memory
         * and then assigns it to aic. Now, both
         * ai and aic point to two different arrays
         * so changes made to one will not impact the other
         */
        System.out.println("---"); //separator
        aic = ai.clone();
        aic[1] = -15;

        /* both print statements will print
         * the value stored at 1st index in the array
         * they point to.
         */
        System.out.println(aic[1]);
        System.out.println(ai[1]);
    }
    void cloneArray(){
        int a[] =  { 1, 4, 7, 9 };

        int n = a.length;
        int b[] = a.clone();

        b[0] = 5;

        System.out.println("Original array ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println("\nCloned Array ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");

    }
    void searchInArray(){
        //Linear Search7
        int[] arr = {10, 5, 3, 6, 2, 8, 4};
        int x = 3;

        int ans = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
            }
        }
        if(ans == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found " + x + " at index " + ans);
        }
    }

    void maxOfArray(){
        int[] arr = {10, 5, 3, 6, 2, 8, 4}; //ans  = 8

        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }

        System.out.println("Max " + ans);

    }
    void sumOfArray(){
        int[] arr = {1, 4, 5, 6, 1};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }

    void multiArrays(){
        int[][] arr = {{56, 43, 6}, {34, 7}};

        for(int  i = 0; i < arr.length; i++){
            //arr[0] and arr[1]
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
    void demoArrays(){
        int[] ages = new int[3]; // ages[0], ages[1], ages[2]
        float[] weights = new float[3];
        String[] names = {"rahul", "raj", "aradhya", "vaishali"};

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;

        for(int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }

        for(int age : ages){
            System.out.println(age);
        }

        int i = 0;
        while(i < ages.length){
            System.out.println(ages[i]);
            ++i;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
//        obj.demoArrays();
//        obj.multiArrays();
//        obj.sumOfArray();
//        obj.maxOfArray();
//        obj.searchInArray();
//        obj.cloneArray();
        obj.cloneArray2();

    }




}