import java.util.Scanner;
public class MergeTwoNumber {
    public static  long  merge(int n1, int n2) 
    {
        int c=0;
        int t=n2;
            while(t>0)//log (n)
            { 
                c++;
               t=t/10;
            }
            int res=1;
            for(int i=1; i<=c; i++){
                res=res*10;
            }
            return n1*res+n2;
        }
    
        
        public static void main(String[] args){
            Scanner sc= new Scanner (System.in);
            while(true){
            System.out.println("Enter  two int");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
                System.out.println(merge(n1,n2));
                sc.close();
        }
    }
}

