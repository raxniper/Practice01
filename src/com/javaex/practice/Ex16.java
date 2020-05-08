package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
//		상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요.
//		상품가격 : 7500;
//		받은 돈 : 10000;
//		==========================
//		받은 돈 : 10000.0
//		상품가격 : 7500.0
//		부가세 : 750.0
//		잔액 : 2500.0
		
		Scanner sc = new Scanner(System.in);
		
		// 입력 : 상품가격
		System.out.print("상품가격은 : ");
		float price = sc.nextFloat();
		
		// 입력 : 받은 돈
		System.out.print("받은 돈은 : ");
		float pushMny = sc.nextFloat();
		
		// 출력 : 받은 돈
		System.out.println("==========================");
		System.out.println("받은 돈 : "+pushMny);
		
		// 출력 : 상품가격
		System.out.println("상품가격 : "+price);
		
		// 출력 : 부가세
		float tax = price*0.10f;
		System.out.println("부가세 : "+tax);
		
		// 출력 : 잔액
		System.out.println("잔액 : "+(pushMny-price));
		
		
		// 스캐너 닫기
		sc.close();

	}

}
