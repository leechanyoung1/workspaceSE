package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student stud1 = new Student();
		stud1.setStudentData(1, "이찬영", 70, 75, 79);
		Student stud2 = new Student(2,"이찬일",70,80,90);
		Student stud3 = new Student(3,"이찬이",90,95,99);
		
	
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		stud1.calculateTotal();
		stud2.calculateTotal();
		stud3.calculateTotal();
		
		stud1.calculateAvg();
		stud2.calculateAvg();
		stud3.calculateAvg();
		
		stud1.calculateGrade();
		stud2.calculateGrade();
		stud3.calculateGrade();
		
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stud1.headerPrint();
		stud1.print();
		stud2.print();
		stud3.print();
		/*
		 * 학생 student1 의 이름변경메쏘드호출후 student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		
		stud1.setName("지미");
		stud1.print();
		stud1.getTot();
		System.out.println(stud1.getTot());
		stud1.getGrade();
		System.out.println(stud1.getGrade());
		
		
		
		
		
	
	}

}