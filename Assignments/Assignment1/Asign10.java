//10. Write a Java Program to find sum of the digits of a given number. 
import java.util.Scanner;

class asign10
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number : ");
		
		int n = sc.nextInt();
		int sum = 0 ;
		int q;

		for (int i=1; i<=n ; n=q)
		{
			int r = n%10;
			sum += r ;
			q = n/10;
	    }
		System.out.println("For given number "+n+" the sum ofits digit is = "+sum);
	}
}