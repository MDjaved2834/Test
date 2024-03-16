
    import  java.util.Scanner;
    public class primerange {
    
     public static void primenumber (int n){
        for(int i=2;i<n; i++){
            if(checkprime(i)==true)
            {
                System.out.println(i+" ");
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
        primenumber(n);
        
    }
}
    

