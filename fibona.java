
import java.util.Scanner;
public class fibona {
     public static void print( int n) {
        int a=1;
        int b=1;
        int c=a+b;
        for(int i=0; i<=n ; i++){
            System.out.println(a +" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        while(true){
            int n=sc.nextInt();
            print(n);
            sc.close();
        }
    }
}
    
    
     
    