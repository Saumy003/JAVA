public class CreatingMethod {

    static void Print2Table () {
        System.out.println("Chikuu");
        for (int i = 1; i <= 10; i++) {
            int ans = 2*i;
            System.out.println("->" + ans);
        }
    }

    public static void main(String[] args) {
        System.out.println("hii");
        Print2Table();                          // method call
        System.out.println("bye");
    }
    
}