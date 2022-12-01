
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수,홀수판별
		 */
		int no1=55;
		
		if(no1%2==0) {
			System.out.printf("%d 는 %s입니다.\n",no1,"짝수");     //\n 라인내림
		}else {
			System.out.printf("%d 는 %s입니다.\n",no1,"홀수"); 
		}
		/*
		 * 4의배수판별
		 */
		int no2=4000;
		if(no2%4==0) {
			System.out.printf("%d는 4의배수 \n",no2);
		}else {
			System.out.printf("%d는 4의배수아님 \n",no2);
		}
		/*
		 * 정수의 유효성체크
		 */
		int kor =90;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d는 유효한 정수입니다.\n",kor);
		}else{
			System.out.printf("%d는 유효한 정수가 아닙니다.\n",kor);
			
		}
		/*
		 * 윤년여부
		 */
		int year=2022;
		String msg="";
		if(year%4==0 && year%100!=0 || year%400==0) {
			msg="윤년";
		}else {
			msg="평년";
		}
		System.out.printf("%d는 %s 입니다.\n",year,msg);
		/*
		 * 공백수
		 */
		int no3=48;
		if(no3%3==0 && no3%4==0) {
			System.out.printf("%10d는 3과4의공배수입니다.\n",no3);
		}else {
			System.out.printf("%10d는 3과4의 공배수가아닙니다.\n",no3);
			
		}
		/*
		 * 문자판단
		 */
		char c='X';
		
		if(c>='A' && c<='Z') {
			System.out.printf("%c는 알파벳 대문자이다\n",c);
		}else {
			System.out.printf("%c는 알파벳 대문자가 아니다\n",c);
			
		}
		c='9';
		if(c>='0' && c<='9') {
			System.out.printf("%c는 숫자형태문자입니다\n",c);
		}
		/*
		 Quiz:
		 다음문자는 아이디의 첫글자입니다. 
		 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		char idFirstLetter='@';
		if((idFirstLetter>='A' && idFirstLetter<='Z')||(idFirstLetter>='a' && idFirstLetter<='z')) {
			System.out.printf("%c는 아이디 첫글자로 유효합니다\n",idFirstLetter);
		}else {
			System.out.printf("%c는 아이디 첫글자로 유효하지않습니다\n",idFirstLetter);
			
			
		}
		
		char idFirstLetter1='a';
		String msg1 ="";
		if((idFirstLetter1>='A' && idFirstLetter1<='Z')||(idFirstLetter1>='a' && idFirstLetter1<='z')) {
			msg1="유효하다";
		}else {
			msg1="유효하지않다";
			
		}
		System.out.printf("%c는 아이디 첫글자로 %s.\n",idFirstLetter,msg1);
		
		
	}

}
