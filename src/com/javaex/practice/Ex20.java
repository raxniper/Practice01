package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
//		동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요.
//		500원의 개수 :
//		100원의 개수 :
//		50원의 개수 :
//		10원의 개수 :
		
		// 스캐너 정의
		Scanner sc = new Scanner(System.in);
		
		// 동전 변수 정의
		int coin500;
		int coin100;
		int coin50;
		int coin10;
		
		// 입력 : 동전 갯수
		System.out.print("500원의 개수 : ");
		coin500 = sc.nextInt();
		System.out.print("100원의 개수 : ");
		coin100 = sc.nextInt();
		System.out.print("50원의 개수 : ");
		coin50 = sc.nextInt();
		System.out.print("10원의 개수 : ");
		coin10 = sc.nextInt();
		
		// 출력 : 금액 계산
		int cal = (coin500*500)+(coin100*100)+(coin50*50)+(coin10*10);
		System.out.println("총 금액은 : \""+cal+"원\" 입니다.");
		
		// 스캐너 닫기
		sc.close();
	}

}
