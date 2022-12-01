
public class AcademyMemberOverridingArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyGangsa[] gangsas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0] = new AcademyStudent(1, "kim", "java");
		students[1] = new AcademyStudent(2, "lim", "android");
		students[2] = new AcademyStudent(3, "sim", "ios");
		
		
		gangsas[0] = new AcademyGangsa(3, "김강사", "웹디자인");
		gangsas[1] = new AcademyGangsa(4, "이강사", "오피스");
		
		staffs[0] = new AcademyStaff(5, "영구", "홍보부");
		staffs[1] = new AcademyStaff(6, "삼구", "총무부");

		System.out.println("-------------AcademyMember 전체출력");
		System.out.println("---------------Students--------------");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		System.out.println("---------------Gangsa--------------");
		for(AcademyGangsa gangsa:gangsas) {
			gangsa.print();
		}
		System.out.println("---------------Staff--------------");
		for(AcademyStaff staff:staffs) {
			staff.print();
		}
		
		
	}

}
