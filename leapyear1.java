import java.util.Scanner;
public class leapyear1 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting year:");
        int startYear = sc.nextInt();
        System.out.println("Enter ending year:");
        int endYear = sc.nextInt();
        
        System.out.println("Leap years between " + startYear + " and " + endYear + ":");
        for (int year = startYear; year <= endYear; year++) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year);
            }
        }
    }
}

