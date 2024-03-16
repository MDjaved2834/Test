
import java.util.Scanner;
public class Program0 {
    public static String check (char optn){
        Scanner sc = new Scanner(System.in);
       if (optn=='A'|| optn=='a'){
            return "A selected";}
    else if ( optn=='B'|| optn=='b'){
            return "B selected";}
      else if(optn=='C' ||optn=='c'){
            return "C selected";}
    else if (optn=='D'||optn=='d'){
            return "D selected";}
       else if( optn=='E'|| optn=='d'){
            return "E selected";}     
    else{
       return " Invalid char";}
       }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter optnion=");
        char optn=sc.next().charAt(0);
        System.out.println(check(optn));
        sc.close();
    }


}
    
        
