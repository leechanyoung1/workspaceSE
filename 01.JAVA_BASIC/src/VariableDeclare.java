	/*
		 값(데이타)
			- 문자  : 김 , A , z
			- 문자열: "김경호", "JAMES" , "Student"
			- 숫자  : 1, 2 , 3 , 3.14159
		 */
		/*
		변수의선언
           	   - 의미:JVM 에게메모리를할당해달라고 요청하는작업
		   - 형태:
		        데이타타입 이름(식별자);
		         ex> int number;


		   - 변수식별자규직(클래스이름,변수이름,메쏘드이름)
			   - 영문이나,한글로시작
			   - 특수문자사용불가(_,$ 는 사용가능)
			   - 키워드 사용금지
		*/
		
public class VariableDeclare {

	public static void main(String[] args) {
		int score; //변수선언
		score=77;  //변수에 값(정수형리터럴)을 대입
		System.out.println(score);//변수값 출력
		score=89;  //변수값대입 기존값 77이 89로 변경
		System.out.println(score);//변수값 출력
		int score1=95;
		System.out.println(score1);	
		score1=100;
		System.out.println(score1);	
		
		int _number=333;
		System.out.println(_number);
		
		int kor,eng,math;
		kor=98;
		eng=89;
		math=99;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		/*
		<<Duplicate local variable kor>>
		int kor=99;
		<<history cannot be resolved to a variable>>
		history=100;
		*/
		
		/*
		int 7up;
		int my-score;
		int your#score;
		*/
		
		String name;
		name="이찬영";
		System.out.println(name);
		
		
	}

}
