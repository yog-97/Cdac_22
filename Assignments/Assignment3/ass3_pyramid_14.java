
class ass3_pyramid_14
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for( int l = 1; l<=i ; l++)
			{
				
				System.out.print(" ");
			}
			for( int j = 5; j>=i ; j--)
			{
				
				System.out.print(" *");
			}
			System.out.println();
			
			
		}
		for (int a=5;a>=1;a--)
		{
			for(int j=1;j<=a;j++ )
			{
				System.out.print(" ");
			}
			for(int l=5;l>=a;l--)
			{
				System.out.print(" *");
			}	
			System.out.println();
		}	
	}
}
