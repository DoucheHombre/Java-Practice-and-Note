package QueueUsingLinkedList;

public class Queue {
	Node head;

	public void enQueue(int num) {
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

	public void printQueue() {
		if (head == null) {
			System.out.println("Queue is empty!!");
		} else {
			Node curNode = head;
			while (curNode.next != null) {
				System.out.println(curNode.data);
				curNode = curNode.next;
			}
			System.out.println(curNode.data);
		}
	}

	public void deQueue() {
		
		Node curNode = head;

		if (curNode.next == null) {
			head = null;
		} else {
			head = curNode.next;
		}

	}
}
