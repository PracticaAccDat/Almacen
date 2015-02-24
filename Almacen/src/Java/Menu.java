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

public class Menu extends JFrame {

	private JPanel contentPane;
	String nombre;
	String DNI;

	public Menu(final String nombre, final String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
		setTitle("MENU");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 220);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnDecargar = new JButton("CARGAR CAMI\u00D3N");
		btnDecargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CargaCamion carga = new CargaCamion(nombre, DNI);
				carga.setVisible(true);
				dispose();
			}
		});
		btnDecargar.setBounds(80, 40, 183, 23);
		contentPane.add(btnDecargar);

		JButton btnCargar = new JButton("DESCARGAR CAMI\u00D3N");
		btnCargar.setBounds(80, 82, 183, 23);
		contentPane.add(btnCargar);

		JButton btnCSesion = new JButton("CERRAR SESI\u00D3N");
		btnCSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnCSesion.setBounds(80, 128, 183, 23);
		contentPane.add(btnCSesion);
	}
}
