
public class Stack {
	int capacity;
	int top;
	int a[];

	Stack(int length) {
		this.capacity = length;
		this.top = -1;
		this.a = new int[length];
	}

	boolean isEmpty() {
		boolean value = false;
		if (top == -1) {
			value = true;
		}
		return value;
	}

	boolean isFull() {
		boolean value = false;
		if (top == (capacity - 1)) {
			value = true;
		}
		return value;
	}

	void push(int n) {
		boolean test = isFull();
		if (test == true) {
			System.out.println("Stack is full");
			System.exit(1);
		} else {
			top = top + 1;
			a[top] = n;
		}
	}

	int pop() {
		boolean test = isEmpty();
		int value;
		if (test == true) {
			System.out.println("Stack is empty");
			System.exit(1);
		}

		value = a[top];
		top = top - 1;
		return value;
	}

	void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.println("At " + i + " th position " + a[i]);
		}
	}

	int peek() {
		int value = 0;
		if (isEmpty()) {
			System.out.println("The Stack is empty");
			return value;
		} else {
			value = a[top];
			return value;
		}
	}

	int search(int n) {
		int value = -1;
		for (int i = 0; i <= top; i++) {
			if (n == a[i]) {
				value = i;

			}
		}
		return value;
	}
}
