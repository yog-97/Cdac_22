import java.util.Scanner;

class ass3_10
{
	public static void main(String args[])
	{
		for(char i=69;i>=65;i--)
		{
			for( int j = 65 ; j<i ;j++ )
			{
				System.out.print(" ");
			}
			
			char p=i;
			for (char l= i; l<=69 ; l++)
			{   
				System.out.print(" "+p);
				p++;
			}	
				System.out.println();	
		} 
	}
}
