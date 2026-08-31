public class For_Loop {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++) {
            System.out.println("Value of i is: " + i);
        }

        for(int n = 1; n <= 4; n = n + 1){
            System.out.println("Jai Rajputana");
        }

        // Nested for loop

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}