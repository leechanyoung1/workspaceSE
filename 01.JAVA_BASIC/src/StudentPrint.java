

public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1.성적관리에서 학생2명 데이타를 담을 변수선언
		        - << 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점, 석차 >>
		 * 	- 번호(int), 이름(String), 국어, 영어, 수학, 총점, 평균(double), 평점(A,B,C)(char), 석차(int)
		 */
		int number1,number2;
		String name1,name2;
		int kor1,kor2,eng1,eng2,math1,math2,total1,total2;
		double avg1,avg2;
		char grade;
		int rank;
		
		
		number1 = 1;
		number2 = 2;
		name1="이찬영";
		name2="이찬구";
		kor1=42;
		kor2=45;
		eng1=56;
		eng2=53;
		math1=78;
		math2=76;
		
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		avg1=(double)(kor1+eng1+math1)/3;
		avg2=(double)(kor2+eng2+math2)/3;
		grade='F';
		rank=0;
		
		
	
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");//%.1f
		System.out.printf("%d    %s   %s   %s   %s  %d  %.1f   %c    %d\n",number1,name1,kor1,eng1,math1,total1,avg1,grade,rank);
		System.out.printf("%d    %s   %s   %s   %s  %d  %.1f   %c    %d\n",number2,name2,kor2,eng2,math2,total2,avg2,grade,rank);
		System.out.println("-----------------------------------------------");
		
		
		
	}

}

