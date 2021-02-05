package Practice;

public class LinkedList {
	Node head;

	public LinkedList insert(LinkedList list, int num) {
		if (list.head == null) {
			list.head = new Node(num);
		} else {
			Node curNode = list.head;
			while (curNode.next != null) {
				curNode = curNode.next;
			}
			curNode.next = new Node(num);
		}
		return list;
	}

	public static void deleteFromLinkedListByKey(LinkedList list, int key) {
		Node prev = null;
		Node present = list.head;

		while (present.data != key) {
			if (present.next == null) {
				System.out.println(key + " not present in Linked List.");
				break;
			} else {
				prev = present;
				present = present.next;
			}
		}

		if (present.data == key) {
			if (prev != null) {
				if (present.next != null) {
					prev.next = present.next;
				} else {
					prev.next = null;
				}
			} else if (prev == null) {
				if (present.next != null) {
					list.head = present.next;
				} else {
					list.head = null;
				}
			}
		}
	}

	public static void deleteFromLinkedListByPosition(LinkedList list, int position) {
		int count = 1;
		Node prev = null;
		Node present = list.head;
		while (count != position) {
			count++;
			if (present.next == null || position <= 0) {
				System.out.println("Element is not present in Linked List.Can't be deleted.");
				break;
			} else {
				prev = present;
				present = present.next;
			}
		}
		if (count == position) {
			if (prev == null) {
				if (present.next != null) {
					list.head = present.next;
				} else {
					list.head = null;
				}
			} else {
				if (present.next == null) {
					prev.next = null;
				} else {
					prev.next = present.next;
				}
			}
		}

	}

	public static void printLinkedList(LinkedList list) {
		if (list.head == null) {
			System.out.println("Linked List is empty");
		} else {
			Node curNode = list.head;
			while (curNode.next != null) {
				System.out.println(curNode.data);
				curNode = curNode.next;
			}
			System.out.println(curNode.data);
			System.out.println("---------");
			System.out.println("---------");
		}
	}

	public int lengthOfLinkedList(LinkedList list) {
		int count = 0;
		if (list.head == null) {
			return count;
		} else {
			Node curNode = list.head;
			while(curNode.next != null)
			{
				count++;
				curNode = curNode.next;
			}
			count++;
			return count;
		}
	}

}
