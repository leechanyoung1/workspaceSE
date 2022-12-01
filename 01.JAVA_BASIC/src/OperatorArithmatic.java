/*
 * 이항 연산자
 * 	산술= << >> >>> 비트움직임
 *	비교= (== 같다)
 *  논리
 */
public class OperatorArithmatic {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result=0;
		
		result = a+b;
		System.out.println(result);
		result = a-b;
		System.out.println(result);
		result = a*b;
		System.out.println(result);
		result = a/b; // ???
		System.out.println(result);
		double dresult = (double)a/b;
		System.out.println(dresult);
		/*
		 * 나머지연산자
		 * %
		 */
		 result=a%b;
		 System.out.println(result);
		 
		 int year=2020;
		 result = year%4;//0,1,2,3
		 System.out.println(result);
		 result = year%100;//0~99
		 System.out.println(result);
		 result = year%400;//0~399
		 System.out.println(result);
		
		 int no =16;
		 result = no%4;
		 System.out.println(result);
		 //System.out.println("--------문자연산---------");
		 
		 /*
		  * 비트연산자
		  * << , >>
		  * int d=1;            ==>00000000:00000000:00000000:00000001
		  * result = d << 1;    ==>00000000:00000000:00000000:00000010
		  * result = d << 2;    ==>00000000:00000000:00000000:00000100
		  * result = d << 3;    ==>00000000:00000000:00000000:00001000
		  * result = d << 4;    ==>00000000:00000000:00000000:00010000
		  * result =d << 1; ==>
		  */
	
		 int d=1;
		 System.out.println(d);
		 result = d << 1;
		 System.out.println(result);
		 result = d << 2;
		 System.out.println(result);
		 result = d << 3;
		 System.out.println(result);
		 result = d << 4;
		 System.out.println(result);
		 
		 /*
		  
		  */
		 d=128;
		 System.out.println(d);
		 result = d>>1;
		 System.out.println(result);
		 result = d>>2;
		 System.out.println(result);
		 result = d>>3;
		 System.out.println(result);
		 result = d>>4;
         System.out.println(result);
         System.out.println("-----문자연산------");
         char ca='A';
         char cz='Z';
         int number1= cz-ca+1;
         System.out.println("알파벳 대문자수 :"+number1);
         char c ='a';
         System.out.println(c);
         c='a'+1;
         System.out.println(c);
         c='a'+2;
         System.out.println(c);
         
		 
		 
		 
	}

}





