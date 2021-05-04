package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dowhileEx();
	}
	private static void dowhileEx() {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		int dan =scanner.nextInt();
		
		//for(제어변수초기화;반복조건체크;증감식)
		for (int num  = 1; 1 < 9; num++) {
			System.out.println(dan+ "+" +num);
		}//scanner.close();

	}
	
}
