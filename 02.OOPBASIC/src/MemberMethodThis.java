
public class MemberMethodThis {
/*
 * 멤버필드
 */
	
 int memberfield1;
 char memberfield2;
 double memberfield3;
 /*
  * 멤버메쏘드[기능]
  */
 
 /*
  *1.객체의멤버필드에 데이타를 대입
  */
 void setmemberfield(int memberfield1,char memberfield2,double memberfield3) {
	 this.memberfield1 = memberfield1;
	 this.memberfield2 = memberfield2;
	 this.memberfield3 = memberfield3;
	
 }
 /*
  *2. 객체의 멤버필드의 내용을 출력하는 메쏘드
  */
 void print() {
	 /*
	  * this:
	  * self참조변수
	  * -void print()메쏘드가 실행될떄 호출주체개체의 주소값
	  * -this는 생략가능
	  */
	 
	 System.out.println("mmt1.print()메쏘드안에서 this:"+this);
	 System.out.println(this.memberfield1+"\t"+this.memberfield2+"\t"+this.memberfield3);
 	}
 
}
