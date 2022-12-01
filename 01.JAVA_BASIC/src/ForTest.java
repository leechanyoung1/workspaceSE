/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
		       	//1.반복변수(선언,초기화가능)
		       	//2.반복변수의 조건검사(논리형데이타)
		       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>무한루프
	       for(;;){
	       	
	       }
	
	*/
public class ForTest {

	public static void main(String[] args) {
		System.out.println("-----while------");
		int k=0; //반복변수선언 초기화
		while(k<10) {//반복변수비교(반복조건)
			//3.반복문
			System.out.println("k="+k);
			k++;//반복변수증가(감소)
		}
		
		System.out.println("----for i 증가----");
		for(int i = 0;i<10;i++) {
			System.out.println("i="+i);
		}
		
		for (int i = 0; i < 10; i++) { 
			System.out.println("i="+i);
		}
		System.out.println("----for i감소----");
		for (int i = 10; i > 0; i--) {
			System.out.println("i="+i);
			
		}
		System.out.println(">>홀수만출력(1~100)");
		for (int i = 1; i <= 100; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(">>짝수만출력(1~100)continue");
		for (int i = 1; i <= 100; i++) {
			if(i%2==1) {
				
					/*
					 * 홀수조건을 만족하면 continue문이 실행되고
					 * 현재실행중인 for의 블록을 실행한지 않고 
					 * 다음횟수의 블록을 실행한다.
					 */
				continue;
				/* 0.반복블록에서만 사용가능하다.
				 * 1.continue문 이후의 for블록코드를 실행하지 않는다.
				 * 2.다음반복을 계속(continue)실행한다.
				 */
				
			}
			/*
			 * 
			 */
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(">>4의배수출력[1~100]");
		 for (int i = 1; i < 100; i++) {
			 if(i%4==0) {
				 System.out.print(i+" ");
				 
			 }
			
		}
		 System.out.println();
		 System.out.println(">>3과4의 공배수");
		 for (int i = 1; i < 100; i++) {
			 if(i%3==0 && i%4==0) {
				 System.out.print(i+" ");
				 break;
				 /*
				  * break문
				  * -반복문에서 사용가능
				  * -break문이후의 for블록코드를 실행하지않는다.
				  * -다음반복문도 싱핼하지않는다(반복블록을 빠져나온다)
				  */
			 }
			
		}
		 System.out.println();
		 System.out.println(">>홀수짝수합(1~100)");
		 
		 int oddtot = 0;
		 int eventot =0;
		 for (int i = 1; i <= 100; i++) {
			 if(i%2==0) {
				 //짝수누적
				 eventot+=i;//eventot=eventot +i;
			 }else {
				 //홀수누적
				 oddtot+= i;//oddtot=oddtot +i;
			 }
			
		}
		 System.out.println("짝수합"+eventot);
		 System.out.println("홀수합"+oddtot);
		 System.out.println("---문자출력---");
		 for (char c='a';c<='z';c++) {
			 System.out.print(c);
			 if(c=='z') {
				 continue;
			 }
			 
			 System.out.print(",");
			
		}
		 System.out.println();
		 
		 for (char c='a';c<='z';c++) {
			 System.out.print(c);
			 if(c=='z') 
				 continue;
			 System.out.print(",");
			 /*
			  * 5개문자찍고계행
			  */
			 if((c-'a'+1)%5==0)
				 System.out.println();
		}
		 System.out.println();
	}

}
