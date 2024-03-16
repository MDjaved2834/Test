package Forloop;
import java.util.Scanner;
 
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Even numbers:=");
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
            