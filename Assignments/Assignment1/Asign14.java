//14. Write a Java Program to find GCD of two given numbers
import java.util.Scanner;

class asign14
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Number 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int n2 = sc.nextInt();
		int gdc = 0;
		
		for (int i=1 ; i<=n1 && i<=n2 ; i++)
		{
			if( n1%i==0 && n2%i==0 )
			{
				gdc=i;
			}
		}	
		System.out.println("The GDC of "+n1+" & "+n2+" is "+gdc);
	}
}