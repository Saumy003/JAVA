public class Nested_If_Else {
    
    public static void main(String[] args) {
        
        // Example 1

        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {
        
            if (hasLicense) {
                System.out.println("You can drive.");
            }
        }

        // Example 2

        int score = 220;
        boolean hasSubcription = false;

        if (score >= 200) {
            if (hasSubcription) {
                System.out.println("Batch 12A");
            } 
            else {
                System.out.println("Batch 12D");
            }
        }

        else {
            System.out.println("Disqualified");
        }
    }
}