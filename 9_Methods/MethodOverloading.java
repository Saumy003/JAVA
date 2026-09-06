public class MethodOverloading {

    // Method Overloading

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int ans1 = add(2, 3);
        int ans2 = add(5, 3, 2);
        System.out.println("ans1: " + ans1);
        System.out.println("ans2: " + ans2);
    }
}