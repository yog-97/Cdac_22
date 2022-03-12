//13. Write a java program to Reverse a given number
import java.util.Scanner;

class asign13
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Number  : ");
		int n = sc.nextInt();
		int q ;
		System.out.println("Reverse Order is ");
		for (int i=1 ; i<=n ; n=q )
		{
			int r = n%10;
			System.out.print(" "+r+" ");
			q = n/10;
	    }	
	}
}