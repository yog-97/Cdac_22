/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers. 
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

import java.util.Scanner;
class Que6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number = ");
		int i = sc.nextInt();
		
		System.out.println("Enter 2nd number = ");
		int j = sc.nextInt();
		
		
		int add=i+j;
		int sub=i-j;
		int pro=i*j;
		int div=i/j;
		int mod=i%j;
		
		System.out.println(i+"+"+j+" = "+add);
		System.out.println(i+"-"+j+" = "+sub);
		System.out.println(i+"*"+j+" = "+pro);
		System.out.println(i+"/"+j+" = "+div);
		System.out.println(i+"%"+j+" = "+mod);
		
	}
}