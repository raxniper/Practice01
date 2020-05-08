package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		// 변수 작명 규칙
		// 1. 영문자(대,소문자), 숫자, 특문($, _)만 사용가능
		// 2. 숫자로 시작할 수 없음
		// 3. 예약어 사용 불가능
		
		int num=0;
		
		//int #_of_workers;			// 특문 #은 사용불가능 - $, _만 사용가능
		int $_of_workers;
		
		int countOflettersString;	// 정상
		
		//int 1stLevel1;			// 숫자로 시작할 수 없음
		int stLevel1;
		
		//int person#;				// 특문 #은 사용불가능 - $, _만 사용가능
		int person$;
		
		int _person;				// 정상

	}

}
