
public class OperatorUnary {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		int ar = -a;
		int br = +b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);
		
		boolean isplay=true;
		System.out.println(isplay);
		isplay=!isplay;
		System.out.println(isplay);
		
		int kor=90;
		boolean isvalidscore =kor>=0 && kor<=100;
		System.out.println(isvalidscore);
		boolean isinvalidscore = !isvalidscore;
		System.out.println(isinvalidscore);
		/*
		 * 증가,감소 연산자
		 * -항은 반드시 변수이여야한다.
		 * -형태:++,--
		 * -항변수의값을 정수1만큼 증가(감소)시킨후 항변수에 다시 대입
		 */
		System.out.println("-------------[++i,--j]-------------");
		int i =5;
		int j =5;
		
		++i;   //i=i+1
		--j;   //j=j-1
		System.out.println(i);
		System.out.println(j);
		System.out.println("-------------[i++,j--]-------------");
		i=5;
		j=5;
		i++;
		j--;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------[i++ , ++i]-----------");
		i=5;
		j=5;
		System.out.println(++i);
		System.out.println(j++);
		System.out.println(i);
		System.out.println(j);
		
		
		
	}

}
