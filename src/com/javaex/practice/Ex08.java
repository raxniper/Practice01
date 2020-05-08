package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		// 다음 중 잘못된 곳을 수정하시오.
//		int x, y = 0;				// x와 y를 모두 0으로 초기화
//		char grade = "A";			// 문자 A를 grade에 대입
//		int salary = 2,000,000;		// salary에 2,000,000을 대입
//		byte n = 1000;				// n에 1000을 대입

		int x = 0;
		int y = 0;					// x와 y를 모두 0으로 초기화
		char grade = 'A';			// 문자 A를 grade에 대입
		int salary = 2000000;		// salary에 2000000을 대입
		//byte n = 1000;			// n에 1000을 대입 : byte는 127까지만 입력가능
		short n = 1000;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(grade);
		System.out.println(salary);
		System.out.println(n);
		
	}

}
