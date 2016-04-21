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
	public B(int i, int j, int k){
		super(i, j , k);
	}
}
public class c3_p124access {
	public static void main(String[] args) {
		B b = new B(1,2,3);
		System.out.println(b.y);
	}
}
