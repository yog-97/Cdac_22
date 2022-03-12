//8. Write a Java Program to print the digits of a Given Number
import java.util.Scanner;

class asign8
{
	
	public static void main(String args[])
	{
		asign7 a = new asign7();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number : ");
		
		int n = sc.nextInt();
		String s = "";
		int count = 1;
		int q;
		
		for (int i=1; i<=n ; n=q)
		{
			int r = n%10;
			s = s + r;
			q = n/10;
	    }	
		
		for (int j = s.length()-1 ; j >=0 ; j--)
		{
			System.out.println("Digit at place "+count+" is :"+s.charAt(j));
			count++;
		}	
		
		
	}
}