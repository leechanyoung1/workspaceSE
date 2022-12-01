package com.itwill01.method;



public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stud1 = new Student();
		Student stud2 = new Student();
		Student stud3 = new Student();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 대입메쏘드호출(3명)
		 */
		stud1.setStudent(1,"이찬영",90,95,90);
		stud2.setStudent(2,"이찬일",80,85,88);
		stud3.setStudent(3,"이찬이",75,70,77);
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		stud1.tot(90, 95, 90);
		stud2.tot(80, 85, 88);
		stud3.tot(75, 70, 77);
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stud1.avg(90, 95, 90);
		stud2.avg(80, 85, 88);
		stud3.avg(75, 70, 77);
		
		
		stud1.grade(stud1.avg);
		stud2.grade(stud2.avg);
		stud3.grade(stud3.avg);
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		stud1.headerPrint();
		stud1.print();
		stud2.print();
		stud3.print();
		
	}

}