
public class MemberMethodThisMain {

	public static void main(String[] args) {
		
		MemberMethodThis mmt1 = new MemberMethodThis();
		/*
		mmt1.memberfield1 = 1;
		mmt1.memberfield2 = 'A';
		mmt1.memberfield3 = 95.4;
		*/
		mmt1.setmemberfield(1,'A',95.4);
		/**********case1**********/
		/*
		 * MemberMethodThis객체 내용출력
		System.out.println(mmt1.memberfield1+"\t"+
				mmt1.memberfield2+"\t"+
				mmt1.memberfield3);
		 */
		
		/**********case2**********/
		/*
		 * MemberMethodThis객체 내용출력 메쏘드 호출
		 */
		mmt1.print();
		System.out.println("main block--> mmt1주소값"+mmt1);
		
		MemberMethodThis mmt2 = new MemberMethodThis();
		/*
		mmt2.memberfield1 = 2;
		mmt2.memberfield2 = 'F';
		mmt2.memberfield3 = 56.89;
		*/
		mmt2.setmemberfield(2, 'F', 56.89);
		mmt2.print();
		mmt2.print();
		mmt2.print();
	}

}
