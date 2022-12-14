package personelvardiyaotomasyonu1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class personelvardiyaotomasyonu2 extends JFrame {

	private JPanel contentPane;
	private JTextField kadi;
	private JPasswordField sifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personelvardiyaotomasyonu2 frame = new personelvardiyaotomasyonu2();
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
	public personelvardiyaotomasyonu2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sifrelbl = new JLabel("Password");
		sifrelbl.setFont(new Font("Kozuka Mincho Pro M", Font.PLAIN, 17));
		sifrelbl.setBounds(175, 252, 109, 54);
		contentPane.add(sifrelbl);
		
		kadi = new JTextField();
		kadi.setBounds(365, 171, 106, 29);
		contentPane.add(kadi);
		kadi.setColumns(10);
		
		JLabel kadilbl = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		kadilbl.setFont(new Font("Kozuka Mincho Pro M", Font.PLAIN, 17));
		kadilbl.setBounds(175, 164, 109, 54);
		contentPane.add(kadilbl);
		
		JButton girisbtn = new JButton("Giris Yap");
		girisbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] input = sifre.getPassword();
			    String passString = new String(input);  
			    
			    if((kadi.getText().equalsIgnoreCase("admin"))&&(passString.equals("123")))
			    {
			    	adminpanel frame = new adminpanel();
				    frame.setVisible(true);
			     setVisible(false);
			    } 
			    else 
			    {
			     JOptionPane.showMessageDialog(null, "Girdiğiniz Bilgilerde Kullanıcı Bulunamadı.");
			    }
			   
			    
			    
			    }
			    
		});
		girisbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		girisbtn.setFont(new Font("Kozuka Mincho Pro EL", Font.BOLD, 17));
		girisbtn.setBounds(254, 345, 133, 43);
		contentPane.add(girisbtn);
		
		JLabel personelvardiyaotomasyonu = new JLabel("Personel Vardiya Otomasyonu Giris Ekran\u0131");
		personelvardiyaotomasyonu.setFont(new Font("Kozuka Mincho Pro M", Font.PLAIN, 17));
		personelvardiyaotomasyonu.setBounds(151, 63, 342, 54);
		contentPane.add(personelvardiyaotomasyonu);
		
		sifre = new JPasswordField();
		sifre.setBounds(365, 259, 106, 29);
		contentPane.add(sifre);
	}
}
