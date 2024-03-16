package Array.Array;

public class Array3 {
    public class Array1 {
        public static void printArray(int[] numbers) {
            for (int i = 0; i < numbers.length/2; i++) {
                System.out.print(numbers[i] + " ");
            }
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6,4 };
            printArray(numbers);
        }
    }
}
