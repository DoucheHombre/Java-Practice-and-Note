import java.util.Scanner;
public class QueueMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of Queue= ");
		int size=sc.nextInt();
		Queue queue=new Queue(size);
		queue.enQueue(15);
		queue.enQueue(65);
		queue.enQueue(45);
		queue.displayQueue();
		queue.deQueue();
		queue.displayQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.displayQueue();
		queue.enQueue(88);
		queue.displayQueue();
		queue.enQueue(56);
		queue.enQueue(123);
		queue.enQueue(456);
		queue.enQueue(789);
		queue.displayQueue();
		queue.deQueue();
		queue.displayQueue();
	}

}
