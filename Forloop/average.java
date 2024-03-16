package Forloop;
import java.util.Scanner;
public class average {
public static void main(String[] args) {
   // int a,b,c,d,e;
    System.out.println(":Enter marks of five subject");
    Scanner sc =new Scanner (System.in);
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();
    int d =sc.nextInt();
    int e =sc.nextInt();
    int sum=a+b+c+d+e;
    System.out.println("Total marks="+ sum);
    double avg=sum/5.0;
    System.out.println("Average marks="+ avg);

}
}

    


