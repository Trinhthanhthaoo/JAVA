package in;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.UIManager;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.SystemColor;

public class CalDemoPro {

	private JFrame frame;
	private JTextField value2;
	private JTextField value1;
	private JLabel actionRecived;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e){
			
		}
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalDemoPro window = new CalDemoPro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalDemoPro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 100, 414, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		value2 = new JTextField();
		value2.setFont(new Font("Tahoma", Font.BOLD, 20));
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setBorder(null);
		value2.setBounds(20, 43, 217, 45);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		value1 = new JTextField();
		value1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setBorder(null);
		value1.setBounds(135, 13, 102, 28);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(10, 11, 374, 111);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText()+ 9);
			}
		});
		btnNewButton.setBounds(31, 174, 48, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("6");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 6);
			}
		});
		button.setBounds(31, 254, 48, 31);
		frame.getContentPane().add(button);
		
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 3);
			}
		});
		button_2.setBounds(31, 324, 48, 31);
		frame.getContentPane().add(button_2);
		
		JButton button_4 = new JButton("8");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 8);
			}
		});
		button_4.setBounds(108, 174, 48, 31);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 5);
			}
		});
		button_5.setBounds(108, 254, 48, 31);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 2);
			}
		});
		button_6.setBounds(108, 324, 48, 31);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("0");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 0);
			}
		});
		button_7.setBounds(31, 398, 147, 31);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 7);
			}
		});
		button_8.setBounds(207, 174, 48, 31);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("4");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 4);
			}
		});
		button_9.setBounds(207, 254, 48, 31);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 1);
			}
		});
		button_10.setBounds(207, 324, 48, 31);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("=");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_11.setBackground(new Color(144, 238, 144));
		button_11.setForeground(new Color(0, 0, 0));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one = Integer.parseInt(value1.getText());
				int two = Integer.parseInt(value2.getText());
				
				
				if(actionRecived.getText().equals("sub"))
				{
				int sub = one - two;
				value2.setText(String.valueOf(sub));
				}
				if(actionRecived.getText().equals("add"))
				{
				int add = one + two;
				value2.setText(String.valueOf(add));
				}
				if(actionRecived.getText().equals("div"))
				{
				int div = one / two;
				value2.setText(String.valueOf(div));
				}
				if(actionRecived.getText().equals("mul"))
				{
				int mul = one * two;
				value2.setText(String.valueOf(mul));
				}
			}
		});
		button_11.setBounds(207, 398, 48, 31);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("sub");
				value2.setText(null);
			}
		});
		button_12.setBounds(309, 173, 48, 31);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("+");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecived.setText("add");
				value2.setText(null);
			}
		});
		button_13.setBounds(309, 253, 48, 31);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("div");
				value2.setText(null);
			}
		});
		button_14.setBounds(309, 323, 48, 31);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("*");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecived.setText("mul");
				value2.setText(null);
			}
		});
		button_15.setBounds(309, 397, 48, 31);
		frame.getContentPane().add(button_15);
		
		actionRecived = new JLabel("");//making global variable
		actionRecived.setBounds(288, 135, 80, 33);
		frame.getContentPane().add(actionRecived);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
				actionRecived.setText(null);
			}
		});
		btnNewButton_1.setBounds(309, 458, 48, 33);
		frame.getContentPane().add(btnNewButton_1);
	}
}
