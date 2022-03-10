import java.util.Scanner;

class ass3_8
{
	public static void main(String args[])
	{
		
		for(int i=5;i>=1;i--)
		{
			//int p = 5;
			
			for( int j = 1 ; j<i ;j++ )
			{
				System.out.print(" ");
			}
			
			int p=i;
			for (int l= i; l<=5 ; l++)
			{   
				System.out.print(" "+p);
				p++;
			}	
			
				System.out.println();
			
		} 
	}
}
