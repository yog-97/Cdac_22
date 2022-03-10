

class ass3_pyramid_12
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for( int j = 1; j<=i ; j++)
			{
				
				System.out.print("*");
			}
			
			for( int l = 5; l>=i ; l--)
			{
				
				System.out.print(" ");
			}
			System.out.println();
			
			
		}
		
		for(int a=2;a<=5;a++)
		{
			for( int j = 1; j<=a ; j++)
			{
				
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
}