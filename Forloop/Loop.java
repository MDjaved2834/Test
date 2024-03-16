package Forloop;
 
public class Loop {
    public static void print ( int n) {
        int sumodd =0;
         int sumeven =0;
         for ( int  i=1; i<=n; i++){
            if ( i%2==0){
                sumeven+= i;
               System.out.println(i+ "even ");
               
            }
            else{
                 sumodd+= i;
                System.out.print(i+ " odd  ");
               
            }

         }
         System.out.println("sum of even number ="+ sumeven);
         System.out.println("sum of odd number="+ sumodd);
        
    }
    public static void main(String [] args){
        print (10);
    }
}
