package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Login_page {

	private JFrame frame;
	private JPasswordField passwordField;
	protected JLabel textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_page window = new Login_page();
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
	public Login_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  User Login");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(223, 82, 111, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(95, 138, 96, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(95, 172, 96, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(191, 138, 178, 22);
		frame.getContentPane().add(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(191, 174, 178, 22);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String UserName =textField.getText();
				String Password =passwordField.getText();
				
				if(UserName.equals("Admin")&&Password.equals("1234")) {
					
					textField.setText(null);
					passwordField.setText(null);
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Invalid Login","Error",JOptionPane.ERROR_MESSAGE);
				     
					textField.setText(null);
					passwordField.setText(null);
				}
				
			}
		});
		btnNewButton.setBounds(233, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			}
			
		});
		btnNewButton_1.setBounds(95, 281, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		   
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {

			
				public void actionPerformed(ActionEvent args0) {
			
			  try {	
				textField.setText(null);
				passwordField.setText(null);
				}
				catch(Exception e) {
					
					System.out.println("Eexception is handled");
				}
				
			}
		});
		btnNewButton_2.setBounds(364, 281, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Created by saurabh kanawade");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setBounds(10, 11, 275, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
