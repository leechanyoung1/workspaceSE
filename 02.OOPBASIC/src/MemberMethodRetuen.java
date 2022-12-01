
public class MemberMethodRetuen {
	/*
	 * 멤버필드
	 * -멤버필드선언시 값을대입할수있다.
	 */
	int memberField1=10;
	int memberField2=20;
	int memberField3=30;
	/*
	 * setter method
	 */
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}

	void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}

	void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}
	/*
	 * getter method
	 */
	
	
	int getMemberField1() {
		return memberField1;
	}

	int getMemberField2() {
		return memberField2;
	}

	int getMemberField3() {
		return memberField3;
	}



	/*
	 * 멤법메쏘드
	 */
	int method1() {
		System.out.println("\t--int method1()실행---");
		int result = 14895152+51512;
		System.out.println("\t--int method1()실행종료후 int 데이터반환---");
		/*
		 * return<<호출한 클래스(객체)에게 반환할값(변수,리터럴,연산의결과)>>;
		 * -호출한곳으로 실행흐름을 반환
		 * -호출한곳으로 데이터를 반환
		 * -반환할 데이터가 없는경우에는(void) return문 생략이 가능하다.
		 * -반환할 데이터가 있는경우에는(int...) return문 반드시 기술하여야한다.
		 */
		return result;
	}
	
	boolean method2() {
		System.out.println("\t--boolean method2()실행---");
		boolean isMarried= false;
		System.out.println("\t--boolean method2()종료후 boolean데이터반환---");
		return isMarried;
	}
	/*
	 * 두개의 정수를 파라메타로 받아서 더한결과(정수)를 반환하는 메소드
	 */
	int add(int a,int b) {
		System.out.println("----int add(int a,int b)----실행");
		int result = a+b;
		System.out.println("----int add(int a,int b)----종료후반환");
		return result;
	}
	/*
	 * 이름을 매개변수로 입력받아서 인사말을 만들어서 문자열로반환
	 */

	 String hello(String name) {
		String msg="";
		msg=name+"님 안녕하세요!";
		return msg;
	}
	
	
	
	
	
	
}