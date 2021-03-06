package vista.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.vo.PersonaVo;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultarPersonaGui extends JFrame implements ActionListener {
	
	private JPanel miPanel;
	private Coordinador miCoordinador;
	private JTextField textDocumento;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTextField textProfesion;
	private JTextField textTipo;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAnio;
	private JTextField textCiudad;
	private JTextField textDepartamento;
	private JTextField textPais;
	private JLabel etiTitulo;
	private JLabel etiDocumento;
	private JLabel etiNombre;
	private JLabel etiTelefono;
	private JLabel etiProfesion;
	private JLabel etiTipo;
	private JLabel etiDatosNaci;
	private JLabel etiFecha;
	private JLabel etiCeparador;
	private JLabel etiCeparador_1;
	private JLabel etiCiudad;
	private JLabel etiDepartamento;
	private JLabel etiPais;
	private JButton btnCargar;
	private JButton btnCancelar;
	
	
	public ConsultarPersonaGui() {
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		miPanel = new JPanel();
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,442);
		setResizable(false);
		setTitle("Clinica Veterinaria");
		setLocationRelativeTo(null);
		
		etiTitulo = new JLabel("Consultar Personas");
		etiTitulo.setForeground(new Color(65, 105, 225));
		etiTitulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiTitulo.setBounds(195, 21, 176, 23);
		getContentPane().add(etiTitulo);
		
		etiDocumento = new JLabel("Documento");
		etiDocumento.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiDocumento.setBounds(239, 72, 87, 23);
		getContentPane().add(etiDocumento);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(324, 75, 102, 20);
		textDocumento.setColumns(10);
		getContentPane().add(textDocumento);
		
		
		btnCargar = new JButton("Consultar");
		btnCargar.setBounds(436, 74, 102, 23);
		btnCargar.addActionListener(this);
		getContentPane().add(btnCargar);
		
		etiNombre = new JLabel("Nombre:");
		etiNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		etiNombre.setBounds(27, 118, 58, 20);
		getContentPane().add(etiNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(95, 119, 464, 20);
		textNombre.setColumns(10);
		getContentPane().add(textNombre);
		
		
		etiTelefono = new JLabel("Telefono:");
		etiTelefono.setFont(new Font("Tahoma", Font.BOLD, 13));
		etiTelefono.setBounds(27, 170, 65, 20);
		getContentPane().add(etiTelefono);
		
		etiProfesion = new JLabel("Profesion:");
		etiProfesion.setFont(new Font("Tahoma", Font.BOLD, 13));
		etiProfesion.setBounds(206, 170, 68, 20);
		getContentPane().add(etiProfesion);
		
		etiTipo = new JLabel("Tipo:");
		etiTipo.setFont(new Font("Tahoma", Font.BOLD, 13));
		etiTipo.setBounds(433, 170, 38, 20);
		getContentPane().add(etiTipo);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(95, 171, 101, 20);
		textTelefono.setColumns(10);
		getContentPane().add(textTelefono);
		
		textProfesion = new JTextField();
		textProfesion.setBounds(284, 171, 139, 20);
		textProfesion.setColumns(10);
		getContentPane().add(textProfesion);
		
		textTipo = new JTextField();
		textTipo.setBounds(481, 171, 78, 20);
		textTipo.setColumns(10);
		getContentPane().add(textTipo);
		
		etiDatosNaci = new JLabel("Datos Nacimiento");
		etiDatosNaci.setForeground(new Color(65, 105, 225));
		etiDatosNaci.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiDatosNaci.setBounds(27, 217, 122, 23);
		getContentPane().add(etiDatosNaci);
		
		etiFecha = new JLabel("Fecha (dd/mm/aa):");
		etiFecha.setFont(new Font("Tahoma", Font.BOLD, 12));
		etiFecha.setBounds(27, 251, 122, 21);
		getContentPane().add(etiFecha);
		
		textDia = new JTextField();
		textDia.setBounds(152, 251, 28, 20);
		textDia.setColumns(10);
		getContentPane().add(textDia);
		
		textMes = new JTextField();
		textMes.setColumns(10);
		textMes.setBounds(207, 252, 29, 20);
		getContentPane().add(textMes);
		
		textAnio = new JTextField();
		textAnio.setColumns(10);
		textAnio.setBounds(261, 252, 48, 20);
		getContentPane().add(textAnio);
		
		etiCeparador = new JLabel("/");
		etiCeparador.setFont(new Font("Tahoma", Font.BOLD, 16));
		etiCeparador.setBounds(187, 249, 9, 23);
		getContentPane().add(etiCeparador);
		
		etiCeparador_1 = new JLabel("/");
		etiCeparador_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		etiCeparador_1.setBounds(246, 249, 9, 23);
		getContentPane().add(etiCeparador_1);
		
		etiCiudad = new JLabel("Ciudad:");
		etiCiudad.setFont(new Font("Tahoma", Font.BOLD, 12));
		etiCiudad.setBounds(27, 296, 58, 20);
		getContentPane().add(etiCiudad);
		
		textCiudad = new JTextField();
		textCiudad.setBounds(95, 298, 101, 20);
		textCiudad.setColumns(10);
		getContentPane().add(textCiudad);
		
		etiDepartamento = new JLabel("Departamento:");
		etiDepartamento.setFont(new Font("Tahoma", Font.BOLD, 12));
		etiDepartamento.setBounds(206, 296, 93, 20);
		getContentPane().add(etiDepartamento);
		
		textDepartamento = new JTextField();
		textDepartamento.setBounds(305, 297, 102, 20);
		textDepartamento.setColumns(10);
		getContentPane().add(textDepartamento);
		
		etiPais = new JLabel("Pais:");
		etiPais.setFont(new Font("Tahoma", Font.BOLD, 12));
		etiPais.setBounds(417, 296, 38, 20);
		getContentPane().add(etiPais);
		
		textPais = new JTextField();
		textPais.setBounds(457, 297, 102, 20);
		textPais.setColumns(10);
		getContentPane().add(textPais);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancelar.setBounds(457, 355, 102, 25);
		getContentPane().add(btnCancelar);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCargar ) {
			
			Long idDocumento=Long.parseLong(textDocumento.getText());
			PersonaVo p=miCoordinador.setConsultarPersona(idDocumento);
			
			if (p!=null) {
				
				p.setNacimiento(miCoordinador.consultarNacimiento(p.getNacimiento().getIdNacimiento()));
				System.out.println(p);				
				textNombre.setText(p.getNombre());
				textProfesion.setText(p.getProfesion());
				textTelefono.setText(p.getTelefono());
				textTipo.setText(p.getTipo()+"");
				
				textCiudad.setText(p.getNacimiento().getCiudadNacimiento());
				textDepartamento.setText(p.getNacimiento().getDepartamentoNacimiento());
				textPais.setText(p.getNacimiento().getPaisNacimiento());
				textDia.setText(p.getNacimiento().getFechaNacimiento().getDayOfMonth()+"");
				textMes.setText(p.getNacimiento().getFechaNacimiento().getMonthValue()+"");
				textAnio.setText(p.getNacimiento().getFechaNacimiento().getYear()+"");
					
			}else {
				JOptionPane.showMessageDialog(null,"No se encuentra la persona, verifique el documento","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
			}			
		}


	}
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
}
