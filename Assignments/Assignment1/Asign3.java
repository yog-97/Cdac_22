//3. Find the Factorial of a number using Recursion. 

import java.util.Scanner;

class asign3
{
	int j ;
	
	int factorial(int n);
	{
		int j=n;
		
		if (j==0)
		{
			return 1;
		}
		else 
		{
			return j * factorial(j-1);
		}		
		
	}
	
	public static void main(String args[])
	{
		asign a = new asign();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number :");
		int n = sc.nextInt();
		
		int f = a.factorial(n);
			
		System.out.println("the factorial of "+n+" is "+f);	
		
	}
}