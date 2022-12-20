class Algebra{
//    int a = 10; //member variables
//    int b = 5;

    int add(){
        int p = 100;
        int q = 20;
        return p + q;
    }

    int sub(){
        int p = 67;
        int q = 20;
        return p - q;
    }

    void demo(){

        {
            int b = 5;
        }

        {
            int b = 100;
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println(i);
        }

        for(int i = 0; i < 2; i++)
        {
            System.out.println(i);
        }


    }
}

public class Main {

    static void changeValue(int a){
        a *= 100;

        System.out.println("Inside change value " + a);
    }

    public static void main(String[] args) {
//        Algebra obj = new Algebra();
//        obj.demo();

        int a = 10;
        System.out.println("Before changing value " + a);
        changeValue(a);
        System.out.println("After changing value " + a);
    }
}
