package Forloop.whileloop;
import java.util.Scanner;
public class spynumber {
    public static boolean checkspynumber(int n){
        int sum=0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
            prod=prod*rem;
        }
        System.out.println(" \nsum: "+sum);
        System.out.println("\nprod: "+prod);
        if(sum==prod){
        return true;
        }
        return false;
    }
        public static void main(String[] args){
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter  the number");
            int n = sc.nextInt();
            System.out.println(checkspynumber(n));
        }
    }

