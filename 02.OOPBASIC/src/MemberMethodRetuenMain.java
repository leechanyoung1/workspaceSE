
public class MemberMethodRetuenMain {

	public static void main(String[] args) {
		MemberMethodRetuen mmr = new MemberMethodRetuen();
		int returnData1 = mmr.method1();
		System.out.println("main block-->returnData1 "+returnData1);
		boolean returnData2=mmr.method2();
		System.out.println("main block-->returnData2 "+returnData2);
		
		int returnData3 = mmr.add(2121, 1515);
		System.out.println("main block-->returnData3 "+returnData3);
		System.out.println("main block-->returnData4:"+mmr.add(20, 40));
		
		String name="김경호";
		String returnMessage1 = mmr.hello(name);
		/*
		 * returnMessage1:김경호님 안녕하세요!!
		 */
		System.out.println("main block-->returnMessage1:"+returnMessage1);
		System.out.println("main block-->returnMessage2:"+mmr.hello("김경호"));
		System.out.println("*****************setter메쏘드호출**************************");
		mmr.setMemberField1(7777777);
		mmr.setMemberField2(8888888);
		mmr.setMemberField3(9999999);

		
		System.out.println("*****************getter메쏘드호출**************************");
		/*
		 * System.out.println("------main block memberFiled값 사용(출력)----"); int
		 * memberField1= mmr.memberField1;
		 * System.out.println("memberField1 "+memberField1);
		 */
		int returnMemberField1 = mmr.getMemberField1();
		System.out.println("returnMemberField1:"+returnMemberField1);
		System.out.println("returnMemberField2:"+mmr.getMemberField2());
		System.out.println("returnMemberField3:"+mmr.getMemberField3());
	}

}
