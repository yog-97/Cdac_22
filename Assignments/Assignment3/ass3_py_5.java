import java.util.Scanner;

class ass3_py_5
{
	public static void main(String args[])
	{
		
		for(int i=9;i>=1;i--)
		{
			
			for( int j = 1 ; j<i ;j++ )
			{
				System.out.print("  ");
			}
			int p=i;
			for (int l= i; l<=9 ; l++)
			{
				
				System.out.print(" "+p);
				p++;
			}
			
			int k=8;//9-9=0//9-8=1
			
			for (int a= i; a<=8 ; a++)
			{
				
				System.out.print(" "+k);
				k--;
			}
			
				System.out.println();
			
				
			
		} 
	}
}
