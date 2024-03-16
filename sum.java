 import java.util.Scanner;
 
 public class sum {

    public static void main (String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter First nmber=");
         int num_1 = sc.nextInt();

         System.out.print("Enter second number=");
         int num_2 =sc.nextInt();

         int sum =num_1+num_2;
          System.out.println("sum="+sum);
    }

    
}
