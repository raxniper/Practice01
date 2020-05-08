package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		// 아래의 출력 결과를 예상한 후 맞는지 확인해보시오.
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);	// i = 11 (출력되기 이전에 이미 ++i 연산이 이루어지면서 1이 더해졌으므로)
		System.out.println(n);	// n = 1 (n연산식이 실행되기 이전에 ++i는 11이 되었으며, 11 % 2는 1 이므로)

	}

}
