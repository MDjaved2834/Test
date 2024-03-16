package Forloop.whileloop;
import java.util.Scanner;
public class printdigits {
    public static void print(int n){
        while(n>0){
            int rem=n%10;
            System.out.print(rem+" ");
            n=n/10;
        }
    }
        public static void main(String[] args){
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter  the number");
            int n = sc.nextInt();
            print(n);
        }
    }
    

