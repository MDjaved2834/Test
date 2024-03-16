import java.util.Scanner;
public class RightRotate{
    public static int rorateright(int n)
    {
        int last=n%10;//n
        int first=n/10;//123
        int t=first;
        int res=1;
        while(t>0)
        {
            res=res*10;
            t=t/10;
        }
        n=last*res+first;
        return n;
    }
     public static void main(String[] args)
     {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter  one int");
        int n = sc.nextInt();
        System.out.println(rorateright(n));
            sc.close();
        }
    } 
    
  
