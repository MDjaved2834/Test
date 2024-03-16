import  java.util.Scanner;
public class evenofactor {    
 public static void  print(int n){
    for (int i=1; i<n; i++){
       
        if(n%i==0 && i%2==0){
            System.out.println(i++);
        }
     }
}
public static void main (String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter values");
    int n= sc.nextInt();
    print(n);
}

}