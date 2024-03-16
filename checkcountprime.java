import  java.util.Scanner;
public class checkcountprime {
     public static void primenumber (int start, int n){
        int p=0;
        for(int i=start;; i++){
            if(checkprime(i))
            {
                System.out.println(i+" ");
                p++;
            }
            if(p==n){
                break;
            }
}
     }
public static boolean checkprime(int num)
{
    int count=0;
    for(int i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        return true;
    }
    return false;
}
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter values");
        int n= sc.nextInt();
        primenumber(2,n);
        
    }
}



 
