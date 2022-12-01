package com.itwill99.review;

public class MemberMethodReturnMain {
	public static void main(String[] args) {
		/*
		 * MemberMethodReturn 객체생성
		 */
		MemberMethodReturn mmr=
				new MemberMethodReturn();
		
		/*
		 MemberMethodReturn객체의  method1 호출후 반환데이타받아서 출력
		 */
		int result1 = mmr.method1();
		System.out.println(result1);
		/*
		 MemberMethodReturn객체의  method2 호출후 반환데이타받아서 출력
		 */
		boolean result2  =mmr.method2();
		System.out.println(result2);
		
		/*
		 MemberMethodReturn객체의 add메쏘드를 정수인자 두개를 넣어서 호출후 
		 반환되는 정수데이타받아서 출력
		 */
		int result3 =mmr.add(10, 20);
		System.out.println(result3);
		/*
		 MemberMethodReturn객체의 hello 메쏘드를 문자열인자 한개 넣어서 호출후 
		 반환되는 문자열데이타받아서 출력
		 */
		String result4 = mmr.hello("홍길동");
		System.out.println(result4);
	
	}
}
