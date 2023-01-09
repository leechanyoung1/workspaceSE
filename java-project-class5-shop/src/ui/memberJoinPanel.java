package ui;
import javax.swing.JPanel;
import javax.swing.JButton;

public class memberJoinPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public memberJoinPanel() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.setBounds(12, 370, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(121, 370, 97, 23);
		add(btnNewButton_1);

	}
}
