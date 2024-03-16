package Array.Array;

public class Firsthalf {
    
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12};
            printFirstHalf(numbers);
        }
    
        public static void printFirstHalf(int[] arr) {
            int halfLength = arr.length/ 2;
            for (int i = 0; i < halfLength; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(); 
        }
    }
    

