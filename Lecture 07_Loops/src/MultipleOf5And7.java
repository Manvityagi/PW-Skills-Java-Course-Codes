public class MultipleOf5And7 {
    public static void main(String[] args) {

        int num = 1;

        while(true){
            if((num % 5 == 0) && (num % 7 == 0)){
                System.out.println("Found ans " + num);
                break;
            }
            num++;
        }
    }
}
