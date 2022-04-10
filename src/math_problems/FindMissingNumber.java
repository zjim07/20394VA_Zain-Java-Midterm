package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {

        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6}; // expected result is 9
        System.out.println("Missing number is: " + findMissingNumber(array));

    }

    public static int findMissingNumber(int[] array) {

        int n = array.length + 1;
        int sum = (n * (n + 1)) / 2;

        for(int i = 0; i < array.length; i++) {
            sum = sum - array[i];
        }

        return sum;

    }
}