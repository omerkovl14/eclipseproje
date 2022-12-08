package personelvardiyaotomasyonu1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class personelvardiyaotomasyonu2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		setBounds(100, 100, 511, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Kozuka Mincho Pro M", Font.PLAIN, 17));
		lblNewLabel.setBounds(86, 234, 109, 54);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(357, 244, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		textField = new JTextField();
		textField.setBounds(232, 135, 106, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		lblNewLabel_1.setFont(new Font("Kozuka Mincho Pro M", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(86, 128, 109, 54);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(232, 241, 106, 29);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Giris Yap");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Kozuka Mincho Pro EL", Font.BOLD, 17));
		btnNewButton.setBounds(176, 322, 133, 43);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Personel Vardiya Otomasyonu Giris Ekran\u0131");
		lblNewLabel_1_1.setFont(new Font("Kozuka Mincho Pro M", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(75, 45, 342, 54);
		contentPane.add(lblNewLabel_1_1);
	}
}
