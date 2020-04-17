package pct_guiWB11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class MediaGUIcomWB extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomedoaluno;
	private JTextField tfNota1;
	private JTextField tfNota2;
	private JTextField tfLista;
	private JTextField tfMediaGeral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MediaGUIcomWB frame = new MediaGUIcomWB();
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
	public MediaGUIcomWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNomedoaluno = new JLabel("Nome do aluno");
		lbNomedoaluno.setHorizontalAlignment(SwingConstants.LEFT);
		lbNomedoaluno.setBounds(10, 11, 71, 14);
		contentPane.add(lbNomedoaluno);
		
		tfNomedoaluno = new JTextField();
		tfNomedoaluno.setBounds(86, 8, 86, 20);
		contentPane.add(tfNomedoaluno);
		tfNomedoaluno.setColumns(10);
		
		JLabel lbNota1 = new JLabel("Nota 1");
		lbNota1.setBounds(10, 36, 46, 14);
		contentPane.add(lbNota1);
		
		tfNota1 = new JTextField();
		tfNota1.setBackground(SystemColor.text);
		tfNota1.setBounds(86, 33, 86, 20);
		contentPane.add(tfNota1);
		tfNota1.setColumns(10);
		
		JLabel lbNota2 = new JLabel("Nota 2");
		lbNota2.setBounds(10, 61, 46, 14);
		contentPane.add(lbNota2);
		
		tfNota2 = new JTextField();
		tfNota2.setBounds(86, 58, 86, 20);
		contentPane.add(tfNota2);
		tfNota2.setColumns(10);
		
		JLabel lbLista = new JLabel("Lista");
		lbLista.setBounds(10, 86, 46, 14);
		contentPane.add(lbLista);
		
		tfLista = new JTextField();
		tfLista.setBounds(86, 83, 86, 20);
		contentPane.add(tfLista);
		tfLista.setColumns(10);
		
		JLabel lbMediaGeral = new JLabel("M\u00E9dia Geral");
		lbMediaGeral.setBounds(10, 111, 56, 14);
		contentPane.add(lbMediaGeral);
		
		tfMediaGeral = new JTextField();
		tfMediaGeral.setBounds(86, 108, 86, 20);
		contentPane.add(tfMediaGeral);
		tfMediaGeral.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setMnemonic('C');
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				float Nota1, Nota2, Lista, Calcular = 0;
				
				Nota1 = Float.parseFloat(tfNota1.getText());
				Nota2 = Float.parseFloat(tfNota2.getText());
				Lista = Float.parseFloat(tfLista.getText());
				Calcular = Nota1 + Nota2/Lista;
				tfMediaGeral.setText(String.valueOf(Calcular));
				
			}
		});
		btnCalcular.setBounds(226, 11, 89, 44);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setMnemonic('L');
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				tfNomedoaluno.setText("");
				tfNota1.setText("");
				tfNota2.setText("");
				tfLista.setText("");
				tfMediaGeral.setText("");
			}
		});
		btnLimpar.setBounds(226, 61, 89, 39);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setMnemonic('S');
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		btnSair.setBounds(226, 102, 89, 39);
		contentPane.add(btnSair);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lbNomedoaluno, tfNomedoaluno, lbNota1, tfNota1, lbNota2, tfNota2, lbLista, tfLista, lbMediaGeral, tfMediaGeral, btnCalcular, btnLimpar, btnSair}));
	}
}
