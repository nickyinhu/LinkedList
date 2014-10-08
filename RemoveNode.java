package linkedlist;

/**
 * Remove a given node in a linked list
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


public class RemoveNode {
	public void remove (Node node){
		if(node == null || node.next == null){
			return;
		}
		node.val = node.next.val;
		node.next = node.next.next;
	}
	public static void main (String[] args){
		Node d1 = new Node(1);
		Node d2 = new Node(2);
		Node d3 = new Node(3);
		Node d4 = new Node(4);
		Node d5 = new Node(5);
		Node d6 = new Node(6);
		d1.next = d2;
		d2.next = d3;
		d3.next = d4;
		d4.next = d5;
		d5.next = d6;
		new RemoveNode().remove(d3);
		Node cur = d1;
		while (cur != null){
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
	}
}
