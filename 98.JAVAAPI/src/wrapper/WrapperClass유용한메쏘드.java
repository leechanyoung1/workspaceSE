package wrapper;

public class WrapperClass유용한메쏘드 {

	public static void main(String[] args) {
		System.out.println("int---->String");
		int y = 2147483647;
		String yStr1=Integer.toString(y);
		System.out.println(yStr1);
		String yStr2 = y + ""; 
		/*
		 * +연산자
		 * -연산항에 문자열이 포함되어있을경우 concat
		 * -연산항이 숫자일경우 더함
		 * 
		 */
		String result1 = 1 + 2 + "문자열";
		String result2 = 1 + "문자열"+2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(yStr2);
		
		String yStr3 = Integer.toBinaryString(y);
		System.out.println(yStr3);
		String yStr4 = Integer.toHexString(y);
		System.out.println(yStr4);
		System.out.println("String-->int,doyble,boolean");
		int i1 = Integer.parseInt("213213515");
		System.out.println(i1);
		double d1= Double.parseDouble("3.18491");
		System.out.println(d1+1);
		boolean b1 = Boolean.parseBoolean("true");
		System.out.println(b1);
		
		System.out.println("---------Character----------");
		Character wc1 = new Character('김');
		Character wc2 ='김';
		char c1 = wc1.charValue();
		char c2 = wc2;
		/*
		if(wc1==wc2) {
			System.out.println("wc1==wc2 주소동일");
		}else {
			System.out.println("wc1==wc2 주소안동일");
		}
		*/
		/*
		 * Wrapper 객체의 값비교는 equals메쏘드를 사용해야한다.
		 */
		if(wc1.equals(wc2)) {
			System.out.println("wc1객체의 char값과 wc2객체의 char값이 동일하다");
		}
		String strs= "hello Java #^*$&%$%&%&^%++1561541451553김경호 제임스";
		
		for (int i = 0; i < strs.length(); i++) {
			char temp = strs.charAt(i);
			int type = Character.getType(temp);
			System.out.println(type);
			if(type==Character.UPPERCASE_LETTER) {
				System.out.println("UPPERCASE_LETTER");
			}
			if(type==Character.LOWERCASE_LETTER) {
				System.out.println("LOWERCASE_LETTER");
			}
			if(type==Character.DECIMAL_DIGIT_NUMBER) {
				System.out.println("DECIMAL_DIGIT_NUMBER");
			}
			if(type==Character.SPACE_SEPARATOR) {
				System.out.println("SPACE_SEPARATOR)");
			}
		}
	}

}
