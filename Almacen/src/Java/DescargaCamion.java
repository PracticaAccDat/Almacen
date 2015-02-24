package Java;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class DescargaCamion extends JFrame {

	private JPanel contentPane;
	String nombre;
	String DNI;

	public DescargaCamion(String nombre, String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
		setTitle("MENU");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnDescargar = new JButton("DESCARGAR");
		btnDescargar.setBounds(387, 158, 101, 23);
		contentPane.add(btnDescargar);

		JButton btnAtras = new JButton("ATR\u00C1S");
		btnAtras.setBounds(387, 192, 101, 23);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnAtras);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(41, 11, 158, 20);
		comboBox.setToolTipText("");
		comboBox.setMaximumRowCount(10);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 42, 320, 418);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		DefaultListModel modelo = new DefaultListModel();

		for(int i = 1; i<=10; i++){
		        modelo.addElement(i);
		}
		list.setModel(modelo);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(387, 226, 89, 23);
		contentPane.add(btnNewButton);
	}
}
