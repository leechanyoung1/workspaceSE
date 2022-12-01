
public class StudentScorePrint {

	public static void main(String[] args) {
		

		int number1, number2;
		String name1, name2;
		int kor1, kor2, eng1, eng2, math1, math2, total1, total2;
		int rank;
		double avg1, avg2;
		char grade,grade1 = 'F';
		
		number1 = 1;
		number2 = 2;
		name1 = "이찬영";
		name2 = "이찬구";
		kor1 = 100;
		kor2 = 77;
		eng1 = 55;
		eng2 = 85;
		math1 = 95;
		math2 = 84;
		rank = 0;

		total1 = (kor1 + eng1 + math1);
		total2 = (kor2 + eng2 + math2);
		avg1 = (double) (total1) / 3;
		avg2 = (double) (total2) / 3;

		if (kor1 < 0 || kor1 > 100) {
			System.out.println("유효하지않습니다.");
			return;
		}else if (kor2 < 0 || kor2 > 100) {
			System.out.println("유효하지않습니다.");
			return;
		}else if(eng1 < 0 || eng1 > 100) {
			System.out.println("유효하지않습니다.");
			return;
		}else if(eng2 < 0 || eng2 > 100) {
			System.out.println("유효하지않습니다.");
			return;
		}else if(math1 < 0 || math1 > 100) {
			System.out.println("유효하지않습니다.");
			return;
		}else if(math2 < 0 || math2 > 100) {
			System.out.println("유효하지않습니다.");
			return;
		}
		
		if (avg1 >= 90) {
			grade = 'A';
		} else if (avg1 >= 80) {
			grade = 'B';
		} else if (avg1 >= 70) {
			grade = 'C';
		} else if (avg1 >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		if (avg2 >= 90) {
			grade1 = 'A';
		} else if (avg2 >= 80) {
			grade1 = 'B';
		} else if (avg2 >= 70) {
			grade1 = 'C';
		} else if (avg2 >= 60) {
			grade1 = 'D';
		} else {
			grade1 = 'F';
		}

		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", number1, name1, kor1, eng1, math1, total1, avg1,grade, rank);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", number2, name2, kor2, eng2, math2, total2, avg2,grade1, rank);
		System.out.printf("-----------------------------------------------%n");

	}

}
