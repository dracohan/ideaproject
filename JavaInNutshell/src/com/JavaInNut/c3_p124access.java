package com.JavaInNut;
/**
 * @project: inteliJ
 * @filename: c3_p124.java
 * @version: 0.10
 * @author: JM Han
 * @date: 3:26 PM 4/21/2016
 * @comment: Test Purpose
 * @result:
 */

class A{
	public int x;
	protected int y;
	private int z;
	public A(int i, int j, int k){
		x = i;
		y = j;
		z = k;
	}

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getZ(){
		return z;
	}

}

class B extends A{
	private int z;
	public B(int i, int j, int k){
		super(i, j , k);
		z=4;
	}
	public void getZZ(){
		System.out.println("z:" + z);
	}
	public B(A b){
		//class method could access protected field
		super(b.x, b.y, 0);
		System.out.println(y);
	}
}
public class c3_p124access {
	public static void main(String[] args) {
		B b1 = new B(1,2,3);
		//B b2 = new B(b1);
		//object could access protected field
		System.out.println(b1.y);
		b1.getZZ();
		//System.out.println(b2.y);
	}
}
