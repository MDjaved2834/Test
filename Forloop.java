import java.util.Scanner;
public class Forloop {
    public static void prit(int n){
        int a=0;
        int b=1;
        int c=a+b;
        for (int i=1;i<=n;i++){
            System.out.println(a+"  ");
            a=b;
            b=c;
            c=a+b;
        }
     }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value");
        int n =sc.nextInt();
        prit(n);
    }
}
