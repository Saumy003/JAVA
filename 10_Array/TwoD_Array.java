public class TwoD_Array {
    public static void main(String[] args) {
        // Creating a 2D_Array ->

        char[][] arr = new char[3][2];

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8 ,9}
        };

        // Assigning values to 2D_array ->
        arr[0][0] = 'a';
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'd';
        arr[2][0] = 'e';
        arr[2][1] = 'f';

        // Printing array
        System.out.println(matrix[1][2]);
        System.out.println(arr[0][1]);

        // Traverse 2D_Array ->
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int p = 0; p < arr.length; p++) {
            for(int q = 0; q < arr[p].length; q++) {
                System.out.print(arr[p][q] + " ");
            }
            System.out.println();
        }

    }
}