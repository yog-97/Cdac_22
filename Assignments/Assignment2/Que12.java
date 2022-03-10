/*
12. Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers.
*/

import java.util.Scanner;
class Que12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no = ");
		int i =sc.nextInt();
		
		System.out.println("Enter 2nd no = ");
		int j =sc.nextInt();
		
		System.out.println("Enter 3rd no = ");
		int k =sc.nextInt();
		
		
		float avg = (float)(i+j+k)/3;
		
		System.out.println("Expression output = "+avg);
	}
}