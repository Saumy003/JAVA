public class Method_Parameters {
    
    // without Parameters

    static void Print_Sum() {
        int a = 2;
        int b = 4;
        System.out.println(a + b);
    }

    // with parameter

    static void PrintSum(int x, int y) {
        System.out.println("Sum:" + (x + y));
    }

    // method call
    public static void main(String[] args) {
        Print_Sum();
        PrintSum(3, 2);
    }
}