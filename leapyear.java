import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter start year:");
    int s = sc.nextInt();
    System.out.println("Enter end year:");
    int e = sc.nextInt();
    
    System.out.println("Leap years between " + s + " and " + e + ":");
    for (int year = s; year <= e; year++) {
        if(year%400==0 && year%100 ==0 || year%4==0 && year % 100 !=0){
            System.out.println("leap year = " + year);
        }
        else {
            System.out.println("Not a leap year = " +year);
        }
    }
}
}
