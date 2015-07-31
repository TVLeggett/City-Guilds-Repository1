package com.tetianaleggett;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GuiApp extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnReverse;
	private JButton btnTransfer;
	private JButton btnClearText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiApp frame = new GuiApp();
					frame.setTitle("My First Gui");
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
	public GuiApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(53, 33, 159, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(53, 129, 159, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSave = new JButton("Clear text");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This is where we will add what we want the button to do when it's clicked.
				textField.setText("");
			}
		});
		btnSave.setBounds(272, 32, 91, 23);
		contentPane.add(btnSave);
		
		btnReverse = new JButton("Reverse");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This is where we will add what we want the button to do when it's clicked.
				StringBuilder str = new StringBuilder(textField.getText());
				str.reverse();
				//reverse the string in the text field
				textField.setText(str.toString());
			}
		});
		btnReverse.setBounds(272, 66, 91, 23);
		contentPane.add(btnReverse);
		
		btnTransfer = new JButton("Transfer");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField.getText());
			}
		});
		btnTransfer.setBounds(272, 128, 91, 23);
		contentPane.add(btnTransfer);
		
		btnClearText = new JButton("Clear text");
		btnClearText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This is where we will add what we want the button to do when it's clicked.
				textField_1.setText("");	
			}
		});
		btnClearText.setBounds(272, 162, 91, 23);
		contentPane.add(btnClearText);
		
	}
}
