package Java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;

public class CargaCamion extends JFrame {

	private JPanel contentPane;
	String nombre;
	String DNI;

	public CargaCamion(String nombre, String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
		setTitle("CARGA CAMION");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCargar = new JButton("CARGAR");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnCargar.setBounds(298, 232, 103, 32);
		contentPane.add(btnCargar);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(298, 311, 103, 32);
		contentPane.add(btnAtras);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(20);
		comboBox.setBounds(34, 66, 243, 24);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 102, 243, 293);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(298, 274, 117, 25);
		contentPane.add(btnNewButton);
		
		
	}
}
