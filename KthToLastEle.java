package linkedlist;

/**
 * Find the kth to last element of a singly linked list
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

public class KthToLastEle {
	public Node find(Node head, int k){
		Node cur = head;
		Node runner = head;
		while(k>0){
			if(runner == null) return null;
			runner = runner.next;
			k--;
		}
		while (runner !=null){
			cur = cur.next;
			runner = runner.next;
		}
		return cur;
	}
	
	public static void main (String[] args){
		Node d1 = new Node(6);
		Node d2 = new Node(5);
		Node d3 = new Node(4);
		Node d4 = new Node(3);
		Node d5 = new Node(2);
		Node d6 = new Node(1);
		d1.next = d2;
		d2.next = d3;
		d3.next = d4;
		d4.next = d5;
		d5.next = d6;
		Node node = new KthToLastEle().find(d1, 3);
		System.out.println(node.val);
	}
}
