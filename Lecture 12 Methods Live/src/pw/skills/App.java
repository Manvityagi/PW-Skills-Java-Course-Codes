package pw.skills;

public class App {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    void printFromApp(){
        System.out.println("Printing within class");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.printFromApp();
        A obj2 = new A();
        obj2.printFromA();
    }
}

class A{
    void printFromA(){
        System.out.println("Printing from same package but different class");
        App obj = new App();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
//        System.out.println(obj.d);
    }
}