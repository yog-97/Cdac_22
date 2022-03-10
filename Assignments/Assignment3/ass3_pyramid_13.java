class ass3_pyramid_13
{
	public static void main(String args[])
	{
		
		for(int a=1;a<=5;a++)
		{
			for( int j = 2; j<=a ; j++)
			{
				System.out.print(" ");
			}
			
			for( int l = 5; l>=a ; l--)
			{
				
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		for(int i=1;i<=4;i++)
		{
			
			for( int l = 3; l>=i ; l--)
			{
				
				System.out.print(" ");
			}
			for( int j = 0; j<=i ; j++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
		
	}
	
}