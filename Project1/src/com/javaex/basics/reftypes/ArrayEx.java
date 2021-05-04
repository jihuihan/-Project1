package com.javaex.basics.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayBasic();
	//	multiDimArray();
	//	arrayCopyFor();
		arrayCopySystem();
	}	
	private static void arrayCopySystem() {
		int source[]= {1,2,3,};
		int target[]=new int[10];
		
		System.arraycopy(source, 0, target, 3, source.length);//원본 배열의 식별자,//복사 시작 인덱스(원본배열의), 복사 대상 배열,복사 시작 인덱스(대상배열의),복사열 길이
		
		//출력
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i]+"\t");
			
		}System.out.println();
	}
	private static void arrayCopyFor(){
		//배열은 크기 변경이 안된다.
		//새 배열을 생성->복사
		int source[] = {1,2,3};
		int target[]=new int[10];
		
		for (int i = 0; i < source.length; i++) {
			//복사
			target[i]=source[i];
		}
		for(int i=0;i<target.length;i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		//enhanced for: 순차 객체로부터 값을 하나씩 추출하여 할당
		for(int value:target) {
			System.out.println(value+"\t");
			
		}System.out.println();
	}
	private static void multiDimArray() {
		//2차원 배열 new type[행수][열수]
		//3차원 배열 	new type[면][행수][열수]
		int table[][]= {
				{1,2,3,4,5,6,7,8,9,0},
				{2,3,4,5,6,7,8,9,0,1},
				{3,4,5,6,7,8,9,0,1,2},
				{4,5,6,7,8,9,0,1,2,3},
				{5,6,7,8,9,0,1,2,3,4}
		};//배열의 배열
		
		System.out.println("table 배열의 행수"+table.length);
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				System.out.println(table[row][col]+"\t");
			}
			System.out.println();
			//score2변경
			scores[2]=100;
			for (int i = 0; i < scores.length; i++) {
				System.out.println(scores[i]+"\t");
				
			}
		}
	}
	private static void arrayBasic() {
		//선언과 초기화, 사용
		String[] names;//Type[]
		int scores[];//식별자[]
		
		//초기화
		names = new String[] {
				"홍길동",
				"장길산",
				"전우치",
				"임꺽정"
		};
		//배열생성
		scores = new int[4];
		//인덱스를 이용한 접근 0~
		scores[0]=80;
		scores[1]=90;
		scores[2]=85;
		scores[3]=88;
		//scores[4]=100;
		
		//값 목록이 있을 경우
		float heights[]= {
				175.3f,
				178.2f,
				165.3f,
				188
		};
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s(%.2f):score =%d%n",
					names[i],
					heights[i],
					scores[i]);
					
		}
		//주의
		int scores2[]=scores;//참조 복사-> 유의
		System.out.println("scores==score2:"+(scores==scores2));
		//두 객체는 같은 객체다.(같은 주소를 가리키고 있다)
		//scroes ->내용확인
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]+"\t");
		}
		System.out.println();
		
		scores2[2]=100;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]+"\t");
		}
	}
}
