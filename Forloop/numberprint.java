package Forloop;
import java.util.Scanner;

public class numberprint {
    
    public static void print(int n) {
        int x = 1;
        System.out.print(x + " , "); 
        for (int i = 1; i <= n; i++) {
            int c = (13 * i) + x;
            System.out.print(c); 
            if (i < n) {
            }
            x = c; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        print(n);
    }
}
