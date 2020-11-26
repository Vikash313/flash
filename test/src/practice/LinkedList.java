package practice;

public class LinkedList {
	
	public void display(ListNode head) {
		if(head == null) {
			return;
		}
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.data + " --> ");
			
			current = current.next;
		}
		System.out.print(current);	
	}
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		LinkedList l = new LinkedList();
		l.display(head);
		

	}

}
