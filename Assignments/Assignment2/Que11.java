/*
11. Write a Java program to print the area and perimeter of a circle. 
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

import java.util.Scanner;
//import java.lang.Math; // it is imported automattically
class Que11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius = ");
		double r =sc.nextFloat();
		
		//final double PI = 22.0/7.0;
		//final double PI = 3.141592653589793;
		
		double area = (Math.PI*(r*r));
		
		double peri = (2*(Math.PI)*(r));
		
		System.out.println("area = "+area);
		System.out.println("perimeter = "+peri);
	}
}