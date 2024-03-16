import  java.util.Scanner;
public class prime {    
 public  static   String checkprime( int n){
    int c=0;
    for (int  i=1; i<=n;i ++)
    //System.out.println();
    {
        if (n%i==0)
        {      
           c++;
        }
    }
    System.out.println(c);
    if (c==2)
    {
        return "Prime Number";
    }
    else{
        return "NOt Prime Number";
    }
}

    public static void main (String [] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter values");
    int n=sc.nextInt();
    System.out.println(checkprime(n));
        
    }
  }  

  