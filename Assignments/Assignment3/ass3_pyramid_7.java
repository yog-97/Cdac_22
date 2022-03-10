import java.util.Scanner;

class ass3_pyramid_7
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i+=2)
		{
			for( int j = 8; j>=i ; j-=2)
			{
				
				System.out.print(" ");
			}
			
			for( int l = 1; l<=i ; l++)
			{
				
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		for ( int a=1;a<=7;a+=2)
		{
			for( int l = 1; l<=a ; l+=2)
			{
				
				System.out.print(" ");
			}
			
			for( int j = 7; j>=a ; j--)
			{
				
				System.out.print("*");
			}
			System.out.println();
			
		}				
	}
}

