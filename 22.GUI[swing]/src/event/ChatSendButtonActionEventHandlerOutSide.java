package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatSendButtonActionEventHandlerOutSide implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("send button click~~");
		
	}

}
