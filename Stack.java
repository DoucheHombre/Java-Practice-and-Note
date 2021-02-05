package StackUsingLinkedListUsingSimpleWay;

public class Stack {
	Node head;

	public void push(int num) {
		if (head == null) {
			head = new Node(num);
		} else {
			Node curNode = head;
			while (curNode.next != null) {
				curNode = curNode.next;
			}
			curNode.next = new Node(num);
		}
	}

	public void pop() {
		Node prev = null;
		Node curNode = head;
		while (curNode.next != null) {
			prev = curNode;
			curNode = curNode.next;
		}
		if (prev == null) {
			if (curNode.next == null) {
				head = null;
			}
		} else {
			if (curNode.next == null) {
				prev.next = null;
			}
		}
	}

	public void displayStack() {
		Node curNode = head;
		if (curNode == null) {
			System.out.println("Stack is empty.");
		} else {
			while (curNode.next != null) {
				System.out.println(curNode.data);
				curNode = curNode.next;
			}
			System.out.println(curNode.data);
		}
	}

	public int countLengthOfStack() {
		int length =0 ;
		Node curNode = head;
		if (curNode == null) {
			return length;
		} else {
			while (curNode.next != null) {
				length++;
				curNode = curNode.next;
			}
			length++;
			return length;
			
		}
	}
}
