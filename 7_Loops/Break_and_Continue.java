public class Break_and_Continue {
    
    public static void main(String[] args) {
        
        // break
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }

        // continue
        for(int i = 1; i <= 10; i++) {
            if(i == 1 || i == 2 || i == 3 || i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}