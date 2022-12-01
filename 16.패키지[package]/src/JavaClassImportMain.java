import java.io.*;
import java.net.*;

import com.itwill.shop.*;
import com.itwill.shop.member.*;
import com.itwill.shop.product.*;

/*
import java.lang.*;
자바 랭 패키지에있는 클래스는 임포트 구문생략가능
*/

public class JavaClassImportMain {

	public static void main(String[] args) {
		System.out.println("-----------java,lang package--------");
		java.lang.String str1="임포트";
		String str2 = "김경호";
		Object obj = new Object();
		System.out.println(Math.random());
		
		InputStream in;
		OutputStream out;
		Socket socket;
		
		ShopService shopService;
		Member m;
		Product p;
		

	}

}
