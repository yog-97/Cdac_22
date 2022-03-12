//5. How to check the given number is Positive or Negative in Java?

import java.util.Scanner;

class asign5
{
	public static void main(String args[])
	{
		asign4 a = new asign4();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number Num :");
		int n1 = sc.nextInt();
		
		if(n1>0)
		{ System.out.println("Number is Positive");}
		else if(n1==0)
		{ System.out.println("Number is Nor Positive Nither Negative Number is Zero");}
		else
		{ System.out.println("Number is Negative");}
		
		
	
		
		
		
		
		
		
	}
}