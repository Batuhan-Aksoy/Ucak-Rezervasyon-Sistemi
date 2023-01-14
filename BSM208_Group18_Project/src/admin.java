import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_adminmesaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin(toString());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public admin(String admin_name) {
		setBackground(Color.WHITE);
		
		setTitle("Admin Sayfas\u0131");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Sayfas\u0131");
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(294, 11, 147, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kullan\u0131c\u0131lara Bildirim Yollama ");
		lblNewLabel_1.setForeground(new Color(0, 0, 204));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 30, 208, 25);
		contentPane.add(lblNewLabel_1);
		
		textField_adminmesaj = new JTextField();
		textField_adminmesaj.setBackground(Color.WHITE);
		textField_adminmesaj.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		textField_adminmesaj.setBounds(21, 55, 703, 25);
		contentPane.add(textField_adminmesaj);
		textField_adminmesaj.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comboBox.setBounds(21, 131, 703, 30);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Bildirim Yolla");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                     
					String adminmesaj=textField_adminmesaj.getText();
					if(adminmesaj.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Lütfen Önce mesajý giriniz");
					}
					else
					{
						admin_bildirim ab= new admin_bildirim();
					    ab.bildirim_ekle(adminmesaj,admin_name);
					    setVisible(false);
					}
					
				
				
			}
		});
		btnNewButton.setBounds(21, 90, 300, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rezervasyonlar\u0131 G\u00F6r");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				admin_rezervasyon ar = new admin_rezervasyon();
				String rez [][] =ar.admin_rez() ;
				for(int j=0;j<rez.length;j++)
				{
					if(rez[j][0]==null)
					{
						break;
					}
					comboBox.addItem(rez[j][0]+") Rezervasyon = "+rez[j][1]+" þehrinden "+rez[j][2]+" þehrine, Tarih ="+rez[j][3]+" , Þirket = "+rez[j][4]+" , Koltuk Numarasý= "+rez[j][5]);
				}
			}
		});
		btnNewButton_1.setBounds(424, 91, 300, 30);
		contentPane.add(btnNewButton_1);
		
		JLabel lbl_adminad = new JLabel("New label");
		lbl_adminad.setForeground(new Color(0, 51, 0));
		lbl_adminad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_adminad.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_adminad.setBounds(566, 17, 159, 25);
		contentPane.add(lbl_adminad);
		lbl_adminad.setText(admin_name);
	}
}
