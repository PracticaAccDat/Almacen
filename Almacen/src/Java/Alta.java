



package Java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Almacen.Empleados;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alta extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JButton btnNuevoUsuario;
	private JButton btnAtrs;
	private JLabel lblDni;
	private JTextField textDni;
	private HibernateHelper helper = new HibernateHelper();
	


	public Alta() {
		setResizable(false);
		setTitle("ALTA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 249);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(10, 11, 69, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("APELLIDOS:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellidos.setBounds(10, 36, 69, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblDireccin = new JLabel("DIRECCI\u00D3N:");
		lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDireccin.setBounds(10, 61, 69, 14);
		contentPane.add(lblDireccin);
		
		JLabel lblTelfono = new JLabel("TEL\u00C9FONO:");
		lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelfono.setBounds(10, 86, 69, 14);
		contentPane.add(lblTelfono);
		
		textNombre = new JTextField();
		textNombre.setBounds(89, 8, 335, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(89, 33, 335, 20);
		contentPane.add(textApellidos);
		textApellidos.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(89, 58, 335, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(89, 83, 335, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		btnNuevoUsuario = new JButton("ALTA");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Empleados empleado = new Empleados(textNombre.getText(),textApellidos.getText(),textDireccion.getText(),textTelefono.getText(),textDni.getText());
					int reply =JOptionPane.showConfirmDialog(null, "Confirme si quiere insertar.","",JOptionPane.YES_NO_OPTION);
					if (reply == JOptionPane.YES_OPTION){
						helper.insertar(empleado);
						textNombre.setText("");
						textApellidos.setText("");
						textDireccion.setText("");
						textTelefono.setText("");
						textDni.setText("");
					}else{
						textNombre.setText("");
						textApellidos.setText("");
						textDireccion.setText("");
						textTelefono.setText("");
						textDni.setText("");
					}
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "El usuario no se pudo crear.", "ERROR AL CREAR", JOptionPane.ERROR_MESSAGE);
					textNombre.setText("");
					textApellidos.setText("");
					textDireccion.setText("");
					textTelefono.setText("");
					textDni.setText("");
				}
			}
		});
		btnNuevoUsuario.setBounds(137, 152, 165, 23);
		contentPane.add(btnNuevoUsuario);
		
		btnAtrs = new JButton("ATR\u00C1S");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnAtrs.setBounds(137, 186, 165, 23);
		contentPane.add(btnAtrs);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDni.setBounds(10, 111, 69, 14);
		contentPane.add(lblDni);
		
		textDni = new JTextField();
		textDni.setBounds(89, 108, 335, 20);
		contentPane.add(textDni);
		textDni.setColumns(10);
	}
}
