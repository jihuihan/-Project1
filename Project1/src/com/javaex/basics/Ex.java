package com.javaex.basics;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi();//구구단 프로그램 실행
		star();//별 프로그램 실행
	}//ex1구구단 프로그램
	private static void multi() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+ "*"+j+ " = " +i*j);
			}
			
		}
		
	}
	private static void star() {
		for (int i = 1; i < 6; i++) {
			System.out.println("*");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			}
			System.out.println();
		}
	}
	
	
	

