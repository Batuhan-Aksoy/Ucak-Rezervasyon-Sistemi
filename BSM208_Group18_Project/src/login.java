import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField_kulad;
	private JPasswordField passwordField_pass;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	

	public login() {
		setTitle("Kullan\u0131c\u0131 Giri\u015Fi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 270);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl_kulad = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lbl_kulad.setForeground(new Color(0, 0, 204));
		lbl_kulad.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lbl_kulad.setBounds(40, 52, 139, 23);
		contentPane.add(lbl_kulad);

		JLabel lblNewLabel = new JLabel("\u015Eifre :");
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel.setBounds(40, 97, 89, 27);
		contentPane.add(lblNewLabel);

		textField_kulad = new JTextField();
		textField_kulad.setBounds(200, 55, 150, 25);
		contentPane.add(textField_kulad);
		textField_kulad.setColumns(10);

		passwordField_pass = new JPasswordField();
		passwordField_pass.setBounds(200, 100, 150, 25);
		contentPane.add(passwordField_pass);

		JLabel lblNewLabel_1 = new JLabel("Kullan\u0131c\u0131 Giri\u015F Ekran\u0131");
		lblNewLabel_1.setForeground(new Color(0, 0, 204));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel_1.setBounds(98, 11, 240, 26);
		contentPane.add(lblNewLabel_1);

		JButton btngiris = new JButton("Giri\u015F Yap");
		btngiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				giris_kontrol giris = new giris_kontrol();
				giris.giris(textField_kulad.getText(),passwordField_pass.getText());
				setVisible(false);
				
			}
		});

		btngiris.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btngiris.setBounds(140, 156, 105, 30);
		contentPane.add(btngiris);

		JButton btnkayit = new JButton("Kay\u0131t Ol");
		btnkayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kayit form2 = new kayit();
				form2.setVisible(true);//form2.show da form2 yi açýyor.		
				setVisible(false);//login sayfasýný kapatýyor (yani ilgili sayfayý kapatýyor) arkada durmuyor.	
				//.Dispose() da kapatma iþlemi yapýyor ancak form1 için nesne oluþturarak kullandýðýmýzda kapama yapmýyor.
			}
		});
		btnkayit.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnkayit.setBounds(270, 156, 105, 30);
		contentPane.add(btnkayit);
	}
}
