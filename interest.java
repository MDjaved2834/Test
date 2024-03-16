 import java.util.Scanner;
 public class interest {
    public static void main(String[] args) {
        
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter principle");
        float p = sc.nextFloat();

        System.out.println("enter Rate of interst");
        float i =sc.nextFloat();

        System.out.println("Enter time");
        float t =sc.nextFloat();

        float si =(p*i*t)/100;
        System.out.println("principle="+p);
        System.out.println("Rate="+ i);
        System.out.println("Time="+t);
        System.out.println("simple interst="+ si);
    }
    
}
