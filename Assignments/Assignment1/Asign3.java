//3. Find the Factorial of a number using Recursion. 

import java.util.Scanner;

class asign3
{
	int j ;
	
	int factorial(int j)
	{
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
		asign3 a = new asign3();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number :");
		int n = sc.nextInt();
		
		int f = a.factorial(n);
			
		System.out.println("the factorial of "+n+" is "+f);	
		
	}
}