package Array.Array;
public class sumofarray {
        
    public static void print(int [] array) {
        int sum=0;
        int  product=1;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
            for (int i = 0; i < array.length; i++) {
            product=product*array[i];
            
        }
        
            System.out.println("sum="+ sum);
            System.out.println("product="+ product);
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6,8,7,9};
        print(num);
    }
}

        
    
    