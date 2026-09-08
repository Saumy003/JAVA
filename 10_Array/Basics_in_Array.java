public class Basics_in_Array {
    public static void main(String[] args) {
        
        // Example of an Array ->
        int[] array = {1, 2, 3, 4};
        System.out.println(array[2]);

        // Creating an Array ->
        int[] marks = new int[5];
        System.out.println(marks[2]);

        // Assigning values to an array ->
        marks[0] = 94;
        marks[1] = 93;
        marks[2] = 84;
        marks[3] = 91;
        marks[4] = 88;

        // Traversing an array .using Index ->
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();

        // Traversing using direct elemrnt of Array ->
        for ( int x : marks) {
            System.out.print(x + " ");
        }

    }
}