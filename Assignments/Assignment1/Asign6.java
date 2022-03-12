//6. Write a Java Program to find whether given number is Leap year or NOT? 

import java.util.Scanner;

class asign6
{
	public static void main(String args[])
	{
		asign4 a = new asign4();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number Num :");
		int n1 = sc.nextInt();
		
		if( n1%4==0 && n1 % 100!=0 || n1%100==0 && n1%400==0 || n1%400==0 )
		{ System.out.println("Given Year is leap year");}
		else
		{ System.out.println("Given Year is not a leap year");}
			
	}
}