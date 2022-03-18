package pacotepesnsamento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;

public class Pensamento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pensamento frame = new Pensamento();
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
	public Pensamento() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPensamento = new JLabel("<html>Esto pensando em um numero\r\nentre 1 e 5, tente adivinhar.</html>");
		lblPensamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblPensamento.setToolTipText("");
		lblPensamento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPensamento.setBounds(23, 11, 232, 71);
		contentPane.add(lblPensamento);
		
		JSpinner spi = new JSpinner();
		spi.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spi.setBounds(54, 94, 123, 35);
		contentPane.add(spi);
		
		
		JButton btnAdvinhar = new JButton("Come\u00E7ar");
		btnAdvinhar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAdvinhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int n = (int) (1 + Math.random() * (5 - 1));
				int p = Integer.parseInt(spi.getValue().toString());
				String f1 = "Acertou";
				String f2 = ("Errou, eu pensei em " + n);
				String r = (n==p)?f1:f2;
				lblPensamento.setText(r);
			}
		});
		btnAdvinhar.setBounds(75, 155, 102, 35);
		contentPane.add(btnAdvinhar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/imagem/download.png"));
		lblNewLabel.setBounds(221, 11, 258, 243);
		contentPane.add(lblNewLabel);
		
		
	}
}
