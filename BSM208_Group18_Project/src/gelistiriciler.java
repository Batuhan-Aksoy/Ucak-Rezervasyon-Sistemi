import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class gelistiriciler extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gelistiriciler frame = new gelistiriciler();
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
	public gelistiriciler() {
		setTitle("Geli\u015Ftiriciler");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Batuhan Aksoy 19010311009");
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel.setBounds(156, 120, 265, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblFatihYaln = new JLabel("Fatih Yal\u00E7\u0131n 18010310036");
		lblFatihYaln.setForeground(new Color(0, 0, 204));
		lblFatihYaln.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblFatihYaln.setBounds(171, 190, 234, 59);
		contentPane.add(lblFatihYaln);
		
		JLabel lblEmirhanDenizci = new JLabel("Emirhan Denizci 19010310032");
		lblEmirhanDenizci.setForeground(new Color(0, 0, 204));
		lblEmirhanDenizci.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblEmirhanDenizci.setBounds(149, 50, 278, 59);
		contentPane.add(lblEmirhanDenizci);
	}

}
