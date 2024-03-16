package Forloop;

import java.util.Scanner;

public class calculate_sum_of_number {
//     public static void main(String[] args) {
//         int sum=0;
//         for(int i=1; i<=10; i++){
//             System.out.print(i+" ");
//             sum=sum+i;
           
//         }
//         System.out.println("sum <="+ sum);
//     }
// }
 public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}
