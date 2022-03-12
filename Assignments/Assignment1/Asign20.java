//20. To print the following series ODD number Series 1 3 5 7 9 11 13 ....
import java.util.Scanner;

class asign20
{
	
	public static void main(String args[])
	{
		int n = 1;
		int i =0 ;
		while (n<=100)
		{
			i= n%2;
			if(i!=0)
			System.out.println(n);	
			n++;
		}
}
}