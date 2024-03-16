package Forloop;
import java.util.Scanner;
public class primen {
    public static void main (String []args){
        //int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int n= sc.nextInt();
        int c=0;
        for( int i=1; i<=n; i++){
            System.out.println(i+" ");
            if(n%i==0){
                c++;            
            }
        }
            System.out.println(c);
            if (c==2){
                System.out.println("prime number");
            }
            else {
                System.out.println(" not prime number");
            }
        }
    }

    
         
             
        
    

