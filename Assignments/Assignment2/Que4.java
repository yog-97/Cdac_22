/*4. Write a Java program to print the result of the following operations. 
Test Data: 
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
*/
class Que4
{
	public static void main(String args[])
	{
		int i=(-5 + 8 * 6);
		int j=((55+9) % 9);
		int k=(20 + -3*5 / 8);
		int l=( 5 + 15 / 3 * 2 - 8 % 3);
		
		System.out.println("Expression no 1 = "+i);
		System.out.println("Expression no 2 = "+j);
		System.out.println("Expression no 3 = "+k);
		System.out.println("Expression no 4 = "+l);
	}
}