package cnblogs;
/**
 * @project: oschina
 * @filename: RTTI.java
 * @version: 0.10
 * @author: JM Han
 * @date: 11:00 AM 4/13/2016
 * @comment: Test Purpose
 * @result:
 */

public class RTTI {
	public static void rtti(Object obj){
		//1
		Toy ttoy = (Toy)obj;
		//2
		try {
			Class toy = Class.forName("cnblogs.Toy");
		} catch (ClassNotFoundException e){

		}
		//3
		if (obj instanceof Toy){

		}

	}
	public static void main(String[] args) {
		Toy t = new Toy();
		rtti(t);
	}
}
