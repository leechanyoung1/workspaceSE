
public class VariableTypes{//VariableTypes=식별자 첫 단어는 대문자  클래스 만드는법 식별자{ } 클래스블록
	public static void main(String[] args) { //메인블록
		/*
		 논리형(1byte)
		 	-논리형 변수
		 	-논리형 리터럴(값,데이타):true,false
		 */
         boolean bool1;  //변수이름 소문자
         boolean bool2;  //변수 분류 숫자=(실수,정수),문자,논리형
         boolean bool3;
         boolean bool4;         
         bool1 = true;
         bool2 = false;
         bool3 = true;
         bool4 = bool3;
         System.out.println(bool1);
         System.out.println(bool2);
         System.out.println(bool3);
         System.out.println(bool4);
         /*
          문자형(한개문자)(2byte)
          	-문자형변수
          	-문자형 리터럴:'A','힣','a','1'
          */
         char munja1,munja2,munja3,munja4,munja5,munja6;
         	munja1 = 'a';
        	munja2 = 'b';
            munja3 = '이';
        	munja4 = '찬';
        	munja5 = '3';
        	munja6 = munja3;
        	
        	System.out.println(munja1);
        	System.out.println(munja2);
        	System.out.println(munja3);
        	System.out.println(munja4);
        	System.out.println(munja5);
        	System.out.println(munja6);
        	/*
        	 *1.정수형변수(byte,short,int,long)
        	 *	-정수형리터럴:1,2,4,56,-800,2511 (int)
        	 *2.실수형변수(float,double)
        	 *	-실수형 리터럴:0.1,.1,3.141592,10000.0
        	 */
        	
        	
        	 
        	 byte b1=3;
        	 byte b2=-128;
        	 byte b3=127;
        	 byte b4=0b01111111;
        	 System.out.println(b1);
        	 System.out.println(b2);
        	 System.out.println(b3);
        	 System.out.println(b4);
        	 
        	 short s1 = 767;
        	 short s2 = -32768;
        	 short s3 = 32767;
        	 short s4 = 0b0111111111111111;
        	 System.out.println(s1);
        	 System.out.println(s2);
        	 System.out.println(s3);
        	 System.out.println(s4);
        	 
        	 
        	 int i1,i2,i3,i4,i5,i6;
        	 i1=90;
        	 i2=90;
        	 i3=-2147483648;
        	 i4=2147483647;
        	 i5=0b01111111111111111111111111111111;
        	 i6=i1;
        	 System.out.println(i1);
        	 System.out.println(i2);
        	 System.out.println(i3);
        	 System.out.println(i4);
        	 System.out.println(i5);
        	 System.out.println(i6);
        	 
        	 long l1=232;
        	 long l2=21474836490054544l;
        	 System.out.println(l1);
        	 System.out.println(l2);
        	 
        	 float f1,f2,f3;
        	 f1=0.1f;
        	 f2=3.14f;
        	 f3=10000.0f;
        	 System.out.println(f1);
        	 System.out.println(f2);
        	 System.out.println(f3);
        	 
        	 double d1,d2,d3;
        	 d1=3.141592;
        	 d2=12345678912345678912345678.0;
        	 d3=1.2345678912345678912345678;
        	
        	 System.out.println(d1);
        	 System.out.println(d2);
        	 System.out.println(d3);
        	 
        	 System.out.println("------------문자열형----------------");
        	 String str1="오늘은";
        	 String str2="수요일";
        	 String str3="변수를 공부합니다";
        	 System.out.println(str1); //ln 라인 내림
        	 System.out.println(str2);
        	 System.out.println(str3);
        	 /*
        	  * 문자열접합연산자(+)
        	  */
        	 String str4 = str1+ str2+ str3;
        	 System.out.println(str4);
        	 String str5=str1+" "+str2+" "+str3;
        	 System.out.println(str5);        	 
        	 
        	 String name="이찬영";
        	 int age=30;
        	 char gender='M';
        	 double height=170.2;
        	 double weight=68.8;
        	 
        	 String myinfo=name+" "+age+" "+gender+" "+height+" "+weight;
        	 System.out.println(myinfo);
        	           	 
	}

}
