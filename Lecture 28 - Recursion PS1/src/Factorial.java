public class Factorial {

    static int factorial(int n){ // n = 5
        //base case
        if(n == 0) return 1;
        //smaller problem - recursive work
        // big problem - self work
        return  n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
