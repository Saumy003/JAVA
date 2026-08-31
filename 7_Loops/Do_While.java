public class Do_While {
    public static void main(String[] args) {
        
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while(i <= 5);

        // A do-while loop executes its body at least once, even if the condition is initially false.

        int j = 10;

        do {
            System.out.println(j);
        } while(j <= 5);
    }
}