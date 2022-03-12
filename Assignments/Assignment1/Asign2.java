import java.util.Scanner;

class asign2
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number :");
		int n = sc.nextInt();
		
		long f = 1 ;
		
		for (int i=1 ; i<=n ; i++)
		{
			f=f*i;
		}
			
		System.out.println("the factorial of "+n+" is "+f);	
		
	}
}