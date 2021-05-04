package com.javaex.basics.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enumBasic();
		enumBasic()
;	}
	
	public static void enumEx() {
		//ConditionalEx.switch()->enum버전
		Week week= Week.Tuseday;
		
	}
	public static void enumBasic() {
		//enum의 메서드들
		Week today= Week.Tuseday;
		System.out.printf("Today is %s(%d)%n",
				today.name(),
				today.ordinal());
		
		String daystr="Friday";
		Week other =Week.valueOf(daystr);//문자열에서 열거 상수로 변환
		
		System.out.printf("Other is %s(%d)%n",
				other.name(),
				other.ordinal());
		
		//순번비교
		int diff=today.compareTo(other);
		System.out.println("today의 other순번지:"+diff);
		
	}

}
