package Array.Array;

public class reversearray {
    public static class Array1 { 
        public static void printArray(int[] numbers) {
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
        }
    
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7};
            printArray(numbers);
        }
    }
}

