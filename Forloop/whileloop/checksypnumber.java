package Forloop.whileloop;

import java.util.Scanner;

public class checksypnumber {
    public static boolean checkspynumber(int n){
        int sum=0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
            prod=prod*rem;
        }
        // System.out.println(" \nsum: "+sum);
        // System.out.println("\nprod: "+prod);
        if(sum==prod){
        return true;
        }
        return false;
    }
    public static  void printspy(int s,int e){
        for(int i=s; i<=e; i++){
            if(checkspynumber(i)){
                System.out.print(i+" ");
            }
        }
    }
        public static void main(String[] args){
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter  Starting number");
            int s = sc.nextInt();
            System.out.println("Enter ending number");
            int e=sc.nextInt();
            printspy(s,e);
        }
    }

    



