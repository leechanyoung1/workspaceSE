package ui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.JTabbedPane;

public class ShopMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame frame = new ShopMainFrame();
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
	public ShopMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		JPanel globalSouthMenupanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) globalSouthMenupanel.getLayout();
		globalSouthMenupanel.setBackground(new Color(255, 255, 255));
		contentPane.add(globalSouthMenupanel, BorderLayout.SOUTH);
		
		JButton globalsearchbtnNewButton = new JButton("");
		globalsearchbtnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalsearchbtnNewButton.setBorder(null);
		globalsearchbtnNewButton.setOpaque(false);
		globalsearchbtnNewButton.setBackground(new Color(255, 255, 255));
		globalsearchbtnNewButton.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\공부파일\\01.JAVA_FUNDMENTAL\\image\\koreanfood.png"));
		globalSouthMenupanel.add(globalsearchbtnNewButton);
		
		JButton globalHomebtnNewButton_1 = new JButton("");
		globalHomebtnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalHomebtnNewButton_1.setOpaque(false);
		globalHomebtnNewButton_1.setBorder(null);
		globalHomebtnNewButton_1.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\공부파일\\01.JAVA_FUNDMENTAL\\image\\place.png"));
		globalSouthMenupanel.add(globalHomebtnNewButton_1);
		
		JButton globalMemberbtnNewButton_2 = new JButton("");
		globalMemberbtnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalMemberbtnNewButton_2.setBorder(null);
		globalMemberbtnNewButton_2.setOpaque(false);
		globalMemberbtnNewButton_2.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\공부파일\\01.JAVA_FUNDMENTAL\\image\\koreanfood.png"));
		globalSouthMenupanel.add(globalMemberbtnNewButton_2);
		
		JTabbedPane shoptabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shoptabbedPane, BorderLayout.CENTER);
		
		JTabbedPane producttabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shoptabbedPane.addTab("제품", null, producttabbedPane, null);
		
		JTabbedPane membertabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shoptabbedPane.addTab("회원", null, membertabbedPane, null);
		
		memberJoinPanel memberJoinPanel_ = new memberJoinPanel();
		membertabbedPane.addTab("가입", null, memberJoinPanel_, null);
	}

}
