
public class WhileUse {

	public static void main(String[] args) {
		
		System.out.println(">>1~10사이의 정수 출력(10회출력)");
		
		int i=0;
		while(i<10) {
			System.out.print((i+1)+" ");
			i++;
		}
		//System.out.print("\n");
		System.out.println(">>1~10사이의 정수 출력(10회출력)");
		System.out.println(">>1~10사이의 정수 출력(10회출력)");
		i=1;
		
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println(">>1~100사이의 정수중에서 홀수출력");
		i = 1;
		while(i<=100) {
			if(i%2==1) {
 			System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println(">>1~100사이의 정수중에서 4의배수출력");
		i=1;
		while(i<=100) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	   /*
	    * Quiz:
	    * 1900년도부터 2022까지의 연도중에서 윤년을 출력하세요.
	    */
		System.out.println();
		System.out.println("1900년도부터 2022까지의 연도중에서 윤년을 출력하세요");
		int year=1900;
		while(year<=2022) {
			if((year%4==0 && year%100!=0)||(year%400==0)) {
				System.out.print(year+"년\t");
			}
			year++;
		}
		System.out.println();
		System.out.println(">>1~100사이의 정수중에서 짝수와 홀수의 합");
		
		i=1;
		int tot = 0;
		int addtot=0;
		int eventot=0;
		while(i<=100) {
			if(i%2==1) {
				//홀수
				
				
				addtot = addtot+i;
				
			}else {
				//짝수
				eventot = eventot+i;
			}
			
			//tot=tot+i;
			tot+=i;//연산후 대입 연산자
			
		    i++;
		}
		
				
		System.out.println("1~100사이의 정수중에서 홀수합:"+addtot);
		System.out.println("1~100사이의 정수중에서 짝수합:"+eventot);
		System.out.println("1~100사이의 정수합:"+tot);
		
		
	}

}
