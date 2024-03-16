import java.util.Scanner;
public class sumofdigit {
    //public static void print(int n){
        
    public static void main(String[] args) {
        int n;
        int r;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one integer");
         n=sc.nextInt();
        while(n>0){
           r= n%10;
            sum=sum+r;
            n=n/10;
        }
            System.out.println(sum);
        }
        
        //print(n);
        
    }



