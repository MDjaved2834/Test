
    import java.util.Scanner;
    public class grestest {
    public static int hiset (int a,int b, int c) {
       
    if(a>b && a>c){
        return a;
    }
    else if (b>a && b>c){
        return b;
    }
    
    else{
        return c;
    }
}
public static int Lowest(int a, int b, int c) {
    
    if (a < b && a < c) {
        return a;
    } else if (b < a && b < c) {
        return b;
    } else {
        return c;
    }
}   

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int a=sc.nextInt();
    System.out.println("Enter second number ");
    int b=sc.nextInt();
    System.out.println("Enter three number");
    int c=sc.nextInt();
    System.out.println(hiset(a,b,c));
    System.out.println(Lowest(+a,b,c));
}
}


