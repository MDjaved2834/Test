package Forloop;
import java.util.Scanner;
public class Clculate_all_table {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter any positive integer=");
        num=sc.nextInt();
        System.out.println("multipication Table of"+ num);
        for(int i=1; i<=10; i++){
            
            System.out.print(num +" x " + i + " = " + (num*i) );
        }
        for(int i=1; i<=20; i++){
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}
    
    


