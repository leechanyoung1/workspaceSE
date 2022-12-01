public class DuoMemberInfoPrint{
	public static void main(String[] args) {
		int number1;
		String name;
		String number2;
		char gender;
		int count;
		boolean smoking;
		double height;
		char Credit;
		String face;
		
		number1=236514;
		name="홍길동";
		number2="201212-3495039";
		gender='남';
		count=0;
		smoking=true;
		height=178.3;
		Credit='A';
		face="상(중)";
		
		System.out.println("*********************************");
		System.out.println("회원번호 :"+" "+number1);
		System.out.println("이    름 :"+" "+name);
		System.out.println("주민번호 :"+" "+number2);
		System.out.println("성    별 :"+" "+gender);
		System.out.println("결혼횟수 :"+" "+count);
		System.out.println("흡연여부 :"+" "+smoking);
		System.out.println("키       :"+" "+height);
		System.out.println("학    점 :"+" "+Credit);
		System.out.println("용    모 :"+" "+face);
		System.out.println("*********************************");
		
		/*
		*************************
		회원번호 : 236514   
		이    름 : 홍길동   
		주민번호 : 201212-3495039   
		성    별 : 남   
		결혼횟수 : 0   
		흡연여부 : true   
		키       : 178.3   
		학    점 : A   
		용    모 : 상(중)   
		**************************   
		*/
	}
}
