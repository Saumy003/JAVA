public class Try_and_Catch {
    
    public static void main(String[] args) {
        int numerators[] = {10, 200, 30, 40};
        int denominators[] = {1, 2, 0, 4};
        for (int i = 0; i < numerators.length; i++) {
            System.out.println(divide(numerators[i] , denominators[i]));
        }
        System.out.println("Good Job :)");

        // Ex :- 2
        try {
            level1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int divide(int a , int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        } catch (Exception e ) {
            System.out.println(e);
            return -1;
        }
    }

    // Another Ex:- 2
    public static void level1(){
        level2();
    }

    public static void level2(){
        level3();
    }

    public static void level3(){
        int[] arr = new int[5];
        arr[5] = 10;
    }
}