package event;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChattingFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JButton sendBtn;
	private JTextArea chatTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingFrame frame = new ChattingFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChattingFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				System.exit(0);
			}
		});
		setTitle("카카오톡");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 397, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setForeground(new Color(0, 0, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("현대자동차");
		lblNewLabel.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\01.JAVA_FUNDMENTAL\\image\\car5.jpg"));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		chatTF = new JTextField();
		chatTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("TextField enter key~~");
				String chatStr = chatTF.getText();
				chatTF.setText("");
				chatTA.append(chatStr+"\n");
				chatTF.requestFocus();
			}
		});
		panel_1.add(chatTF);
		chatTF.setColumns(20);
		
		sendBtn = new JButton("전송");
		panel_1.add(sendBtn);
		
		chatTA = new JTextArea();
		chatTA.setEditable(false);
		
		chatTA.setBackground(Color.YELLOW);
		contentPane.add(chatTA, BorderLayout.CENTER);
		/*
		 * 이벤트소쓰에 이벤트핸들러객체등록
		 */
		ChatSendButtonActionEventHandler handler = new ChatSendButtonActionEventHandler();
		sendBtn.addActionListener(handler);
		
	}
	
	/**************************Inner Class*****************************************/
	public class ChatSendButtonActionEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("send button click~~");
			/*
			 * frame의 TextField와 TextArea에 접근해야함
			 */
			String chatStr = chatTF.getText();
			chatTF.setText("");
			chatTA.append(chatStr+"\n");
			chatTF.requestFocus();
		}

	}
	
	
	

}
