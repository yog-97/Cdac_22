

class ass3_pyramid_16
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for( int j = 1; j<i;j++)
			{
				System.out.print(" ");
			}
			for ( int l = 5; l>=i ; l--)
			{
				if (i>1 && i<5 )
				{
					if (l==5||l==i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}	
				}	
				else
				{
					System.out.print("*");
				}	
				
			}		
			    System.out.println();
			
		} 
	}
}