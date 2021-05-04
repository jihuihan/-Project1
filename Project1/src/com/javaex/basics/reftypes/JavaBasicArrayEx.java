package com.javaex.basics.reftypes;

import java.util.Scanner;

public class JavaBasicArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1();
		Ex2();
		EX3();
		Ex4();
		}
	public static void Ex4() {
		System.out.println("==========================================================");
		System.out.println("문제 4번입니다.");
		int	count=0;
	    int sum=0;
		int scoreboard[][]= {
				{80,75,90,95,78},
				{92,88,89,92,70},
				{78,80,85,86,63},
				{83,84,89,87,75},
				{89,83,93,94,78},
		};
		 
		for (int i = 0; i < scoreboard.length; i++) {
			for (int j = 0; j < scoreboard.length; j++) {
			//	System.out.println("배열의 행수:"+i+"배열의 열수:"+j);
			//System.out.println(scoreboard[i][j]);
				if(scoreboard[i][j]>=85) {
					count++;
					System.out.print("85점 이상인 점수:"+ scoreboard[i][j]+"\n");
					sum=+scoreboard[i][j];
				}	
			}
		}System.out.println("총"+count+"개 이다.\n"+"총합은"+sum+"이다.\n"+"평균은"+sum/count+"이다.");
		
	
		
		
		
	}
	public static void EX3() {
		char c[]= {'T','h','i','s',' ','i','s',' ', 'a', ' ', 'p','e','n','c','i','l'};
		c[4]=',';
		c[7]=',';
		c[9]=',';
		System.out.print("3번 문제의 답:");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
	}
	public static void Ex2(){//5개의 숫자를 키보드로 입력받아 배열에 저장한 후 평균을 구하여라
		int num[]=new int[5];
		int result=0;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("문제 2번입니다. 숫자를 입력하세요");
		for (int i = 0; i < num.length; i++) {
			int number =scanner.nextInt();
			result=result+number;
			
			
		}System.out.println("5개 입력값의 평균은 "+result/5+"입니다.");
		System.out.println("==========================================================");
		
	}
	
	
	public static void Ex1() {
		int data[]= {1,2,3,5,8,9,11,15,19,18,20,30,33,31};
		int sum=0;
		int count=0;
		for (int i = 0; i < data.length; i++) {
			if((data[i]%3==0)) {
				count++;
				System.out.println(+count+"번째 3의 배수는:"+data[i]);
				sum=sum+data[i];
			}
		}	System.out.println("\n3의 배수의 합은:"+sum);
		
		System.out.println("==========================================================");
		
	}

}
