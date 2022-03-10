import java.util.Scanner;

class ass3_9
{
	public static void main(String args[])
	{
		
		for(int i=5;i>=1;i--)
		{
			char ch = 65;
			
			for( int j = 1 ; j<i ;j++ )
			{
				System.out.print(" ");
			}
			 
			
			for (int l= i; l<=5 ; l++)
			{
				System.out.print(" "+ch);
				ch++;
			}	
			
				System.out.println();
			
		} 
	}
}
