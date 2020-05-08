package com.javaex.practice;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
//		마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 마일? : ");
		double mile = sc.nextDouble();
		
		final double km = 1.609;
		
		System.out.println(mile+"마일은 "+(mile*km)+"km 입니다.");
		
		
		sc.close();
		

	}

}