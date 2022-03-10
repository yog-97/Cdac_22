/*19. Write a Java program to convert a decimal number to binary number. 
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101
*/

import java.util.Scanner;

class Que19
{
	public static void main(String args[])
	{
		
		int n;
		System.out.println("Enter Decimal no ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int q;
		int r;
		String x= "";
		String reversedString = "";
	
		for(int i=2;n!=0;n=q)
		{
			r = n%2;
			x =x + r;	
			q=n/2;
		}
		
		for(int i= x.length()-1; i>=0; i--)
		{
			reversedString = reversedString + x.charAt(i);
		}
		System.out.println("The Binary is");
		System.out.println(reversedString);
		
		}	
}