
import java.util.Scanner;

public class checkcountnumber {

    public static boolean check(int n) {
        int c = 0;
        int t = n;
        
        // Count the number of digits in n
        while (t > 0) {
            c++;
            t = t / 10;
        }
        
        // Rotate the digits and check for primality
        for (int i = 1; i <= c; i++) {
            System.out.println(n);
            if (checkPrime(n)) 
            {
                
            int first = n / 10;
            int last = n % 10;
            n = last * pow(10, c - 1) + first;

        }
        else {
            return false;
        }
    }
       
        return true;
    }


    public static int pow(int b, int p) {
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * b;
        }
        return res;
    }

    public static boolean checkPrime(int num) {
        if (num < 1) {
            return false;
        } else if (num == 2 || num == 3) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter one integer:");
            int n = sc.nextInt();
            System.out.println(check(n));
        }
    }
}


