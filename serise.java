import java.util.Scanner;

public class serise {
    public static void print(int n) {
        int a=1;
        int b=10;
        for(int i=1; i<=n ; i++){
            if(i%2 !=0){
               System.out.println(a+" "); 
               a=a*2;
            }
            else{
                System.out.println(b+" ");
                b=b*2;
            }
        }
    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter value");
        while(true){
        int n= sc.nextInt();
        print(n);
        sc.close();
        }
    }
}
    
    

// public class serise{
// public static void print(int n){
//     int a=1;
//     int b=10;
//     for (int i=1;i<=n;i++){
//        if (i%2 != 0) {
//         System.out.print(a +" ");
//         a = a*2;
//        }
//        else{
//         System.out.print(b+ " ");
//         b=b*2;
//        }
       
//     }
// }
//      public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("entre value");
//     while(true){
//     int n=sc.nextInt();
//     print(n);
//     }
// }
// }

   