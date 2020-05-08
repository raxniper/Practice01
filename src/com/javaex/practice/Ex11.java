package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
//		월급을 입력받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요.
//		월급을 입력하세요 : 200
//		10년동안 최대 저축액은 24000원 입니다.
		
		// 월급을 입력하세요 : 문구 출력
		System.out.print("월급을 입력하세요 : ");
		
		// 입력 변수 정의 및 설정
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int totalMoney = money*12*10;
		
		// "10년동안 최대 저축액은 " + 변수 + "원 입니다." 결과물 출력
		System.out.println("10년동안 최대 저축액은 "+totalMoney+"원 입니다.");
		
		// 키보드 닫기
		sc.close();
	}

}
