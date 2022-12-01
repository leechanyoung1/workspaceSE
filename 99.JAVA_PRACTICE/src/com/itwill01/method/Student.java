package com.itwill01.method;

/*
  #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
 */
public class Student {

	/*
	 * << 속성(멤버변수)   >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능(멤버메쏘드) >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	// 멤버변수 선언
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	char grade;
	int rank;
	
	
	// 멤버메쏘드 선언
	/*
	 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
	 */
	void setStudent(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng= eng;
		this.math = math;

	}
	/*
	 * 총점계산메쏘드
	 */
	void tot(int kor,int eng,int math) {
		this.tot=kor+eng+math;
		
	}
	/*
	 * 평균계산메쏘드
	 */
	void avg(int kor,int eng,int math) {
		this.avg = (double)(kor+eng+math)/3;
		
		
	}
	void grade(double avg) {
		
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80) {
			grade = 'B';
		}else if(avg>=70) {
			grade = 'C';
		}else if(avg>=60) {
			grade = 'D';
		}else {
		 grade='F';	
		}
		
	}
	
	
	/*
	 * 출력메쏘드
	 */
	void headerPrint() {
		System.out.println("--------------------------------------------------------");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.println("--------------------------------------------------------");
	}
	
	void print() {
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",no,name,kor,eng,math,this.tot,this.avg,this.grade,rank);
	}
	
}