import java.util.Scanner;

class ass3_py_1
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			
			for( int j = i ; j<9 ;j++ )
			{
				System.out.print(" ");
			}
			
			for (int l= 1; l<=i ; l++)
			{
				System.out.print(" "+i);
				
			}
				System.out.println();	
		} 
	}
}
