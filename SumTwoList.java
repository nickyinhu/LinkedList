package linkedlist;

/**
 * Adds the two numbers presented by two linked list, and returns result as a linked list
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
public class SumTwoList {
	public Node add (Node n1, Node n2){
		Node head = new Node(0);
		Node cur = head;
		int carry = 0;
		while (n1 != null || n2 != null){
			if( n1 != null){
				carry += n1.val;
				n1 = n1.next;
			}
			if(n2 != null){
				carry += n2.val;
				n2=n2.next;
			}
			cur.val = carry%10;
			carry = (int) carry/10;
			if(n1 != null || n2 != null){     //if a new node is needed to build
				cur.next = new Node(0);
				cur = cur.next;
			}
		}
		return head;
	}
	
	public static void main (String[] args){
		Node a1 = new Node(6);
		Node a2 = new Node(5);
		Node a3 = new Node(4);
		Node a4 = new Node(4);
		Node a5 = new Node(1);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		
		Node b1 = new Node(6);
		Node b2 = new Node(6);
		Node b3 = new Node(1);
		b1.next = b2;
		b2.next = b3;
		Node cur = new SumTwoList().add(a1,b1);
		Node n1 = a1;
		Node n2 = b1;
		while (n1 != null){
			System.out.print(n1.val + " ");
			n1 = n1.next;
		}
		System.out.println();
		while (n2 != null){
			System.out.print(n2.val + " ");
			n2 = n2.next;
		}
		System.out.println();
		while (cur != null){
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
	}
}
