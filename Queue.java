
public class Queue {
	int front;
	int rear;
	int arr[];
	int capacity;

	Queue(int size) {
		this.capacity = size;
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}

	boolean isFull() {
		if (rear == (capacity - 1)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	void enQueue(int n) {
		if (isFull()) {
			System.out.println("Queue is full!!!");
		} else {
			if (front == -1) {
				front = front + 1;
			}
			rear = rear + 1;
			arr[rear] = n;
		}
	}

	void deQueue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty!!!");
			element = -11111;
		} else {
			element = arr[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = front + 1;
			}
		}
		System.out.println("The removed element is= "+element);
	}

	void displayQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!!");
		} else {
			System.out.println("The Queue is= ");
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}
