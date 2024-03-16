package Array.Array;

// public class cpoyarray {
//     public static class Array1 { 
//         public static void printArray(int[] numbers) {
//             for (int i = numbers.length - 1; i >= 0; i--) {
//                 System.out.print(numbers[i] + " ");
//             }
//             for (int  number : numbers) {
//                 System.out.println(number+" ");
//             }
            
//         }

//         public static void main(String[] args) {
//             int[] numbers = {1, 2, 3, 4, 5, 6, 7};
//             int [] number ={9,8,7,6,5,4,3};
//             printArray(numbers);
//         }
//     }
// }

public class cpoyarray {
    public static int[] copy(int[] ori) {
        int[] copiedarray = new int[ori.length];
        
        for (int i = 0; i < ori.length; i++) {
            copiedarray[i] = ori[i];
        }
        
        return copiedarray;
    }
    public static void main(String[] args) {
        int[] ori = {1, 2, 3, 4, 5};
        int[] copiedArray = copy(ori);
        
        System.out.println("Original Array:");
        for (int num : ori) {
            System.out.print(num + " ");
        }
        System.out.println("\nCopied Array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}
