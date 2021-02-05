package Practice;

public class Test {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(list, 10);
		list.insert(list, 20);
		list.insert(list, 30);
		list.insert(list, 40);
		list.insert(list, 50);
		list.insert(list, 60);
		LinkedList.printLinkedList(list);
		System.out.println("The length of Linked List is = "+list.lengthOfLinkedList(list));
		
		LinkedList.deleteFromLinkedListByPosition(list, 6);
		LinkedList.deleteFromLinkedListByPosition(list, 4);
		LinkedList.deleteFromLinkedListByPosition(list, 2);
		LinkedList.deleteFromLinkedListByPosition(list, 3);
		LinkedList.deleteFromLinkedListByPosition(list, 2);
		System.out.println("-------");
		LinkedList.printLinkedList(list);
		System.out.println("The length of Linked List is = "+list.lengthOfLinkedList(list));
		
		
		LinkedList.deleteFromLinkedListByPosition(list, 1);
		System.out.println("-------");
		LinkedList.printLinkedList(list);
		
		System.out.println("The length of Linked List is = "+list.lengthOfLinkedList(list));
		
		  System.out.println("-----------------------------------------------------");
		  System.out.println("-----------------------------------------------------");
		 
		
		  LinkedList list2 = new LinkedList();
		  
		  list2.insert(list2, 500); 
		  list2.insert(list2, 600);
		  list2.insert(list2, 700);
		  list2.insert(list2, 400);
		  
		  LinkedList.printLinkedList(list2);
		  LinkedList.deleteFromLinkedListByKey(list2, 500);
		  System.out.println("-----------------------------------------------------");
		  LinkedList.printLinkedList(list2);
		 
	}

}
