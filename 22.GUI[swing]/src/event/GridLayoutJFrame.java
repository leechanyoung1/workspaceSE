package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridLayoutJFrame extends JFrame {

	private JPanel contentPane;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton bp;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton bm;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton bx;
	private JButton b0;
	private JButton be;
	private JButton bc;
	private JButton bn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutJFrame frame = new GridLayoutJFrame();
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
	public GridLayoutJFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 353);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 3, 3));
		
		b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(1+"");
			}
		});
		contentPane.add(b1);
		
		b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(2+"");
			}
		});
		contentPane.add(b2);
		
		b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(3+"");
			}
		});
		contentPane.add(b3);
		
		bp = new JButton("+");
		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("+");
			}
		});
		contentPane.add(bp);
		
		b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(4+"");
			}
		});
		contentPane.add(b4);
		
		b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(5+"");
			}
		});
		contentPane.add(b5);
		
		b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(6+"");
			}
		});
		contentPane.add(b6);
		
		bm = new JButton("-");
		bm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("-");
			}
		});
		contentPane.add(bm);
		
		b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(7+"");
			}
		});
		contentPane.add(b7);
		
		b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(8+"");
			}
		});
		contentPane.add(b8);
		
		b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("9");
			}
		});
		contentPane.add(b9);
		
		bx = new JButton("x");
		bx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("x");
			}
		});
		contentPane.add(bx);
		
		b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("0");
			}
		});
		contentPane.add(b0);
		
		be = new JButton("=");
		be.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("=");
			}
		});
		contentPane.add(be);
		
		bc = new JButton("c");
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("c");
			}
		});
		contentPane.add(bc);
		
		bn = new JButton("/");
		bn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("/");
			}
		});
		contentPane.add(bn);
	}

}
