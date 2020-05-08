package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
//		사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램을 작성하세요.
//		℉  -> ℃
//		℉ : 화씨 기호		℉ = (℃ * 9/5) + 32
//		℃ : 섭씨 기호		℃ = 5/9 * (℉ - 32)

		// 스캐너 정의
		Scanner sc = new Scanner(System.in);
		
		System.out.print("℉ ? : ");
		double f = sc.nextDouble();
		
		double c = (double)5/9;
		
		double src = (double)32.0;
		
		System.out.println("화씨 "+f+" 의 섭씨온도는 "+(c*(f-src))+" 입니다.");
		
		
		// 스캐너 닫기
		sc.close();

	}

}
