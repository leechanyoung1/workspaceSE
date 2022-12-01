
public class RuntimeExceptionCatchMain {

	public static void main(String[] args) throws RuntimeException{
		System.out.println("stmt1");
		String str=null;
		try {
		System.out.println("stmt2");
		/*
		 * 예외발생예상코드
		 */
		int length = str.length();
		/*
		 1. 예외상황발생하면  NullPointerException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2.던져진 예외객체는 catch block에 선언된 변수에 대입된다.
		 3. 현재실행흐름은 예외가 발생한곳에서 catch block으로 실행흐름이 이동한다.
		 */
		System.out.println(length);
		System.out.println("stmt3");
		}catch(NullPointerException e) {
			System.out.println("--catch start--");
			System.out.println("msg:"+e.getMessage());
			str="김경호";
			int length = str.length();
			System.out.println("length:"+length);
			System.out.println("--catch end--");
		}
		
		int[] intArray = null;
		try {
		intArray = new int[3];
		System.out.println("stmt4");
		intArray[3]=9999;
		/*
		 1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2.던져진 예외객체는 catch block에 선언된 변수에 대입된다.
		 3. 현재실행흐름은 예외가 발생한곳에서 catch block으로 실행흐름이 이동한다.
		 */
		System.out.println("stmt5");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("--catch start--");
			System.out.println("msg:"+e.getMessage());
			intArray[intArray.length-1] = 9999;
			System.out.println(intArray[intArray.length-1]);
			System.out.println("--catch end--");
		}
		System.out.println("main end return");
		
		
	}

}
