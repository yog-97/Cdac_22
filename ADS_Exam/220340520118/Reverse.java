import java.util.Scanner;
class Reverse{
	Node head;
	Node tail;
	
	 class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	void insertLast(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		}else{
			tail.next = newNode;
			tail = newNode;			
		}
	}
	
	void reverseList(){
		Node current = head;
		reverseList(current);
	}
	
	void reverseList(Node current){
		if(current==null){
			return;
		}else{
			reverseList(current.next);
			System.out.print(current.data+" ");
		}
		
	}
	
	
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		Reverse r1 = new Reverse();
		System.out.print("how many numbers you want to insert data : ");
		int num = sc.nextInt();
		
		for (int i=0 ; i<num ; i++){
			r1.insertLast();
		}
		System.out.println();
		System.out.println("Reverse a Linked List");
		
		
		r1.reverseList();
		
		
		
	}
	
}


/*Reverse a Linked List 
Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their 
order is reversed. The head pointer given may be null meaning that the initial list is empty.
Example
head references the list 1->2->3->NULL
Manipulate the next pointers of each node in place and return head, now referencing the head of the 
list.
3->2->1->NULL.
Function Description
Complete the reverse function in the editor below.
reverse has the following parameter:
 Node pointer head: a reference to the head of a list
Returns
LinkedListNode pointer: a reference to the head of the reversed list
Input Format
The first line contains an integer t, the number of test cases.
Each test case has the following format:
The first line contains an integer n, the number of elements in the linked list.
Each of the next n lines contains an integer, the data values of the elements in the linked list.*/