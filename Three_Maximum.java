import java.util.Scanner;
class Three_Maximum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Number2 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the number3 : ");
		int num3= sc.nextInt();
		if(num1>num2 && num1>num3)
		{
		System.out.println("Maximum Number is " +num1);
	    }
	    else if(num2>num1 && num2>num3)
		{
     	System.out.println("Maximum Number is " +num2);
		}
		else{
			System.out.println("maximum numberis "+ num3);
		}
	}
}
		
		
		
		
	