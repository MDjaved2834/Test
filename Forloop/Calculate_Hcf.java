package Forloop;
import java.util.Scanner;
public class Calculate_Hcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int dividend = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int divisor = input.nextInt();
        int rem, hcf = 0;

        for (;;) {
            rem = dividend % divisor;

            if (rem == 0) {
                hcf = divisor;
                break;
            } else {
                dividend = divisor;
                divisor = rem;
            }
        }

        System.out.println("HCF: " + hcf);
    }
}