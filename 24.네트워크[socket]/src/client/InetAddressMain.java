package client;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) throws Exception {
		System.out.println("----------local adress(IP)------------");
		InetAddress localAddress = InetAddress.getLocalHost();
		System.out.println("local addrsee name"+localAddress.getHostName());
		System.out.println("local host address"+localAddress.getHostAddress());
		
		System.out.println("----remote address----");
		InetAddress remoteAddress = InetAddress.getByName("www.naver.com");
		System.out.println("remote host name:"+remoteAddress.getHostName());
		System.out.println("remote host address:"+remoteAddress.getHostAddress());
		
		InetAddress[] remoteAddresses = InetAddress.getAllByName("www.daum.net");
		for (InetAddress inetAddress : remoteAddresses) {
			System.out.println(inetAddress);
		}
	}

}
