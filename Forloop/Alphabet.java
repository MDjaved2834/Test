package Forloop;
import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args){
        char ch;
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);

        for (char i='A'; i<='Z'; i++){
            System.out.println(i+ "  ");
        } 
    }
}
    