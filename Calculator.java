public class Calculator {
    static int a = 10;
    static int b = 5;

    public static void add(){
        System.out.println("Addition = " + (a + b));
    }

    public static void multi() {
        System.out.println("Multiplication = " + (a * b));
    }

    public static void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    public static void div() {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args) {
        add();
        multi();
        sub();
        div();
    }

}
