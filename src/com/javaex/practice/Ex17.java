package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
//		사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.
//		구의 부피를 구하는 공식
//		V = 4/3 * 3.14 * (r * r * r)
//		V : 구의 부피, pi : 3.14, r : 반지름
		
		// 스캐너 정의
		Scanner sc = new Scanner(System.in);
		
		// 입력 : 반지름
		System.out.print("반지름을 입력하시오 : ");
		float r = sc.nextFloat();
		
		// 정의 : 파이
		float pi = 3.14f;
		
		// 정의 : 4/3
		float cal = 4/3f;
		
		// 출력 : 구의 부피
		float v = (cal*pi)*(r*r*r);
		System.out.println("4/3의 값은 : "+(4/3));
		System.out.println("float형의 4/3의 값은 : "+cal);
		System.out.println("pi의 값은 : "+pi);
		System.out.println("구의 부피는 "+v+" 입니다.");

		// 스캐너 닫기
		sc.close();
	}

}
