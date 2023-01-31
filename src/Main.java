public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sayHello();
        sayHelloTo("Chicken");
    }

//    public static int[] addAndMultiply(int a, int b) {
//        int sum = a + b;
//        int product = a * b;
//    }
    public static void sayHelloTo(String name) {
        System.out.println("Hello" + name);
    }

    public static void sayHello() {
        System.out.println("Hello.");
    }
}