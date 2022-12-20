package pw.skills;

public class App {
    private String str_1 = "I am a private member";
    void printFromClass(){
        System.out.println("Within class: " + str_1);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.printFromClass();
        System.out.println("Within class: " + obj.str_1);
        App2 obj2 = new App2();
        obj2.printFromOutsideClass();
    }
}

class App2{
    void printFromOutsideClass(){
        App obj = new App();
//        System.out.println("Within package, outside class: " + obj.str_1);
    }
}