package linkedlist;
/**
 * Sort a linked list by insertion sort
 * @author Hu
 *
  * class Node {
 *		Node next;
 *		int val;
 *		Node (int val){
 * 			this.val = val;
 *		}
 *	}
 */

public class InsertionSortList {
	public Node sort (Node head){
		Node minHead = new Node(Integer.MIN_VALUE); //build a fake head
		Node cur = head;		
		while(cur != null){
			Node prev = minHead;
			Node next = cur.next;
			
			while(prev.next != null && cur.val > prev.next.val){
				prev = prev.next;
			}
			cur.next = prev.next;
			prev.next = cur;			
			cur = next;
		}
		return minHead.next;
	}
	public static void main (String[] args){
		Node d1 = new Node(6);
		Node d2 = new Node(5);
		Node d3 = new Node(3);
		Node d4 = new Node(3);
		Node d5 = new Node(2);
		Node d6 = new Node(1);
		d1.next = d2;
		d2.next = d3;
		d3.next = d4;
		d4.next = d5;
		d5.next = d6;
		Node cur = new InsertionSortList().sort(d1);
		while (cur != null){
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
	}
}
