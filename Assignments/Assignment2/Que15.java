//15. Write a Java program to swap two variables. 

import java.util.Scanner;
class Que15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no = ");
		int a =sc.nextInt();
		
		System.out.println("Enter 2nd no = ");
		int b =sc.nextInt();
		
		System.out.println("Before swaping a = "+a+" and b = "+b);
		
		
		a = a + b;
		b = a - b;
		a = a - b; 
 		
		System.out.println("After swaping a = "+a+" and b = "+b);
	}
}