package wb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\2022-11-JAVA-DEVELOPER\\01.JAVA_FUNDMENTAL\\image\\ball.png"));
		setTitle("나의첫번째프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 333);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 0));
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 255, 0)));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("자동물약");
		lblNewLabel.setFont(new Font("D2Coding", Font.PLAIN, 24));
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setBackground(new Color(255, 128, 0));
		lblNewLabel.setBounds(43, 37, 102, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("자동사냥");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("D2Coding", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(53, 96, 92, 57);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("아이디를 입력하세요");
		textField.setBackground(new Color(0, 0, 255));
		textField.setBounds(169, 54, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(0, 0, 255));
		textField_1.setBounds(169, 135, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("시작");
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setBounds(99, 215, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("종료");
		btnNewButton_1.setBackground(new Color(0, 255, 64));
		btnNewButton_1.setBounds(269, 215, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("설정저장");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 0));
		chckbxNewCheckBox.setBounds(99, 174, 115, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 128, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"로그인방법선택", "카카오", "네이버", "구글", "다음"}));
		comboBox.setBounds(241, 166, 125, 23);
		contentPane.add(comboBox);
	}
}
