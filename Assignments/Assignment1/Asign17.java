//17. Check whether the Given Number is a Palindrome or NOT.
import java.util.Scanner;

class asign17
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Number 1 : ");
		int n = sc.nextInt();
		int ori = n;
		int d;
		int rev =0;
		while (n!=0)
		{
			d=n%10;
			rev = (rev *10) + d ;
			//System.out.println(rev);
			n=n/10;
		}
		
		if (ori == rev)	
		System.out.println("Number is Pallidrome");
		
		else 
		System.out.println("Number is not Pallidrome");	
	}
}