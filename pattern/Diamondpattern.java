package pattern;

public class Diamondpattern {
    public static void main(String[] args) {
        //int i,j,k;
        for(int i=1; i<=5; i++){
            for(int j=5;j>i; j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    
        for(int i=4; i>=1; i--){
            for(int j=5;j>i; j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
    


