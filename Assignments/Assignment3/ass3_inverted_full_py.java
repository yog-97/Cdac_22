import java.util.Scanner;

class ass3_inverted_full_py
{
	public static void main(String args[])
	{
		
		for(int i=6;i>=1;i--)
		{
			
			for (int l= 1; l<=i ; l++)
			{
				System.out.print(" *");
			}
			System.out.println();
			
			for( int j = i ; j<=6 ;j++ )
			{
				System.out.print(" ");
			}
		} 
	}
}
