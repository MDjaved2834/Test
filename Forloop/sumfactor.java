package Forloop;
import java.util.Scanner;

public class sumfactor {
public static void print(long n) {
    long sum=0;
    for(long i=1; i<=n; i++){
        if (n%i==0){
            System.out.println(i +" ");
            sum=sum+i;
        }
    }
    System.out.println("sum is="+ sum);
    
}    
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter value=");
    long n=sc.nextInt();
    print(n);

}
}
