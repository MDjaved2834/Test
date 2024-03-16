import java.util.Scanner;

public class Test2 {
    
    // Method to calculate sum of elements of an arry except ....
    static int sumAarray(int[] arr, int arrSize) {

        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) {
                i = i+2;
            }
            sum += arr[i];
        }
        
    }
}
