import java.util.Scanner;

class ass3_inverted_full_py
{
	public static void main(String args[])
	{
		
		for(int i=9;i>=1;i--)
		{
			
			for (int l= 1; l<=i ; l++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
			
			for( int j = i ; j<=9 ;j++ )
			{
				System.out.print(" ");
			}
		} 
	}
}
