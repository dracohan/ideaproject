package oschina.cc150;

import data.list.linkedlist;
import data.list.linkedlist.Node;
/**
 * @project: oschina
 * @filename: cc0206.java
 * @version: 0.10
 * @author: JM Han
 * @date: 21:42 2015/12/6
 * @comment: Test Purpose
 * @result:
 */

public class cc0206 {
	public static boolean judgeJoined(Node head){
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow)
				return true;
		}
		return false;
	}

	public static Node findJoinedNode(Node head){
		/*
		 * ��ͷ�ڵ㵽�����Ϊk
		 * slow��k��ʱ��fast�Ѿ��ڻ���k���ڵ�
		 * ��ô���پ���loop-k���������ڵ������
		 * ���ԣ����������ڵ�ҲΪk
		 */
		Node slow = head.next;
		Node fast = head.next.next;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}



	public static void main(String[] args) {
		linkedlist lst = new linkedlist();
		Node head = lst.genCycle();
		boolean existS = judgeJoined(head);
		System.out.println(existS);
		int nodeData = findJoinedNode(head).data;
		System.out.println(nodeData);
	}
}
