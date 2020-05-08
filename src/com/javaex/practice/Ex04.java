package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		// 틀린 곳을 수정하시오.
		/*
		int x, y
		
		x = 10
		y = 20
		
		sum = x + y
		
		System.out.println("합은 ' + sum);"
		*/

		// 수정 후
		int x, y;							// 끝에 마무리 세미콜론 누락
		int sum;							// 아래 x + y 의 변수 sum 에 대한 정의 누락
		
		x = 10;								// 끝에 마무리 세미콜론 누락
		y = 20;								// 끝에 마무리 세미콜론 누락
		
		sum = x + y;						// 끝에 마무리 세미콜론 누락, 변수 정의 누락
		
		System.out.println("합은 "+sum);	// 싱글따음표 -> 더블따음표로 수정

	}

}
