package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
//		℉  -> ℃
//		℉ : 화씨 기호		℉ = (℃ * 9/5) + 32
//		℃ : 섭씨 기호		℃ = 5/9 * (℉ - 32)
//		결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.

		
		double f = (double)80.0;
		double c = (double)5/(double)9;
		
		float f2 = 80.0f;
		float c2 = 5/9f;
		
		System.out.println(c);
		System.out.println(c2);
		
		System.out.println(c*(f-(double)32.0));
		System.out.println(c2*(f2-(float)32.0f));
		System.out.println(c2*(f2-32.0));
		
	


	}

}
