import java.util.Scanner;

class Algebra{
    int a;
    int b;
    Algebra(int x, int y){
        System.out.println("Constructor of Algebra class called");
        a = x;
        b = y;
    }
    int add(){
        int ans = a + b;
        return ans;
    }

    int sub(){
        return a - b;
    }

    int mul(){
        return a * b;
    }

}

public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra(5, 7);
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();

        int ans = obj.add();
        System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.mul());

        Algebra obj2 = new Algebra(10, 7);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());

//        System.out.println(Math.sqrt(24));
//        System.out.println(Math.sqrt(16));
//
//        System.out.println(Math.floor(5.3));
//        System.out.println(Math.floor(5.8));
//
//        System.out.println(Math.ceil(5.3));
//        System.out.println(Math.ceil(5.8));
//
//        return;
    }
}