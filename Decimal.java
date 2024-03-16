 import java.util.Scanner;
 public class Decimal {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("inter a decimal number=");
        int decimalNumber = sc.nextInt();

       // int decimalNumber =45;

        String binary = Integer.toBinaryString(decimalNumber);
        
        System.out.println("Decimal Number: " + decimalNumber);

        System.out.println("Binary Equivalent: " + binary);
    }

}
