/*
		논리연산자
		   - 형태:   ||(Logical OR)논리합 , && (Logical AND)논리곱 ( |,& )
		   - 좌우측의항이 논리형변수(데이타)이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false

		*/

public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1,b2,b3,b4;
		boolean result;
		b1=true;
		b2=true;
		b3=false;
		b4=false;
		/*
		 *논리합 (Logical OR)||
		 *---->false||false 인경우에만 false 반환
		 */
		result = b1||b2;
		System.out.println(result);
		result = b1||b3;
		System.out.println(result);
		result = b3||b1;
		System.out.println(result);
		result = b3||b4;
		System.out.println(result);
		/*
		 * 논리곱(Logical AND) &&
		 * ---> true||true 인경우에만 true
		 */
		result = b1&&b2;
		System.out.println(result);
		result = b1&&b3;
		System.out.println(result);
		result = b3&&b1;
		System.out.println(result);
		result = b3&&b4;
		System.out.println(result);
		
		int kor=99;
		int eng=67;
		
		/*
		 *kor점수의 유효성체크 [0~100사이의 점수]
		 */
		boolean condition1 = kor>=0;
		boolean condition2 = kor<=100;
		boolean isvalidscore = condition1&&condition2;
		System.out.println("국어점수 유효점수여부   "+isvalidscore);
		
		boolean condition3 = kor>=90;
		boolean condition4 = eng>=90;
		System.out.println("---A대학 국어점수가 90점이상이거나 혹은 영어점수가90점 이상이면 합격");
		boolean ispass1 = condition3||condition4;//boolean ispass1 = kor>=90||eng>=90;
		System.out.println("A대학합격여부  "+ispass1);
		
		System.out.println("---B대학 국어,영어점수가90점 이상이면 합격");
		boolean ispass2 = condition3&&condition4;
		System.out.println("B대학합격여부  "+ispass2);
		
		int math=89;
		
		boolean isvalidmathscore = (math>=0) && (math<=100);
		System.out.println("수학점수의 유효성여부  "+isvalidmathscore);
		boolean isinvalidmathscore = math<0 || math>100;
		System.out.println("수학점수의 유효하지않은지여부 "+isinvalidmathscore);
		System.out.println("-----배수판별-----");
		
		int number=12;
		
		boolean ismultiple3 = number%3 ==0;
		System.out.println(ismultiple3);
		boolean ismultiple4 = number%4 ==0;
		System.out.println(ismultiple4);
		
		boolean ismultiple34= ismultiple3 && ismultiple4;
		System.out.println(ismultiple34);
		
		int year=2028;
		boolean isleapyear = year%4 ==0 || year%100==0 && year%400==0 ;
		System.out.println(year+"의 윤년여부  "+isleapyear);
		
		
		System.out.println("------문자연산-------");
		char c = '가';
		
		boolean ishangul =(c>= '가') && (c<='힣');
		System.out.println(ishangul);
		
		

		
		
		
	}

}
