import java.util.Scanner;

class ass3_12
{
	public static void main(String args[])
	{
		int p = 1;
		for(int i=5;i>=1;i--)
		{
			
			
			for( int j = 1 ; j<i ;j++ )
			{
				System.out.print(" ");
			}
			
			for (int l= i; l<=5 ; l++)
			{
				System.out.print(" "+p);
				
			}	
			p++;
				System.out.println();
			
		} 
	}
}
