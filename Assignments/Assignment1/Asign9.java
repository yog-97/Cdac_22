//9. Write a Java Program to print all the Factors of the Given number. 
import java.util.Scanner;

class asign9
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number : ");
		
		int n = sc.nextInt();
		
		System.out.print("Given number "+n+" Factors are :");

		for (int i=1; i<=n ; i++)
		{
			if(n%i==0)
			System.out.print(" "+i+" ");	
	    }	
		
	}
}