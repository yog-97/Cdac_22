class InsertionSort{
	public static void main(String [] args){
		int a1 [] = {2,4,6,8,3};
		int n = a1.length;
		
		for(int i= 0; i<n;i++){
			
			System.out.print(" "+a1[i]);
		} 
		System.out.println();
		System.out.println();
		
		for(int i = 1; i < n ; i++){
			int max = a1[i];
			int j = i-1;
			while((j>-1)&&(max<a1[j])){
				a1[j+1]=a1[j];
				j--;
				for(int k = 0; k<n;k++){
				System.out.print(" "+a1[k]);
			}
			System.out.println();
			}
			
			a1[j+1]=max;
			
		}
			System.out.println();
		for(int i= 0; i<n;i++){
			
			System.out.print(" "+a1[i]);
		} 
	}
}

/*Q1: Sorting
Assume you are given the array a1=[1,2,4,5,3] indexed 0…4. Store the value of a1[4]. Now test lower 
index values successively from 3 to 0 until you reach a value that is lower than a1[4] , at a1[1] in this 
case. Each time your test fails, copy the value at the lower index to the current index and print your 
array. When the next lower indexed value is smaller than a1[4], insert the stored value at the current 
index and print the entire array.
Example
n=5
a1 = [1,2,4,5,3]
Start at the rightmost index. Store the value of a1[4]=3 . Compare this to each element to the left until 
a smaller value is reached. Here are the results as described:
1 2 4 5 5
1 2 4 4 5
1 2 3 4 5
Function Description
Complete the insertionSort function in the editor below.
insertionSort has the following parameter(s):
n: an integer, the size of a1
a1: an array of integers to sort
Returns
Note: Print the interim and final arrays, each on a new line. No return value is expected.
Input Format
The first line contains the integer n , the size of the array a1 .
The next line contains n space-separated integers a1[0]…a1[n-1].
Constraints
1<=n<=1000
-1000<=a1[i]<=10000
Output Format
Print the array as a row of space-separated integers each time there is a shift or insertion.
Test case 1:
5
2 4 6 8 3
Sample Output
2 4 6 8 8 
2 4 6 6 8 
2 4 4 6 8 
2 3 4 6 8 [10 marks]
*/