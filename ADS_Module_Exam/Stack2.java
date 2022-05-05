class Stack2{
	int arr [] ;
	int size ;
	int top1;
	int top2;
	
	Stack2(int n){
		size = n;
		arr = new int [n];
		top1 = n/2+1;
		top2 = n/2;
	}
	
	void push1(int x){
		if(top1>0){
			top1--;
			arr[top1] = x;
		}else{
			System.out.println("Stack Overflow");
			return;
		}
	}
	
	void push2(int x){
		if(top2 < size-1){
			top2++;
			arr[top2] = x;
		}else{
			System.out.println("Stack overflow");
			return;
		}
		
	}
	
	int pop1(){
		if(top1 <= size/2){
			int x = arr[top1];
			top1++;
			return x;
		}else {
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		if(top2 >= size/2+1){
			int x = arr[top2];
			top2--;
			return x;
		}else {
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 1;
	}
	
	
	
	public static void main (String [] args){
		Stack2 s = new Stack2(10);
		
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		
		System.out.println("Popped element from stack1 is " + s.pop1());
		System.out.println("Popped element from stack2 is " + s.pop2());
		
	}
}

/*Java program to implement two stacks in a single array.
11 5 10 15 7 40
Note: Please check is required to be update in list and then define test case.
Input values :
push1(5); 
push2(10); 
push2(15); 
push1(11); 
push2(7); 
push2(40);
Output: (Required to be printed like this only)
Popped element from stack1 is 11
Popped element from stack2 is 40
*/