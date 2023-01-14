import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class anasayfa extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("HO\u015EGELD\u0130N\u0130Z");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anasayfa frame = new anasayfa();
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
	public anasayfa() {
		setBackground(Color.WHITE);
		setTitle("U\u00E7u\u015F Randevusu Alma Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 401);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblNewLabel.setBounds(220, 10, 242, 58);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("G\u0130R\u0130\u015E YAP");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login giris = new login();
				giris.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setBounds(166, 146, 129, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Rezervasyon Yapt\u0131rmak \u0130\u00E7in Giri\u015F Yap\u0131n\u0131z.");
		lblNewLabel_2.setForeground(new Color(0, 0, 204));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_2.setBounds(143, 93, 395, 32);
		contentPane.add(lblNewLabel_2);
		
		JButton btnKaytOl = new JButton("KAYIT OL");
		btnKaytOl.setBackground(Color.LIGHT_GRAY);
		btnKaytOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kayit kayit = new kayit();
				kayit.setVisible(true);
				setVisible(false);
			}
		});
		btnKaytOl.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnKaytOl.setBounds(384, 146, 129, 41);
		contentPane.add(btnKaytOl);
		
		JButton btnGelitiriciler = new JButton("GEL\u0130\u015ET\u0130R\u0130C\u0130LER");
		btnGelitiriciler.setBackground(Color.LIGHT_GRAY);
		btnGelitiriciler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				gelistiriciler gelistirici = new gelistiriciler();
				gelistirici.setVisible(true);
				setVisible(false);
			}
		});
		btnGelitiriciler.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnGelitiriciler.setBounds(277, 198, 129, 41);
		contentPane.add(btnGelitiriciler);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\casper\\OneDrive\\Masa\u00FCst\u00FC\\uçak.png.jpg"));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Batuhan\\eclipse-workspace\\BSM208_Group18_Project\\u\u00E7ak.png.jpg"));
		lblNewLabel_1.setBounds(291, 254, 100, 100);
		contentPane.add(lblNewLabel_1);
	}
}
