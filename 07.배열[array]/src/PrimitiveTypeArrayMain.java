/*
 배열:  
      - 같은데이타형을 가진 멤버필드(기억장소)여러개의 모음 
      - 배열타입변수의 선언형식
         만들어진 객체의 멤버변수 데이타타입[] 이름;  ex) int[] ja; char[] ca;
	  - 사용: 
	       1.배열타입객체의생성	
		   2.배열객체멤버필드의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int intType;
		intType=90;
		
		int[] intArray;
		intArray = new int[5];
		System.out.println("int배열객체 주소값"+intArray);
		intArray[0]= 90; 
		intArray[1]= 80; 
		intArray[2]= 70; 
		intArray[3]= 60; 
		intArray[4]= 50; 
		
		System.out.println("----------for문---------");
		for( int i =0; i<5;i++) {
			System.out.println(intArray[i]);
		}
		/*
		 * 모든배열객체는 public int length를 멤버변수로 가진다.
		 */
		System.out.println("배열객체의 멤버필드갯수:"+intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("--------기본형 1차원[] 배열--------");
		int[] korArray = new int[10];
		korArray[0] =22;
		korArray[1] =34;
		korArray[2] =56;
		korArray[3] =15;
		korArray[4] =88;
		korArray[5] =20;
		korArray[6] =15;
		korArray[7] =45;
		korArray[8] =55;
		korArray[9] =66;
		int korTot=0;
		for (int i = 0; i < korArray.length; i++) {
			korTot +=korArray[i];
		}
		System.out.println("우리반 국어총점: "+korTot);
		double korAvg =(double)korTot/korArray.length;
		System.out.println("우리반 국어평균: "+korAvg);
		System.out.println("--------char[]--------");
		char[] ca=new char[6];
		ca[0]='H';
		ca[1]='e';
		ca[2]='l';
		ca[3]='l';
		ca[4]='o';
		ca[5]='!';
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);			
		}
		System.out.println("--------boolean[]--------");
		boolean[] ba = new boolean[5];
		ba[0]=true;
		ba[1]=false;
		ba[2]=true;
		ba[3]=false;
		ba[4]=true;
		int trueCount=0;
		for (int i = 0; i < ba.length; i++) {
			if(ba[i]) {
				trueCount++;
			}
		}
		System.out.println(trueCount);
		
		System.out.println("-------------String[]-------------");
		
		String[] strArray = new String[5];
		strArray[0] = "kim";
		strArray[1] = "lee";
		strArray[2] = "sin";
		strArray[3] = "jin";
		strArray[4] = "park";
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
	}

}
