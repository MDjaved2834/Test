package Array.Array;

public class Secondhalf {

    
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            printSecondHalf(numbers);
        }
    
        public static void printSecondHalf(int[] arr) {
            int length = arr.length;
            int start = length / 2;
            for (int i = start; i < length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
    

