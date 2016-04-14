package mianjing;
/**
 * @project: oschina
 * @filename: RefTest.java
 * @version: 0.10
 * @author: JM Han
 * @date: 3:18 PM 4/14/2016
 * @comment: Test Purpose
 * @result:
 */

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class RefTest {
	public static void main(String args[]){
		String s1 = new String("abc");
		String s2 = new String("def");
		String s3 = new String("hij");

		ReferenceQueue<String> wrq = new ReferenceQueue<String>();
		WeakReference<String> ws = new WeakReference<String>(s1, wrq);

		ReferenceQueue<String> srq = new ReferenceQueue<String>();
		SoftReference<String> ss = new SoftReference<String>(s2, srq);

		ReferenceQueue<String> prq = new ReferenceQueue<String>();
		PhantomReference<String> ps = new PhantomReference<String>(s3, prq);

		System.out.println("ps = " + ps.get());

		s1 = null;
		s2 = null;
		s3 = null;

		System.gc();

		System.out.println("ss = " + ss.get());
		System.out.println("srq = " + srq.poll());
		System.out.println("ws = " + ws.get());
		System.out.println("srq = " + wrq.poll());
		System.out.println("ps = " + ps.get());
		System.out.println("prq = " + prq.poll());
	}
}
