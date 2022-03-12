//7. Write a Java Program to Print 1 To 10 Without Using Loop. 

import java.util.Scanner;

class asign7
{
	
	void print1_10(int n)
	{
		
		if (n<=10)
		{
			System.out.println(n);
			print1_10(n+1);
		}	
	}
	
	public static void main(String args[])
	{
		asign7 a = new asign7();
		a.print1_10(1);	
	}
}