package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringBasics();
	}
	private static void stringBasics(){
		//문자열 선언
		String str;//선언
		str="Java";//할당 리터럴(소스코드에 직접 입력한 것)
		String str2="Java";
		String str3=new String("java");//새 객체
		
		//리터럴과 리터럴
		System.out.println("str==str2?"+(str == str2));
		//리터럴과 뉴 스트링
		System.out.println("str==str3"+(str == str3));
		//참조 변수의 값이 같은지를 비교 equals
		System.out.println("str과 str2가 내용이 같은가?"+str.equals(str2));
		System.out.println("str과 str3가 내용이 같은가?"+str.equals(str3));
	}

}
