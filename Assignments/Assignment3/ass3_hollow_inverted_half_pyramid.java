

class ass3_hollow_inverted_half_pyramid
{
	public static void main(String args[])
	{
		for(int i=6;i>=1;i--)
		{
			for ( int l=1; l<=i ; l++)
			{
				if (i>2 && i<6 )
				{
					if (l==1||l==i)
					{
						System.out.print(" *");
					}
					else
					{
						System.out.print("  ");
					}	
				}	
				else
				{
					System.out.print(" *");
				}	
			}	
			    System.out.println();
			
		} 
	}
}