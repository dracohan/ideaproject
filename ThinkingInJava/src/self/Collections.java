package self;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @project: ThinkingInJava
 * @filename: Collections.java
 * @version: 0.10
 * @author: JM Han
 * @date: 16:53 2016/7/16
 * @comment: Test collections usage
 * @result:
 */

public class Collections {
	public static void print(Iterator iterator){
		while(iterator.hasNext()){
			System.out.println("element: " + iterator.next());
		}
	}
	public static void main(String[] args) {
		//add
		Collection collection = new ArrayList();
		collection.add(1);
		collection.add(2);
		collection.add(3);
		System.out.println("collection:");
		print(collection.iterator());

		//addAll
		Collection collection1 = new LinkedList();
		collection1.addAll(collection);
		collection1.addAll(collection);
		System.out.println("collection1:");
		print(collection1.iterator());

		//clear
		//collection1.clear();
		System.out.println("collection1:");
		print(collection1.iterator());

		//remove
		collection.add(3);
		collection.add(4);
		System.out.println("collection:");
		print(collection.iterator());
		boolean b = collection1.removeAll(collection);
		if(b){
			System.out.println("collection after remove:");
			print(collection.iterator());
		}

		//size
		System.out.println(collection1.size());


		//iterator
		Iterator iterator = collection.iterator();

		//contain
		System.out.println("test");
		print(collection.iterator());
		System.out.println(collection.contains(1));
	}
}
