import java.util.Scanner;

public class PalindromeNumber {
    
    // Method to check the number is palindrome or not
     static boolean  check (int num){
           int temp=num;
           int rev =0;
           while (temp>0){
            int rem =temp%10;
            rev=(rev*10)+ rem;
            temp=temp/10;
           }
           if(rev==num){
            return true;
           }
           return false;
    }
    public static void main (String [] args){
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter value");
        int num= sc.nextInt ();
        if(check(num)){
            System.out.println(num  +"palindrome number ");
        }
        else {
            System.out.println(num +" not a palindrome number");
        }
        sc.close();

    }
}
// static  boolean check(int num) 
//     {
//         int temp =num;
//         int rev= 0;
//             while(temp>0)
//             {
//                 int rem =temp%10;
//                 rev = (rev*10)+rem;
//                 temp=temp/10;
//             }
//             if(rev==num) {
//                 return true;
//             }  
//             return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter any number: ");
//         int num = sc.nextInt();

//         if(check(num)) {
//             System.out.println(num + " is a palindrome number");
//         }
//         else {
//             System.out.println(num + " is not a palindrome number");
//         }

//         sc.close();
//     }
// }

