package Forloop;
import java.util.Scanner;
public class checkprimenumber {
    public static void primnumber(int n) {
        for(int i=2; i<n; i++){
            boolean isprime=true;
            for(int j=2; j<=Math.sqrt (i); j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value=");
        int n=sc.nextInt();
        System.out.println("prime number up to"+ n +" are");
        primnumber(n);
        sc.close();
    }
}

        
    

