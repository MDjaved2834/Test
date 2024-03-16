import java.util.Scanner;
public class LeftRotate 
{
    public static int rotateleft(int n)
    {
        int res=1;
        int t=n;
        while(t>9)
        {
            res=res*10;
            t=t/10;
        }
        int last=n%res;
        int first=n/res;
        n=last*10+first;
        return n;
    }

     public static void main(String[] args)
     {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter  one int");
        int n = sc.nextInt();
        System.out.println(rotateleft(n));
            sc.close();
        }
    }

