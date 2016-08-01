package self;

import lib.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

/**
 * @project: ThinkingInJava
 * @filename: Iterator.java
 * @version: 0.10
 * @author: JM Han
 * @date: 15:19 2016/7/18
 * @comment: Purpose
 * @result:
 */

public class Iterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()){
			System.out.print(listIterator.next() + "|");
		}

		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
	}
}
