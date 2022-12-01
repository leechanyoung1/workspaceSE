
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		AcademyMember[] members = {
				new AcademyStudent(1,"lee", "JAVA"),
				new AcademyStudent(2,"lim", "ANDROID"),
				new AcademyStudent(3,"aim", "DESIGN"),
				new AcademyGangsa(4,"qim", "JAVA"),
				new AcademyGangsa(5,"wim", "ANDROID"),
				new AcademyStaff(6,"eim", "ACCOUNTING"),
				new AcademyStaff(7,"lee", "MARKETING")
		};
		
		AcademyMember[] reciveMembers = members;
		
		
		System.out.println("----------AcademyMember전체출력--------");
		for (int i = 0; i < reciveMembers.length; i++) {
			/*
			 * AcademyStudent,AcademyGangsa,AcademyStaff에서 재정의된 print메쏘드 호출
			 */
			reciveMembers[i].print();
		}
		
		System.out.println("-----------instenceof-----------");
		/*
		 * 연산자-->instenceof
		 * -형태 :참조변수 instenceof 클래스이름
		 * -연산결과:true or false
		 * -ex boolean b = reciveMembers[0] instenceof AcademyStudent;
		 */
		 AcademyMember am = new AcademyStudent(90,"김학생","정보처리");
		 if(am instanceof AcademyStudent) {
			 AcademyStudent tempStudent = (AcademyStudent)am;
			 System.out.println("학생반 :"+tempStudent.getBan());
		 }
		System.out.println("--------AcademyMember배열에 있는 객체들중에서 AcademyStudent객체들만 출력-----------");
		for (int i = 0; i < reciveMembers.length; i++) {
			if(reciveMembers[i] instanceof AcademyStudent ) {
				reciveMembers[i].print();
				AcademyStudent tempStudent =(AcademyStudent)reciveMembers[i];
				System.out.println(tempStudent.getBan());
			}
		}
		System.out.println("--------------------------------------");
		for(AcademyMember am2:reciveMembers) {
			if(am2 instanceof AcademyStudent&&am2.getName().equals("lim")) {
			  AcademyStudent as2 = (AcademyStudent)am2;
			  System.out.println(as2.getBan());
			}
		}
		
		
	}

}
