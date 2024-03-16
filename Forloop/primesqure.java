package Forloop;

public class primesqure {
    public class PrimeSquareSeries {
        public static void main(String[] args) {
            int count = 0;
            for (int i = 2; count < 5; i++) {
                if (isPrime(i)) {
                    int square = i * i;
                    System.out.print(square + ", ");
                    count++;
                }
            }
        }
    
        // Function to check if a number is prime
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}    