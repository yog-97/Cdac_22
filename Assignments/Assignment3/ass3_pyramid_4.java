import java.util.Scanner;

class ass3_pyramid_4
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for( int j = 1; j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			for (int l=i ; l<=5 ; l++ )
			{
				System.out.print(" ");
			}	
				
		} 
	}
}
