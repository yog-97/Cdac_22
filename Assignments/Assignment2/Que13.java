/*
13. Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

import java.util.Scanner;
class Que13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no = ");
		float w =sc.nextFloat();
		
		System.out.println("Enter 2nd no = ");
		float h =sc.nextFloat();
		
		float area = w*h;
		
		float peri = (2*(w+h));
		
		System.out.println("area = "+area);
		System.out.println("perimeter = "+peri);
	}
}