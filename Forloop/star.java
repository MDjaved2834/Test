package Forloop;

public class star {
    
    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i);
            if (i != n) {
                System.out.print(", ");
            }
        }
    }
        public static void main (String [] args){
            print (10);
    }
}
