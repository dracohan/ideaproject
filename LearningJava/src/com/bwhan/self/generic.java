package self;

import java.util.ArrayList;

/**
 * @project: LearningJava
 * @filename: generic.java
 * @version: 0.10
 * @author: JM Han
 * @date: 5:17 PM 5/5/2016
 * @comment: Test Purpose
 * @result:
 */
class Apple{

}
class Orange{

}
public class generic {
	public static void main(String[] args) {
			ArrayList apples = new ArrayList();
			for (int i = 0; i < 3; i++) {
				apples.add(new Apple());
			}
			apples.add(new Orange());
			for (int i = 0; i < apples.size(); i++) {
				// java.lang.ClassCastException: Orange cannot be cast to Apple
				apples.get(i);
			}
	}
}
