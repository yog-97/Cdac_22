/*
5. Write a Java program that takes two numbers as input and display the product of 
two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/

import java.util.Scanner;
class Que5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number = ");
		int i = sc.nextInt();
		
		System.out.println("Enter 2nd number = ");
		int j = sc.nextInt();
		
		
		int pro=i*j;
		
		System.out.println(i+"*"+j+" = "+pro);
		
	}
}