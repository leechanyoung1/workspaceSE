
 /*
 * 관계(비교)연산자
 * -형태:>,<,<=,>=,==,!=
 * -관계연산의 결과값은 논리형 데이터(true,false)
 * 
 */
 
public class OperatorRelational {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		boolean result = a>b;
		System.out.println(result);
		result = a<b;
		System.out.println(result);
		result = a>=b;
		System.out.println(result);
		result = a<=b;
		System.out.println(result);
		result = a==b;
		System.out.println(result);
		result = a!=b;
		System.out.println(result);
		
		System.out.println("-----------문자비교--------------");
		System.out.println("-----문자비교------");
        char ca ='A';
        char cb='B';
        result = ca > cb;
        System.out.println(result);
        char h1 ='가';        
        char h2 ='나';
        result = h1 < h2;
        System.out.println(result);
		

	}

}