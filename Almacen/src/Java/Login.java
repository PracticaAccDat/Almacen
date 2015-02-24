package Java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;

import Almacen.Empleados;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private HibernateHelper helper = new HibernateHelper();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 273);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnIniciarSesin = new JButton("INICIAR SESI\u00D3N");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (helper.consultarUsuario(textField.getText(),
						textField_1.getText()) == false) {
					Menu menu = new Menu(textField.getText(), textField_1
							.getText());
					menu.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null,
							"El usuario introducido no existe.",
							"ERROR AL INICIAR SESIÓN",
							JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
				}
			}
		});
		btnIniciarSesin.setBounds(96, 129, 135, 23);
		contentPane.add(btnIniciarSesin);

		JButton btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Alta usuarios = new Alta();
				usuarios.setVisible(true);
				dispose();
			}
		});
		btnRegistrarse.setBounds(96, 163, 135, 23);
		contentPane.add(btnRegistrarse);

		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(27, 42, 80, 14);
		contentPane.add(lblNombre);

		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(27, 78, 80, 14);
		contentPane.add(lblDni);

		textField = new JTextField();
		textField.setBounds(117, 39, 186, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(117, 75, 186, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(96, 197, 135, 23);
		contentPane.add(btnSalir);
	}
}
