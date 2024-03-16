package Forloop.whileloop;
import java.util.Scanner;
public class printevendigit {
    public static void printevendigit(int n){
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
            System.out.print(rem+" ");
            }
            n=n/10;
        }
    }
        public static void main(String[] args){
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter  the number");
            int n = sc.nextInt();
            printevendigit(n);
        }
    }
