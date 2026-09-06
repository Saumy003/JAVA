public class Call_By_Value {

    // call by value

    static void change(int a) {
        a = a * 10;
        System.out.println("Inside Change a is: " + a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before: " + a);

        change(a);

        System.out.println("After: " + a);
    }
}