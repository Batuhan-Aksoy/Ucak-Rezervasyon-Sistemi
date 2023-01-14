import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class kayit extends JFrame {

	private JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_email;
	private JTextField textField_tel;
	private JPasswordField passwordField_pas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kayit frame = new kayit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public kayit() {
		setTitle("Kullan\u0131c\u0131 Kay\u0131t ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Kullan\u0131c\u0131 Kay\u0131t");
		lblNewLabel_4.setForeground(new Color(0, 0, 204));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel_4.setBounds(132, 10, 172, 25);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel.setBounds(35, 40, 140, 30);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u015Eifre :");
		lblNewLabel_1.setForeground(new Color(0, 0, 204));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel_1.setBounds(35, 80, 70, 30);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setForeground(new Color(0, 0, 204));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel_2.setBounds(35, 120, 70, 30);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Telefon No :");
		lblNewLabel_3.setForeground(new Color(0, 0, 204));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel_3.setBounds(35, 160, 120, 30);
		contentPane.add(lblNewLabel_3);

		textField_name = new JTextField();
		textField_name.setBounds(180, 45, 200, 25);
		contentPane.add(textField_name);
		textField_name.setColumns(10);

		passwordField_pas = new JPasswordField();
		passwordField_pas.setBounds(180, 90, 200, 25);
		contentPane.add(passwordField_pas);

		textField_email = new JTextField();
		textField_email.setBounds(180, 125, 200, 25);
		contentPane.add(textField_email);
		textField_email.setColumns(10);

		textField_tel = new JTextField();
		textField_tel.setBounds(180, 165, 200, 25);
		contentPane.add(textField_tel);
		textField_tel.setColumns(10);

		JButton btnNewButton = new JButton("Kay\u0131t Ol");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
					
					String name = textField_name.getText();
					String pass = passwordField_pas.getText();
					String mail = textField_email.getText();
					String tel = textField_tel.getText();
					kayit_kontrol kayit = new kayit_kontrol();
					kayit.kayit(name, pass, mail, tel);
				    setVisible(false);

			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton.setBounds(180, 210, 200, 30);
		contentPane.add(btnNewButton);

	}
}
