import java.util.Scanner;

class ass3_pyramid_8
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for( int j = 1; j<=i ; j++)
			{
				
				System.out.print("*");
			}
			
			//for( int l = 1; l<=i ; l++)
			//{
				
				//System.out.print("");
			//}
			System.out.println();
			
			
		}
		
		for(int i=1;i<=4;i++)
		{
			for( int j = 4; j>=i ; j--)
			{
				
				System.out.print("*");
			}
		System.out.println();	
		}	
		/*for ( int a=1;a<=7;a+=2)
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
			
		}	*/			
	}
}

