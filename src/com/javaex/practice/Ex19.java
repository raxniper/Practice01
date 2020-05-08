package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
//		long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
//		(단 빛의 속도는 300000 km/s 로 계산한다)
//		1분 : 60 초
//		1시간 : 3600 초
//		1일 : 86500 초
//		365일 : 31536000‬ 초
//
//		빛의 속도 300000 km/s

		long yearSec = 31536000l;
		long lightSpeed = 300000l;
		
		System.out.println("1년동안 빛이 이동하는 거리는 : "+(yearSec * lightSpeed)+" km입니다.");
		
	}

}
