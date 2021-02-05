
public class StackTest {

	public static void main(String[] args) {
		Stack stack=new Stack(5);
		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		
		stack.printStack();
		System.out.println(stack.peek());
		//System.out.println(stack.pop());
		stack.printStack();
		int n=stack.search(85);
		if(n<0)
		{
			System.out.println("Value not present in stack");
		}
		else
		{
			System.out.println("Value is present in stack at position "+n);
		}
	}

}
