import java.util.Scanner;
public class tribona {
    public static void print( int n) {
        int a=0;
        int b=1;
        int c=1;
        int d=a+b+c;
        for( int i=1; i<=n; i++){
            System.out.println(a+ "  ");
            a=b; 
            b=c;
             c=d;
            d=a+b+c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter value");
        while(true){
            int n=  sc.nextInt();
            print(n);
            sc.close();
        }
    }
}
    
        
    
    

