package com.javaex.basics.reftypes;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringBasics();
		stringFormatEx();
	}
	private static void stringFormatEx() {
		//형식화돤 문자열
		//%s문자열,%d 함수,%f 실수,%n 개행,%%(%) 
		String food="사과";
		int total =10;
		int eat= 3;
		
		System.out.println(total+"개의"+food+"중에서"+eat+"개를 먹었다");
	//	System.out.println(total,food,eat);
		
		float rate=1.234f;
		//현재 이자율은 %입니다.
		System.out.println(rate);
		
		String fmt="%개의 %s중에서 %d개를 먹었다 %n";
		String result=String.format(fmt, 5,"바나나",2);
		System.out.println(result);
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
