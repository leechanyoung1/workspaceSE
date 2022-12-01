
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		/*
		 * encapsulation객체멤버 데이터대입
		 * The field Encapsulation.memberField1 is not visible.
		 */
//		encapsulation.memberField1=11;
//		encapsulation.memberField2=true;
//		encapsulation.memberField3='A';
//		encapsulation.memberField4=3.24;
		
		encapsulation.setMemberField1(11);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('A');
		encapsulation.setMemberField4(3.24);
		
		/*
		 * encapsulation객체멤버 데이터출력
		 * The field Encapsulation.memberField1 is not visible.
		 */
		
		/*System.out.println(encapsulation.setMemberField1);
		System.out.println(encapsulation.setMemberField2);
		System.out.println(encapsulation.setMemberField3);
		System.out.println(encapsulation.setMemberField4);
		*/
		
		
		System.out.println(encapsulation.getMemberField1());
		System.out.println(encapsulation.getMemberField2());
		System.out.println(encapsulation.getMemberField3());
		System.out.println(encapsulation.getMemberField4());
		
		
		
		
		
	}

}
