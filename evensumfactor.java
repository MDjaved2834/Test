import  java.util.Scanner;
public class evensumfactor {    
 public  static void  print( int n){
    int sum=0;
    for (int  i=1; i<n;i++){
        if (n%i==0  && i%2==0){      
            
            System.out.print(i+ "  ");
            sum=sum+i;
        }
    }
    System.out.println("sum is = "+ sum);
}
    public static void main (String [] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter values");
    int n=sc.nextInt();
        print(n);
    }
}