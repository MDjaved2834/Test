package Array.Array;
import java.util.Scanner;
public class shift_array {
   
        public static int[] rotate(int[] num, int positions, boolean rotateRight) {
            printarray(num);
            if (rotateRight) {
                for (int j = 0; j < positions; j++) {
                    int last = num[num.length - 1];
                    for (int i = num.length - 1; i > 0; i--) {
                        num[i] = num[i - 1];
                    }
                    num[0] = last;
                }
            } else {
                for (int j = 0; j < positions; j++) {
                    int first = num[0];
                    for (int i = 0; i < num.length - 1; i++) {
                        num[i] = num[i + 1];
                    }
                    num[num.length - 1] = first;
                }
            }
            printarray(num);
            return num;
        }
    
        public static void printarray(int[] n) {
            for (int i = 0; i < n.length; i++) {
                System.out.print(n[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size");
            int n = sc.nextInt();
            int[] num = new int[n];
            System.out.println("Enter integer elements: ");
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            System.out.print("Enter number of positions to rotate: ");
            int positions = sc.nextInt();
            System.out.print("Enter direction (0 for left, 1 for right): ");
            int direction = sc.nextInt();
            boolean rotateRight = (direction == 1);
            rotate(num, positions, rotateRight);
        }
    }
     

