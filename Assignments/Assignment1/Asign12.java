//12. How to add two numbers without using the arithmetic operators in Java? 
import java.util.Scanner;

class asign13
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Number 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int n2 = sc.nextInt();
		
		for ( int i=1 ; i<=n2 ; i++ )
		{
			n1++;
		}
		System.out.println("Sum is "+n1);
	}
}