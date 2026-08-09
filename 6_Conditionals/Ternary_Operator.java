public class Ternary_Operator {
    
    public static void main(String[] args) {
        
        // Example 1
        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);

        // Example 2

        int streakDays = 35;

        String status = (streakDays >= 30) ? "Consistent" : "Irregular";
        System.out.println(status);
    }
}