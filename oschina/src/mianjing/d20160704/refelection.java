package mianjing.d20160704;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @project: oschina
 * @filename: refelection.java
 * @version: 0.10
 * @author: JM Han
 * @date: 4:51 PM 7/4/2016
 * @comment: Test Purpose
 * @result:
 */
class MyClass{
	public String s1;
	protected String s2;
	private String s3;

	MyClass(){
		System.out.println("Default Constructor");
	}
	MyClass(int x){
		System.out.println("Constructor with int arg");
	}

	public void func1(){
		System.out.println("publicFunc()");
	};
	protected void func2(){
		System.out.println("protectedFunc()");
	};
	private void func3(){
		System.out.println("privateFunc()");
	};
}

class MySecondClass extends MyClass{

}

public class refelection {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		MyClass m = new MyClass();
		Field[] f = m.getClass().getDeclaredFields();
		for(Field field:f)
			System.out.println(field);

		Constructor[] c = m.getClass().getDeclaredConstructors();
		for(Constructor constructor:c)
			System.out.println(constructor);

		Method meth = m.getClass().getDeclaredMethod("func3");
		//如果不设置，就会抛出IllegalAccessException异常
		meth.setAccessible(true);
		meth.invoke(m);
	}
}
