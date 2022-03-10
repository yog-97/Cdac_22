import java.util.Scanner;

class ass3_pyramid_5
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i+=2)
		{
			for( int j = 9; j>=i ; j-=2)
			{
				
				System.out.print("  ");
			}
			
			for( int l = 1; l<=i ; l++)
			{
				
				System.out.print(" *");
			}
			System.out.println();
		} 
	}
}

