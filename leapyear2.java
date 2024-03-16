import java.util.Scanner;
public class leapyear2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter year");
    int year = sc.nextInt();
    
    if(year%400==0 && year%100 ==0 || year%4==0 && year % 100 !=0){
        System.out.println("leap year" + year);
    }
    else {
        System.out.println("Not a leap year" +year);
    }
}
}