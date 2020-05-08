package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" + a);		// 예상 : a = 4 (++1 즉 2 * 2 = 4)
		System.out.println("b=" + b);		// 예상 : b++ (1++ 즉 1 * 2 = 2)
		System.out.println("x=" + x);		// 예상 : x = 2 (a를 계산하기 전에 ++이 되어 2가 됬으므로)
		System.out.println("y=" + y);		// 예상 : y = 2 (b를 계산한 후에 ++ 이 되어 2가 됬으므로)

	}

}
