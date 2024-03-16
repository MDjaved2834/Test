
import java.util.Scanner;
public class LcmHcf {
    
    static int print(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int printl(int a, int b) {
        return (a * b) / print(a, b);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
         int b = sc.nextInt();
        int hcf = print(a,b);
        int lcm = printl(a, b);
        System.out.println("lcm="+lcm);
        System.out.println("hcf="+hcf);
    }
}



