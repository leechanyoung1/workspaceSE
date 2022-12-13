package chat.client;


import java.net.Socket;


public class ChatClientMain {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.15.23",8888);
		Thread.sleep(1000000000);

	}

}
