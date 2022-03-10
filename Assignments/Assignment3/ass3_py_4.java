import java.util.Scanner;

class ass3_py_4
{
	public static void main(String args[])
	{
		
		for(int i=9;i>=1;i--)
		{
			int p = 1;
			int k = 9;
			
			for( int j = 1 ; j<i ;j++ )
			{
				System.out.print(" ");
			}
			
			for (int l= i; l<=9 ; l++)
			{
				
				System.out.print(p);
				p++;
			}
			k-=i;
			for (int a= i; a<=8 ; a++)
			{
				
				System.out.print(k);
				k--;
			}
			
				System.out.println();
			
				
			
		} 
	}
}
