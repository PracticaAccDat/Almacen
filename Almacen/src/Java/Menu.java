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
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("INICIO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alta usuarios = new Alta();
				usuarios.setVisible(true);
				dispose();
			}
		});
		btnUsuarios.setBounds(128, 43, 183, 23);
		contentPane.add(btnUsuarios);
		
		JButton btnProductos = new JButton("PRODUCTOS");
		btnProductos.setBounds(128, 77, 183, 23);
		contentPane.add(btnProductos);
		
		JButton btnPedidosRecepciones = new JButton("PEDIDOS / RECEPCIONES");
		btnPedidosRecepciones.setBounds(128, 111, 183, 23);
		contentPane.add(btnPedidosRecepciones);
		
		JButton btnRecepcionUbicacion = new JButton("RECEPCION / UBICACION");
		btnRecepcionUbicacion.setBounds(128, 145, 183, 23);
		contentPane.add(btnRecepcionUbicacion);
		
		JButton btnPickingPacking = new JButton("PICKING / PACKING / EXPEDICI\u00D3N");
		btnPickingPacking.setBounds(128, 179, 183, 23);
		contentPane.add(btnPickingPacking);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(128, 209, 183, 23);
		contentPane.add(btnSalir);
	}
}
