import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.List;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Choice;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class kullanici extends JFrame {

	protected static final String String = null;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kullanici frame = new kullanici(String);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public String userid="";
	public kullanici(String id) {
		this.userid=id;

		setTitle("Kullan\u0131c\u0131 Sayfas\u0131");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Online U\u00E7u\u015F Rezervasyonu");
		lblNewLabel_2.setForeground(new Color(0, 0, 204));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel_2.setBounds(193, 11, 309, 25);
		contentPane.add(lblNewLabel_2);
		
		
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		comboBox_5.setForeground(new Color(0, 0, 204));
		comboBox_5.setBounds(21, 45, 660, 30);
		contentPane.add(comboBox_5);
		comboBox_5.addItem("Rezervasyonlarým");
		rezervasyon r = new rezervasyon();
		String rez [][] =r.rezervasyon_goruntule(userid) ;
		for(int j=(rez.length)-1;j>=0;j--)
		{
			if(rez[j][0]==null)
			{
				continue;
			}
			else {
				comboBox_5.addItem(rez[j][0]+") Rezervasyon = "+rez[j][1]+" þehrinden "+rez[j][2]+" þehrine, Tarih ="+rez[j][3]+" , Þirket = "+rez[j][4]+" , Koltuk Numarasý= "+rez[j][5]);
			}
		}
		
		JButton btnNewButton_2 = new JButton("Rezervasyon Sil");
		btnNewButton_2.setForeground(new Color(0, 0, 204));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(comboBox_5.getSelectedItem().equals("Rezervasyonlarým"))
				{
					JOptionPane.showMessageDialog(null, "Silmek için öncelikle Rezervasyon seçiniz");
				}
				else {
					String rezervasyon= (String) comboBox_5.getSelectedItem();
					rezervasyon_sil rsil= new rezervasyon_sil();
				    if(rezervasyon.charAt(1)==')')
				    {
				    	char rez1=rezervasyon.charAt(0);
				    	String temp1 = Character.toString(rez1);
				    	int rezid =Integer.parseInt(temp1);
				    	rsil.rezervasyonu_sil(rezid,userid,rezervasyon);
				    	setVisible(false);
				    }
				    else {
				    	
				    	char rez2=rezervasyon.charAt(0);
				    	char rez3=rezervasyon.charAt(1);
				    	String temp2 = Character.toString(rez2);
				    	temp2=temp2+Character.toString(rez3);
				    	int rezidd =Integer.parseInt(temp2);
				    	rsil.rezervasyonu_sil(rezidd,userid,rezervasyon);
				    	setVisible(false);
				    }
				    
				    
				}
				
				
			}
		});
		btnNewButton_2.setBounds(461, 125, 115, 30);
		contentPane.add(btnNewButton_2);
		
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
		comboBox_6.setForeground(new Color(0, 0, 204));
		comboBox_6.setBounds(21, 85, 660, 30);
		contentPane.add(comboBox_6);
		comboBox_6.addItem("Bildirimlerim");
		bildirim b = new bildirim();
		String bildirim [][] =b.bildirim_goruntule(userid);
		for(int k=(rez.length)-1;k>=0;k--)
		{
			
			if(bildirim[k][0]==null)
			{
				continue;
			}
			else if(bildirim[k][3]==null)
			{
				comboBox_6.addItem(bildirim[k][0]+") "+bildirim[k][1]+" 'nden "+bildirim[k][2]+" numaralý koltuða ait biletin Rezervasyonu Yapýldý");
			}
			else {
				comboBox_6.addItem(bildirim[k][0]+") Admin Mesajý = "+bildirim[k][3]);
			}
			
			
			
		}
		
		JButton btnNewButton_3 = new JButton("Bildirim Sil");
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_3.setForeground(new Color(0, 0, 204));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(comboBox_6.getSelectedItem().equals("Bildirimlerim"))
				{
					JOptionPane.showMessageDialog(null, "Silmek için öncelikle bildirim seçiniz");
				}
				else {
					String bldrm= (String) comboBox_6.getSelectedItem();
					bildirim_sil bsil= new bildirim_sil();
					if(bldrm.charAt(1)==')')
					{
						char bldrm1=bldrm.charAt(0);
						String temp3 = Character.toString(bldrm1);
				    	int bilid =Integer.parseInt(temp3);
				    	bsil.bildirimi_sil(bilid,userid);
				    	setVisible(false);
					}
					else
					{
						char bldrm2=bldrm.charAt(0);
				    	char bldrm3=bldrm.charAt(1);
				    	String temp4 = Character.toString(bldrm2);
				    	temp4=temp4+Character.toString(bldrm3);
				    	int bilidd =Integer.parseInt(temp4);
				    	bsil.bildirimi_sil(bilidd,userid);
				    	setVisible(false);
					}
				    
				    
				    
				}
			}
		});
		btnNewButton_3.setBounds(581, 125, 100, 30);
		contentPane.add(btnNewButton_3);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		comboBox.setForeground(new Color(0, 0, 204));
		comboBox.setBounds(21, 125, 100, 30);
		contentPane.add(comboBox);
		comboBox.addItem("Nereden");
		comboBox.addItem("Ýstanbul");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		comboBox_1.setForeground(new Color(0, 0, 204));
		comboBox_1.setBounds(131, 125, 100, 30);
		contentPane.add(comboBox_1);;
		comboBox_1.addItem("Nereye");
		comboBox_1.addItem("Bartýn");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		comboBox_2.setForeground(new Color(0, 0, 204));
		comboBox_2.setBounds(241, 125, 100, 30);
		contentPane.add(comboBox_2);
		comboBox_2.addItem("Tarih");
		comboBox_2.addItem("30.07.2021");
	 
        
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		comboBox_3.setForeground(new Color(0, 0, 204));
		comboBox_3.setBounds(351, 125, 100, 30);
		contentPane.add(comboBox_3);
		comboBox_3.addItem("Uçak Þirketi");
		comboBox_3.addItem("A Þirketi");
		comboBox_3.addItem("B Þirketi");
		comboBox_3.addItem("C Þirketi");
		
		
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setForeground(new Color(0, 0, 204));
		
		JButton btnNewButton = new JButton("Biletleri Listele");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(0, 0, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
	            if(comboBox.getSelectedItem().equals("Nereden") || comboBox_1.getSelectedItem().equals("Nereye") || comboBox_2.getSelectedItem().equals("Tarih") || comboBox_3.getSelectedItem().equals("Uçak Þirketi"))
				{
					JOptionPane.showMessageDialog(null, "Rezervasyon Seçenekleri Boþ Býrakýlamaz");
				}
	            else {
	            	
	            JLabel lblNewLabel_3 = new JLabel("Koltuk no");
	        	lblNewLabel_3.setForeground(new Color(0, 0, 204));
	        	lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
	            lblNewLabel_3.setBounds(26, 210, 55, 14);
	            contentPane.add(lblNewLabel_3);
		
		        JLabel lblNewLabel_4 = new JLabel("Fiyat");
	        	lblNewLabel_4.setForeground(new Color(0, 0, 204));
	        	lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 12));		        
		        lblNewLabel_4.setBounds(125, 210, 46, 14);
		        contentPane.add(lblNewLabel_4);
		
		        JLabel lblNewLabel_5 = new JLabel("Koltuk S\u0131n\u0131f\u0131");
	        	lblNewLabel_5.setForeground(new Color(0, 0, 204));
	        	lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 12));		        
		        lblNewLabel_5.setBounds(220, 210, 76, 14);
		        contentPane.add(lblNewLabel_5);	
		        

				String sirket = (String) comboBox_3.getSelectedItem();
				bilet_listele bilet = new bilet_listele();	
				String dizi [][]=bilet.listele(sirket);

				
		          comboBox_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
        		  comboBox_4.setBounds(21, 225, 660, 35);
        		  contentPane.add(comboBox_4);
		          comboBox_4.addItem(sirket +" Uçak Biletleri"); 
			
		        for(int i=0; i<dizi.length;i++)
		        {
		        	if(dizi[i][0]==null)
		        	{
		        		break;
		        	}
		        	comboBox_4.addItem(dizi[i][0]+ "                       " + dizi[i][1]+ "                   " + dizi[i][2]);
		        	
		        }
		        
		        JButton btnNewButton_1 = new JButton("Bileti Al");
		        btnNewButton_1.addActionListener(new ActionListener() {
			     public void actionPerformed(ActionEvent arg0) {

				String bulunulanyer = (String) comboBox.getSelectedItem();
				String gidilecekyer = (String) comboBox_1.getSelectedItem();
				String tarih = (String) comboBox_2.getSelectedItem();
				String sirket = (String) comboBox_3.getSelectedItem();
				String koltukbilgisi = (String) comboBox_4.getSelectedItem();
				char koltukno2=koltukbilgisi.charAt(0);
                int koltukno=0;
                if(koltukbilgisi.charAt(1)==' ')
			    {
			    	char kb1=koltukbilgisi.charAt(0);
			    	String temp5 = Character.toString(kb1);
			        koltukno =Integer.parseInt(temp5);
			    }
			    else {
			    	
			    	char kb2=koltukbilgisi.charAt(0);
			    	char kb3=koltukbilgisi.charAt(1);
			    	String temp6 = Character.toString(kb2);
			    	temp6=temp6+Character.toString(kb3);
			    	koltukno =Integer.parseInt(temp6);
			    }
                
                if(koltukno2 =='A' || koltukno2 =='B' || koltukno2 =='C')
                {
                	JOptionPane.showMessageDialog(null, "Koltuk Seçenekleri Boþ Býrakýlamaz");
                }
                else
                {
                	bilet_al  biletal = new bilet_al();
				    biletal.biletal(userid, bulunulanyer, gidilecekyer, tarih, sirket, koltukno);
				    setVisible(false);
                }
				
			}
		  });
		        btnNewButton_1.setBounds(249, 425, 200, 30);
		        btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
				btnNewButton_1.setForeground(new Color(0, 0, 204));
		        contentPane.add(btnNewButton_1);
		        
		        
		        
	         }
			}
		});
		btnNewButton.setBounds(249, 170, 200, 30);
		contentPane.add(btnNewButton);		
	}
}
