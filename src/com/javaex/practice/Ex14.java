package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
//		직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(가로 세로 변수 double형으로 작성)
		
		Scanner sc = new Scanner(System.in);
		double width, height, gth, ext;	// girth : 둘레, extent : 너비
		
		System.out.print("직사각형의 너비는 : ");
		width = sc.nextDouble();
		
		System.out.print("직사각형의 높이는 : ");
		height = sc.nextDouble();
		
		gth = (width + height)*2;
		ext = width*height;
		
		System.out.println("직사각형의 둘레는 : "+gth+"㎝ 입니다.");
		System.out.println("직사각형의 면적은 : "+ext+"㎠ 입니다.");
		
		sc.close();

	}

}
