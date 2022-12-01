package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		/*
		 * String 객체의생성
		 * 1.생성자호출(명시적생성)
		 * 2.""로 생성(암시적생성)
		 */
		String name1= new String("kim");
		String name2= new String("kim");
		String name3= "kim";
		String name4= "kim";
		
		
		
		
		
		
		
		
		
		System.out.println("---------------String객체내용비교는.equals메쏘드를 사용하여야합니다---------");
		/*
		 * 
		 */
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열이 동일");
		}
		if(name1.equals(name3)) {
			System.out.println("name1객체의 문자열과 name3객체의 문자열이 동일");
					
		}
		if(name1.equals(name4)) {
			System.out.println("name1객체의 문자열과 name4객체의 문자열이 동일");
			
		}
		"kim".equals("lee");
		if(name1.equals("kim")) {
			System.out.println("name1객체의 문자열과 \"kim\"객체의 문자열이 동일");
		
		}
	int uniCodeGap="aaa".compareTo("aaa");
	System.out.println(uniCodeGap);
	uniCodeGap = "aaa".compareTo("aab");
	System.out.println(uniCodeGap);	
	uniCodeGap = "aab".compareTo("aaa");
	System.out.println(uniCodeGap);		
	String irum1="aab";	
	String irum2="aaa";	
	if(irum1.compareTo(irum2)>0) {	
		System.out.println("irum2,irum2교환[오름차순]");
		
	}
	}
}
