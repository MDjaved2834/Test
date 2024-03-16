import java.util.Scanner;
public class Sumevennumber {
    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int n =input.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
		System.out.println(n);
        }
	}
}


