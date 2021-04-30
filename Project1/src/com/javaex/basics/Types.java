package com.javaex.basics;

public class Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void integerTypes()
	{
		//선언
		int intVar1;
		//int intVar2;
		//초기화
		intVar1=2021;
		//intVar2=1234567898990;//크기 초과 에러
		
		System.out.println(intVar1);
		//정수형 데이터의 기본은 int이다.
		long longVar1;
		long longVar2;
		
		longVar1=2021;
		longVar2=1234567890L;//뒤에 L or l Long형임을 알림
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		//2진수,8진수,16진수
		int bin = 0b1101;//0b는 이진수
		int oct = 072;//0은 팔진수
		int hex= 0xFF;//0x 16진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
