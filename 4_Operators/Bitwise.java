public class Bitwise {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 6;

        System.out.println(a & b);                // bitwise AND
        System.out.println(a | b);               // bitwise OR
        System.out.println(a ^ b);              // bitwise XOR
        System.out.println(~a);                // bitwise not
        System.out.println(a << 1);           // bitwise left shift
        System.out.println(a >> 1);          // bitwise right shift
    }
}
