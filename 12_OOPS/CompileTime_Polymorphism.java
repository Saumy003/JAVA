public class CompileTime_Polymorphism {
    
        // Method Overloading

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int ans1 = add(2, 3);
        int ans2 = add(5, 3, 2);
        double ans3 = add(3.7,5.6);

        System.out.println("ans1: " + ans1);
        System.out.println("ans2: " + ans2);
        System.out.println("ans3: " + ans3);
    }
    
}