package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
//		반지름을 입력받아 원의 면적을 구하는 프로그램을 작성하세요. (파이값은 3.14로 상수로 지정)
		
		// 입력받을 변수 정의
			Scanner sc = new Scanner(System.in);
			float r;
		
		// 파이 변수 정의
			final double s = 3.14;
		
		// 반지름 입력받는 질문
			System.out.print("반지름을 입력하세요 : ");
			r = sc.nextFloat();
			
		// 원의 면적 출력
			System.out.println(s*(r*r));
		
		// 스캐너 닫기
			sc.close();
	}

}
