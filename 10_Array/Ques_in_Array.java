public class Ques_in_Array {
    public static void main(String[] args) {
        // search an element in an array

        int arr[] = {1, 4, 2, 55, 7, -2};

        for(int i : arr) {
            if (i == 55) {
                System.out.println("Found");
            }
        }

        // find max element
        int maxi[] = new int[5];
        maxi[0] = 2;
        maxi[1] = 12;
        maxi[2] = 4322;
        maxi[3] = -2;
        maxi[4] = -43372;

        int result = Integer.MIN_VALUE;
        for (int x = 0; x < maxi.length; x++) {
            if( result < maxi[x]) {
                result = maxi[x];
            }
        }
        System.out.println("Maximum Value is -> " + result);

        System.out.println();

        // reverse an array
        int[] numbers = {1, 3, 43, 4 ,435, 53, 5, 6};

        for(int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }

        System.out.println();
        
        // print sum of array
        int marks[] = {45, 67, 25, -98, 97};

        int sum = 0;
        for(int k = 0; k < marks.length; k++) {
            sum = sum + marks[k];
        }
        System.out.println("Sum of array is -> " + sum);

    }
}