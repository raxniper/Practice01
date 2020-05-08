package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		// 아래의 출력 결과를 예상한 후 맞는지 확인해보시오.
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i);	// i = 11; (위에서 i++ 계산이 된 이후에 출력되었으므로)
		System.out.println(n);	// n = 10++ %2 -> 10 % 2 -> 결과는 0 (n이 연산되기 전에는 i는 10이었으므로)

	}

}
