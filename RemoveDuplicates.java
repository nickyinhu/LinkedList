package linkedlist;

/**
 * Remove duplicates from an unsorted singly linked list
 * @author Hu
 *
 */
class Node {
	Node next;
	int val;
	Node(int val){
		this.val = val;
		this.next = null;
	}
}
public class RemoveDuplicates {
	
	public Node removeDup (Node head){
		if(head == null || head.next == null){
			return head;
		}
		Node cur = head;
		while (cur !=null){
			Node runner = cur;
			while (runner.next != null){
				if(cur.val == runner.next.val){
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			cur = cur.next;
		}
		return head;
	}
	
	public static void main (String[] args){
		Node d1 = new Node(1);
		Node d2 = new Node(2);
		Node d3 = new Node(3);
		Node d4 = new Node(4);
		Node d5 = new Node(4);
		Node d6 = new Node(1);
		d1.next = d2;
		d2.next = d3;
		d3.next = d4;
		d4.next = d5;
		d5.next = d6;
		d1 = new RemoveDuplicates().removeDup(d1);
		Node cur = d1;
		while (cur != null){
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
	}
}
