
public class MemberMethod {

	int member1;
	
   	void method1(){
		System.out.println("\t-----void method1()실행시작------");
		System.out.println("\t method stmt1");
		System.out.println("\t method stmt2");
		System.out.println("\t-----void method1()실행끝------");
		/*
		 * << return >>
		   - 모든 메쏘드블록의 마지막에는 항상 실행흐름을 호출한곳으로 반환하여야한다.
		   - 실행흐름을 반환하는 문장이 return문이다.
		   - return 문을 만나면 실행흐름이 호출한곳으로 반환된다.
		   - return type이 void 인경우에는 생략이 가능하다.
		   - return문이 생략된경우에는 컴파일러가 자동으로 return문을 삽입하여준다.
		 */
		return;
	}
	void method2() {
		System.out.println("\t---void method2()----실행");
		System.out.println("\t method2 stmt1");
		System.out.println("\t method2 stmt2");
		System.out.println("\t---void method2()----실행종료");
		return;
	}
	/***********매개변수가 있는 메쏘드의 정의**********/
	void method3(int count) {
		System.out.println("\t---------void method3(int count)------실행---");
		int localvar=111;
		System.out.println("\t method3메쏘드블록안에서 선언된 로칼변수"+localvar);
		for(int i=0;i<count;i++) {
		System.out.println("\t void method3(int count)실행: 파라메타(매개변수) count값->"+count);
		}
		System.out.println("\t---------void method3(int count)------실행종료후 반환---");
		return;
	}
	 void method4(String msg, int count) {
		System.out.println("\t void method4(String msg,int count)---실행");
		for (int i = 0; i < count; i++) {
			System.out.println("\t\t"+msg);
		}
		System.out.println("\t void method4(String msg,int count)---종료후실행흐름반환");
		
	}
	 void method5(String msg1, String msg2, int count) {
		 System.out.println("String msg1, String msg2, int count)---실행");
		for (int i = 0; i < count; i++) {
			System.out.println("\t\t"+msg1+"을 "+msg2);
			System.out.printf("%s님 %s !\n",msg1,msg2);
		}
		System.out.println("String msg1, String msg2, int count---종료후실행흐름반환");
	}
	
	
	
}
