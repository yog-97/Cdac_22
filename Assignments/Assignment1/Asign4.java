//4. Swap two numbers without using third variable approach. 

import java.util.Scanner;

class asign4
{
	public static void main(String args[])
	{
		asign4 a = new asign4();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number Num 1 :");
		int n1 = sc.nextInt();
		System.out.print("Enter Number Num 2 :");
		int n2 = sc.nextInt();
		
		n1= n1+n2;
		n2= n1-n2;
		n1=n1-n2;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Swapped Number Num 1 = "+n1);
		System.out.println("Swapped Number Num 2 = "+n2);
		
		
		
		
		
		
	}
}