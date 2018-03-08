package first;

import java.util.Scanner;
import java.util.Stack;

public class F1060 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()) {
			int n = input.nextInt();
			Queue in = new Queue();
			Queue out = new Queue();
			Stack<Integer> s = new Stack<Integer>();
			for(int i = 1; i <= n; i++) 
				in.push(new Node(i));
			doStack(in, s, out);
		}
		input.close();
	}
	
	@SuppressWarnings("unchecked")
	private static void doStack(Queue in, Stack<Integer> s, Queue out) {
		if(in.isEmpty()) {
			if(s.isEmpty())
				out.print();
			else {//栈内还有元素
				while(!s.isEmpty())
					out.push(new Node(s.pop()));
				out.print();
			}
		}else {//输入队列还有
			if(!s.isEmpty()) {
				Stack<Integer> ts;
				Queue tin = new Queue(in);
				Queue tout = new Queue(out);
				ts = (Stack<Integer>) s.clone();
				tout.push(new Node(ts.pop()));
				doStack(tin, ts, tout);
			}else {
				s.push(in.pop());
				doStack(in, s, out);
			}
		}
	}
}
class Node{
	int num;
	Node next;
	
	public Node() {
		this.num = 0;
		this.next = null;
	}
	public Node(int num) {
		this.num = num;
		next = null;
	}
}

class Queue{
	private Node top;
	private Node tail;
	
	public Queue()  {
		top = null;
		tail = null;
	}
	
	public Queue(Queue q) {
		if(q.isEmpty()) {
			top = null;
			tail = null;
		}
		top = new Node(q.font());
		tail = top;
		Node temp = q.getTop().next;
		Node tempTop = this.top;
		while(temp != null) {
			tempTop.next = new Node(temp.num);
			tail = tempTop.next;
			tempTop = tempTop.next;
			temp = temp.next;
		}
	}
	
	public Node getTop() {
		return top;
	}
	public boolean isEmpty() {
		if(top == null)
			return true;
		return false;
	}
	
	public void print() {
		Node temp = top;
		while(temp != null) {
			if(temp.next != null)
				System.out.print(temp.num + " ");
			else
				System.out.print(temp.num);
		}
	}
	
	public void clear() {
		this.top = null;
		this.tail = null;
	}
	
	public int font() {
		return this.top.num;
	}
	
	public int pop() {
		int topNum = top.num;
		this.top = this.top.next;
		return topNum;
	}
	
	public void push(Node node) {
		if(this.isEmpty()) {
			top = node;
			tail = node;
		}else {
			tail.next = node;
			tail = node;
		}
	}
}
