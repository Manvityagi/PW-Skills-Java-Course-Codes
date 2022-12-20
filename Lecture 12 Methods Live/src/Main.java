import pw.skills.*;

public class Main {
    public static void main(String[] args) {
        App obj = new App();
        System.out.println(obj.a);
//        System.out.println(obj.b);
//        System.out.println(obj.c);
//        System.out.println(obj.d);
    }
}

//app2 -> child class, app -> parent class
class App2 extends App{
    void printFromApp2(){
        App2 obj = new App2();
        System.out.println(obj.a); //public
        System.out.println(obj.b); //protected
//        System.out.println(obj.c);
//        System.out.println(obj.d);

    }
}