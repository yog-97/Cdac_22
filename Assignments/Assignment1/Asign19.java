//19. To print the following series EVEN number Series 2 4 6 8 10 12 14 16 ....
import java.util.Scanner;

class asign19
{
	
	public static void main(String args[])
	{
		int n = 1;
		int i =0 ;
		while (n<=100)
		{
			i= n%2;
			if(i==0)
			System.out.println(n);	
			n++;
		}
}
}