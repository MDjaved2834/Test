//package Whileloop;

import java.util.Scanner;

public class palindromenumberrange {
    public static  boolean check(int num) 
    {
        int rev= 0;
        int temp =num;
            while(num>0)
            {
                int rem =num%10;
                rev = rev*10+rem;
                num=num/10;
            }
            if(temp==rev){
                return true;
            }
            return false;
    }
    public static  void print(int s,int e){
        for(int i=s; i<=e; i++){
            if(check(i)){
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
            print(s,e);
        }
    }