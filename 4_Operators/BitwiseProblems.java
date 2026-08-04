public class BitwiseProblems {

    public static void main(String[] args) {
        
        // check even & odd
        int a = 5;

        if ((a & 1) == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        // check power of two
        int n = 512;
        if ((n & n-1) == 0) {
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }

    }
}