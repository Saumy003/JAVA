public class While {
    public static void main(String[] args) {
        
        int i = 1;

        while(i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        // nested while loop

        int j = 1;
        while(j <= 2){
            int k = 1;

            while(k <= 3){
                System.out.println("j=" + j + ", k=" + k);
                k++;
            }

            j++;
        }

    }
}