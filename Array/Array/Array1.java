package Array.Array;

public class Array1 {
    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.println(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        printArray(numbers);
    }
}
