package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
//		원화를 달러화로 계산하는 프로그램을 작성하세요.(환율 1달러 = 1230.95원 상수로 지정)
		
		// 스캐너 정의
		Scanner sc = new Scanner(System.in);
		
		// 변수 정의
		final double exchange = 1230.95;
		int kMoney;
		
		// 원화 입력
		System.out.println("환전하실 원화 금액을 입력하세요.");
		System.out.print("원화금액 : ");
		kMoney = sc.nextInt();

		// 환율 계산 출력
		System.out.println("환전 받으실 달러는 \""+kMoney/exchange+" $\"입니다.");
		
		// 스캐너 닫기
		sc.close();
	}

}
