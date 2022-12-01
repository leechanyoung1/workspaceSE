package lang;


public class ObjectMain extends Object{
	
	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		 String str1 = o1.toString();
		System.out.println(str1);
		System.out.println(o2);
		
	if(o1.equals(o2)) {
		System.out.println("o1과o2주소가 같다");
	}else {
		System.out.println("o1과o2주소가 다르다");
		
	}
	if(o1.equals(o3)) {
		System.out.println("o1과o2주소가 같다");
	}else {
		System.out.println("o1과o2주소가 다르다");
		
	}
	
	System.out.println("-----------------ObjectChild-----------------------");
	ObjectChild oc1= new ObjectChild();
	ObjectChild oc2= new ObjectChild();
	ObjectChild oc3=oc1;
	System.out.println("--------상속받은 object.equals--------");
	if(oc1.equals(oc3)) {
		System.out.println("주소동일");
	}
	System.out.println("--------상속받은 object.etoString--->재정의--------");
	System.out.println(oc1.toString());
	System.out.println(oc2);
	System.out.println(oc3);
	
	
	
	
	
	
 }
}