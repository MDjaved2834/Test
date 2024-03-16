import java.util.Scanner;
public class profit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter cost price");
         int cp = sc.nextInt();
         System.out.println("Enter selling price: ");
         int sp =sc.nextInt();
         
         if (sp>cp){
            System.out.println(" profit: ");
            int profit = sp-cp;
            System.out.println(profit);
         }
         else{
            System.out.println("loss: ");
           System.out.println(cp-sp);
         }


    }
    
}
