package com.itwill.member.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.member.Member;
import com.itwill.member.MemberService;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class MemberMainFrame extends JFrame {
	/****************MemberService객체선언*********************/
	MemberService memberService;
	
	
	/*******************************/
	/****************로그인한회원********************/
	private Member loginMember = null;
	
	private int selected_index=0;
	private JPanel contentPane;
	private JTextField idTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JPasswordField passTF;
	private JComboBox agecombo;
	private JCheckBox marriedCheck;
	private JLabel idMsgLB;
	private JTextField loginIdTF;
	private JPasswordField loginPassTF;
	private JTextField infoIdTF;
	private JPasswordField infoPassTF;
	private JTextField infoNameTF;
	private JTextField infoAddressTF;
	private JTabbedPane membertabbedPane;
	private JCheckBox infoMarriedCK;
	private JComboBox infoAgeCD;
	private JMenuItem loginMenuItem;
	private JMenuItem joinMenuItem;
	private JMenuItem logoutMenuItem;
	private JButton updateFormBtn;
	private JButton updateBtn;
	private JTable memberTB;
	private JButton memberDeleteBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
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
	public MemberMainFrame()throws Exception {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 557);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu memberMenu = new JMenu("회원");
		menuBar.add(memberMenu);
		
		loginMenuItem = new JMenuItem("로그인");
		loginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				membertabbedPane.setSelectedIndex(1);
			}
		});
		memberMenu.add(loginMenuItem);
		
		joinMenuItem = new JMenuItem("가입");
		joinMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				membertabbedPane.setSelectedIndex(2);
			}
		});
		memberMenu.add(joinMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		JMenuItem exitMenuItem_1 = new JMenuItem("종료");
		exitMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		logoutMenuItem = new JMenuItem("로그아웃");
		logoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logoutProcess();
			}
		});
		memberMenu.add(logoutMenuItem);
		memberMenu.add(exitMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		membertabbedPane = new JTabbedPane(JTabbedPane.TOP);
		membertabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int selectedTabIndex= membertabbedPane.getSelectedIndex();
				if(selectedTabIndex==4) {
					displayMemberList();
				}
			}
		});
		contentPane.add(membertabbedPane, BorderLayout.CENTER);
		
		JPanel memberMainpanel = new JPanel();
		membertabbedPane.addTab("회원메인", null, memberMainpanel, null);
		memberMainpanel.setLayout(new BorderLayout(0, 0));
		
		JLabel memberMainLB = new JLabel("");
		memberMainLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(loginMember==null) {
					membertabbedPane.setSelectedIndex(1);
				}else {
					membertabbedPane.setSelectedIndex(3);
					
				}
			}
		});
		memberMainLB.setHorizontalAlignment(SwingConstants.CENTER);
		memberMainLB.setIcon(new ImageIcon(MemberMainFrame.class.getResource("/images/car1.jpg")));
		memberMainpanel.add(memberMainLB, BorderLayout.CENTER);
		
		JPanel memberLogin = new JPanel();
		memberLogin.setBackground(new Color(255, 0, 255));
		membertabbedPane.addTab("회원로그인", null, memberLogin, null);
		memberLogin.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("아이디");
		lblNewLabel_6.setBounds(12, 114, 57, 15);
		memberLogin.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("비밀번호");
		lblNewLabel_7.setBounds(12, 194, 57, 15);
		memberLogin.add(lblNewLabel_7);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(81, 111, 116, 21);
		memberLogin.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPassTF = new JPasswordField();
		loginPassTF.setBounds(81, 191, 116, 21);
		memberLogin.add(loginPassTF);
		
		JButton loginBTN = new JButton("로그인");
		loginBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********회원로그인****************/
				try {
					String id = loginIdTF.getText();
					String pass = new String (loginPassTF.getPassword());
					
					int result = memberService.login(id, pass);
					if(result==0) {
						//로그인성공
						loginProcess(id);
					loginIdTF.setText("");
					loginPassTF.setText("");
					}else {
						JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 일치하지 않습니다.");
						loginIdTF.setSelectionStart(0);
						loginIdTF.setSelectionEnd(id.length());
						loginIdTF.requestFocus();
					}
				}catch(Exception e1) {
					
				}
			}
		});
		loginBTN.setBounds(25, 280, 97, 23);
		memberLogin.add(loginBTN);
		
		JButton joinBTN = new JButton("회원가입");
		joinBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				membertabbedPane.setSelectedIndex(1);
			}
		});
		joinBTN.setBounds(152, 280, 97, 23);
		memberLogin.add(joinBTN);
		
		JPanel memberJoinjpanel = new JPanel();
		memberJoinjpanel.setBackground(new Color(0, 128, 255));
		membertabbedPane.addTab("회원가입", null, memberJoinjpanel, null);
		memberJoinjpanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(28, 60, 57, 15);
		memberJoinjpanel.add(lblNewLabel);
		
		idTF = new JTextField();
		idTF.setBounds(94, 57, 94, 21);
		memberJoinjpanel.add(idTF);
		idTF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(28, 113, 57, 15);
		memberJoinjpanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(28, 174, 57, 15);
		memberJoinjpanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(28, 217, 57, 15);
		memberJoinjpanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(28, 271, 57, 15);
		memberJoinjpanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결혼여부");
		lblNewLabel_5.setBounds(28, 327, 57, 15);
		memberJoinjpanel.add(lblNewLabel_5);
		
		nameTF = new JTextField();
		nameTF.setBounds(94, 171, 116, 21);
		memberJoinjpanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(97, 214, 116, 21);
		memberJoinjpanel.add(addressTF);
		addressTF.setColumns(10);
		
		passTF = new JPasswordField();
		passTF.setBounds(94, 110, 94, 21);
		memberJoinjpanel.add(passTF);
		
		agecombo = new JComboBox();
		agecombo.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		agecombo.setBounds(89, 267, 99, 23);
		memberJoinjpanel.add(agecombo);
		
		marriedCheck = new JCheckBox("");
		marriedCheck.setBounds(94, 323, 21, 23);
		memberJoinjpanel.add(marriedCheck);
		
		JButton memberJoinBTN = new JButton("가입");
		memberJoinBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***************회원가입**************/
				try {
					/*******TextField로 부터 테이터얻기********/
					String id =idTF.getText();
					String password =new String(passTF.getPassword());
					String name = nameTF.getText();
					String address = addressTF.getText();
					/***********유효성체크**************/
					if(id.equals("")) {
						idMsgLB.setText("아이디를 입력하세요");
						idTF.requestFocus();
						return;
					}
					String ageStr =(String)agecombo.getSelectedItem();
					int age = Integer.parseInt(ageStr);
					String married="";
					if(marriedCheck.isSelected()) {
						married="T";
					}else {
						married="F";
					}
					
					
					
				Member newMember = new Member(id,password,name,address,age,married,null);
				boolean isAdd = memberService.addMember(newMember);
				if(isAdd) {
					//로그인화면전환
					membertabbedPane.setSelectedIndex(1);
					
					
				}else {
					JOptionPane.showMessageDialog(null, "이미사용하고있는 아이디입니다");
					idTF.requestFocus();
					idTF.setSelectionStart(0);
					idTF.setSelectionEnd(id.length());
				}
				
				
				
				}catch(Exception e1) {
					System.out.println("회원가입-->"+e1.getMessage());
				}
			}
		});
		memberJoinBTN.setBounds(18, 374, 83, 23);
		memberJoinjpanel.add(memberJoinBTN);
		
		JButton memberCS = new JButton("취소");
		memberCS.setBounds(127, 374, 83, 23);
		memberJoinjpanel.add(memberCS);
		
		idMsgLB = new JLabel("");
		idMsgLB.setForeground(new Color(255, 0, 0));
		idMsgLB.setBounds(94, 88, 94, 15);
		memberJoinjpanel.add(idMsgLB);
		
		JPanel memberInfo = new JPanel();
		memberInfo.setBackground(new Color(255, 128, 0));
		membertabbedPane.addTab("회원정보", null, memberInfo, null);
		memberInfo.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("아이디");
		lblNewLabel_8.setBounds(12, 34, 57, 15);
		memberInfo.add(lblNewLabel_8);
		
		infoIdTF = new JTextField();
		infoIdTF.setEnabled(false);
		infoIdTF.setColumns(10);
		infoIdTF.setBounds(78, 31, 94, 21);
		memberInfo.add(infoIdTF);
		
		JLabel lblNewLabel_1_1 = new JLabel("패스워드");
		lblNewLabel_1_1.setBounds(12, 87, 57, 15);
		memberInfo.add(lblNewLabel_1_1);
		
		infoPassTF = new JPasswordField();
		infoPassTF.setEditable(false);
		infoPassTF.setBounds(78, 84, 94, 21);
		memberInfo.add(infoPassTF);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 148, 57, 15);
		memberInfo.add(lblNewLabel_2_1);
		
		infoNameTF = new JTextField();
		infoNameTF.setEditable(false);
		infoNameTF.setColumns(10);
		infoNameTF.setBounds(78, 145, 116, 21);
		memberInfo.add(infoNameTF);
		
		JLabel lblNewLabel_3_1 = new JLabel("주소");
		lblNewLabel_3_1.setBounds(12, 191, 57, 15);
		memberInfo.add(lblNewLabel_3_1);
		
		infoAddressTF = new JTextField();
		infoAddressTF.setEditable(false);
		infoAddressTF.setColumns(10);
		infoAddressTF.setBounds(81, 188, 116, 21);
		memberInfo.add(infoAddressTF);
		
		JLabel lblNewLabel_4_1 = new JLabel("나이");
		lblNewLabel_4_1.setBounds(12, 245, 57, 15);
		memberInfo.add(lblNewLabel_4_1);
		
		infoAgeCD = new JComboBox();
		infoAgeCD.setEnabled(false);
		infoAgeCD.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		infoAgeCD.setBounds(73, 241, 99, 23);
		memberInfo.add(infoAgeCD);
		
		JLabel lblNewLabel_5_1 = new JLabel("결혼여부");
		lblNewLabel_5_1.setBounds(12, 301, 57, 15);
		memberInfo.add(lblNewLabel_5_1);
		
		infoMarriedCK = new JCheckBox("");
		infoMarriedCK.setEnabled(false);
		infoMarriedCK.setBounds(80, 293, 21, 23);
		memberInfo.add(infoMarriedCK);
		
		updateFormBtn = new JButton("수정폼");
		updateFormBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnText =updateFormBtn.getText();
				if(btnText.equals("수정폼")) {
					updateFormEnable(true);
				}else if(btnText.equals("수정취소")){
					displayMemberInfo(loginMember);
					updateFormEnable(false);
				}
				
			}
		});
		updateFormBtn.setBounds(12, 355, 97, 23);
		memberInfo.add(updateFormBtn);
		
		updateBtn = new JButton("수정");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				/*******TextField로 부터 테이터얻기********/
				String id =infoIdTF.getText();
				String password =new String(infoPassTF.getPassword());
				String name = infoNameTF.getText();
				String address = infoAddressTF.getText();
				
				String ageStr =(String)infoAgeCD.getSelectedItem();
				int age = Integer.parseInt(ageStr);
				String married="";
				if(infoMarriedCK.isSelected()) {
					married="T";
				}else {
					married="F";
				}
				
				
				
			Member member = new Member(id,password,name,address,age,married,null);
			memberService.memberUpdate(member);
			loginMember = memberService.memberDetail(id);
			updateFormEnable(false);
			}catch(Exception e1){
				System.out.println(e1.getMessage());
			}
			}
		});
		updateBtn.setBounds(161, 355, 97, 23);
		memberInfo.add(updateBtn);
		
		JPanel memberAdminpanel = new JPanel();
		membertabbedPane.addTab("회원관리", null, memberAdminpanel, null);
		memberAdminpanel.setLayout(null);
		
		JScrollPane memberscrollPane = new JScrollPane();
		memberscrollPane.setBounds(12, 30, 361, 124);
		memberAdminpanel.add(memberscrollPane);
		
		memberTB = new JTable();
		memberTB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				memberDeleteBtn.setEnabled(true);
				selected_index = memberTB.getSelectedRow();
				
			}
		});
		memberTB.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\uC544\uC774\uB514", "\uD328\uC2A4\uC6CC\uB4DC", "\uC774\uB984", "\uC8FC\uC18C", "\uB098\uC774", "\uACB0\uD63C\uC5EC\uBD80", "\uB4F1\uB85D\uC77C"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		memberscrollPane.setViewportView(memberTB);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"김경호", "박경호", "이이잉", "바바바바", "아아아", "라라라", "다다다", "가가가사", "사사사사"}));
		comboBox.setBounds(243, 201, 105, 28);
		memberAdminpanel.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 201, 120, 174);
		memberAdminpanel.add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"김경호", "박경호", "이이잉", "바바바바", "아아아", "라라라", "다다다", "가가가사", "사사사사", "김경호", "박경호", "이이잉", "바바바바", "아아아", "라라라", "다다다", "가가가사", "사사사사", "김경호", "박경호", "이이잉", "바바바바", "아아아", "라라라", "다다다", "가가가사", "사사사사"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JButton memberListBtn = new JButton("회원리스트보기");
		memberListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayMemberList();
				
				
			}
		});
		memberListBtn.setBounds(63, 154, 120, 23);
		memberAdminpanel.add(memberListBtn);
		
		memberDeleteBtn = new JButton("회원삭제");
		memberDeleteBtn.setEnabled(false);
		memberDeleteBtn.setBounds(227, 154, 97, 23);
		memberAdminpanel.add(memberDeleteBtn);
		
		
		/***************2.MemberService멤버필드객체생성********************/
		memberService = new MemberService();
		logoutProcess();
	}//생성자 끝
	/**************************************************/
	private void displayMemberList() {
		/*********************회원리스트보기******************/
		try {
			List<Member> memberList=  memberService.memberList();
			
			Vector columnVector = new Vector();
			columnVector.add("아이디");
			columnVector.add("패스워드");
			columnVector.add("이름");
			columnVector.add("주소");
			columnVector.add("나이");
			columnVector.add("결혼");
			columnVector.add("가입일");
			
			Vector tableVector = new Vector();
			for(Member member:memberList) {
			Vector rowVector = new Vector();
			rowVector.add(member.getM_id());
			rowVector.add(member.getM_password());
			rowVector.add(member.getM_name());
			rowVector.add(member.getM_address());
			rowVector.add(member.getM_age());
			rowVector.add(member.getM_married());
			rowVector.add(member.getM_regdate());
		
			tableVector.add(rowVector);
			}
			
			
			
			DefaultTableModel tableModel = new DefaultTableModel(tableVector,columnVector);
			
			memberTB.setModel(tableModel);
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
	/********************************회원수정폼활성화 불활성화***********************************/
	
	private void updateFormEnable(boolean b) {
		if(b) {
			//활성화
			//infoIdTF.setEnabled(true);
			//infoPassTF.setEnabled(true);
			infoNameTF.setEditable(true);
			infoAddressTF.setEditable(true);
			infoAgeCD.setEnabled(true);
			infoMarriedCK.setEnabled(true);
			
			updateFormBtn.setText("수정취소");
			updateBtn.setEnabled(true);
		}else {
			//불활성화
			//활성화
			infoIdTF.setEnabled(false);
			infoPassTF.setEnabled(false);
			infoNameTF.setEditable(false);
			infoAddressTF.setEditable(false);
			infoAgeCD.setEnabled(false);
			infoMarriedCK.setEnabled(false);
			updateFormBtn.setText("수정폼");
			updateBtn.setEnabled(false);
		}
		
	}
	
	
	
	
	/**********로그아웃시 호출할메쏘드**********/
	private void logoutProcess() {
		/**********로그아웃시 해야할일**********
		1.로그인성공한멤버객체 멤버필드에 삭제
		2.MemberMainFrame타이틀변경
		3.로그인,회원가입탭 활성화,회원정보탭 불활성화,로그아웃메뉴아이템 불활성화,로그인,회원가입 메뉴아이템활성화
		4.메인 화면전환
		******************************************/
		this.loginMember=null;
		setTitle("회원관리");
		
		membertabbedPane.setEnabledAt(1,true);
		membertabbedPane.setEnabledAt(2,true);
		membertabbedPane.setEnabledAt(3,false);
		loginMenuItem.setEnabled(true);
		joinMenuItem.setEnabled(true);
		logoutMenuItem.setEnabled(false);
		
		membertabbedPane.setSelectedIndex(0);
		
		
	}
	/**********로그인성공시 호출할메쏘드**********/
	private void loginProcess(String id) throws Exception {
		/**********로그인 성공시 해야할일**********
		1.로그인성공한멤버객체 멤버필드에 저장
		2.MemberMainFrame타이틀변경
		3.로그인,회원가입탭 불활성화
		로그인,회원가입 메뉴아이템 불활성화
		로그아웃,회원가입 메튜아이템 활성화
		4.회원정보보기 화면전환
		******************************************/
		//1.로그인성공한멤버객체 멤버필드에 저장 
		 this.loginMember = memberService.memberDetail(id);
		//2.2.MemberMainFrame타이틀변경
		setTitle(id+"님 로그인");
		
		//3.로그인화면,회원가입화면 불활성화
		membertabbedPane.setEnabledAt(1, false);
		membertabbedPane.setEnabledAt(2, false);
		membertabbedPane.setEnabledAt(3,true);
		loginMenuItem.setEnabled(false);
		joinMenuItem.setEnabled(false);
		logoutMenuItem.setEnabled(true);
		//4.회원정보보기화면
		membertabbedPane.setSelectedIndex(3);
		displayMemberInfo(this.loginMember);
		updateFormEnable(false);
	}
		private void displayMemberInfo(Member member) {
			/****회원상세데이타보여주기*****/
			infoIdTF.setText(member.getM_id());
			infoPassTF.setText(member.getM_password());
			infoNameTF.setText(member.getM_name());
			infoAddressTF.setText(member.getM_address());
			infoAgeCD.setSelectedItem(member.getM_age()+"");
			if(member.getM_married().equals("T")) {
				infoMarriedCK.setSelected(true);
			}else {
				infoMarriedCK.setSelected(false);
			}
	}
}
