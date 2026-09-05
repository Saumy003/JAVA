public class Non_Void_Func {

    // viod method
    static void PrintMultiply(int a, int b) {
        int ans = a * b;
        System.out.println("Result: " + ans);
    }

    // Non-Void return type
    static int PrintSub(int p, int q) {
        int subtraction = p - q;
        return subtraction;
    }

    public static void main(String[] args) {
        PrintMultiply(5, 10);
        int Sub = PrintSub(42, 27);
        System.out.println("Answer: " + Sub);
    }
}