//11. Write a Java Program to find the smallest of 3 numbers (a,b,c)  
import java.util.Scanner;

class asign11
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Number 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int n2 = sc.nextInt();
		System.out.print("Enter Number 3 : ");
		int n3 = sc.nextInt();
		
		if( n1<n2 && n1<n3)
			System.out.println(n1+" is the Smallest Number");
		else if ( n2<n3 )
			System.out.println(n2+" is the Smallest Number");
		else
			System.out.println(n3+" is the Smallest Number");
	}
}